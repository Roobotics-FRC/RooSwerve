set -o errexit

./gradlew jar

git clone https://github.com/Roobotics-FRC/RooMaven.git
cd RooMaven

YOUR_GROUP=frc.team4373
YOUR_ARTIFACT=rooswerve
YOUR_VERSION="${TRAVIS_TAG:1}"
YOUR_JAR_FILE=../build/libs/RooSwerve-$YOUR_VERSION.jar

mvn install:install-file -DgroupId=$YOUR_GROUP -DartifactId=$YOUR_ARTIFACT -Dversion=$YOUR_VERSION -Dfile=$YOUR_JAR_FILE -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=. -DcreateChecksum=true

git config --local user.name "AFS RooBotics"
git config --local user.email "AFSroobotics@abingtonfriends.net"

git add .
git commit -am "Update RooSwerve to version $YOUR_VERSION"
git push "https://${GITHUB_TOKEN}@github.com/Roobotics-FRC/RooMaven.git"