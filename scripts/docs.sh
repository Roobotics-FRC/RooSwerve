set -o errexit

./gradlew javadoc

git clone --branch=gh-pages https://github.com/Roobotics-FRC/RooSwerve.git ghp
VERSION=$(./gradlew version -q) #This SHOULD NOT have a "v" as that is added when needed.

DIR=ghp/docs/v"$VERSION"
if [ -e "$DIR" ]; then rm -rf "$DIR"; fi
mkdir "$DIR"
mv build/docs/javadoc/* "$DIR"

cd ghp

bash ../scripts/updateLatestDocs.sh "$VERSION"

git config --local user.name "AFS RooBotics"
git config --local user.email "AFSroobotics@abingtonfriends.net"
git add .
git commit -m "Update documentation"
git remote set-url origin https://"${GITHUB_TOKEN}"@github.com/Roobotics-FRC/RooSwerve.git
git push