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

git config --global user.name "AFS RooBotics"
git config --global user.email "AFSroobotics@abingtonfriends.net"
git add .
git commit -m "Update documentation"
git remote set-url origin https://"${GH_TOKEN}"@github.com/Roobotivs-FRC/RooSwerve.git
git push