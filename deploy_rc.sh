echo "Begin deploy prerelease"
echo "Begin deploy prerelease"
echo "$CI_PULL_REQUEST"
echo "Begin deploy prerelease"
echo "Begin deploy prerelease"
echo "$CI_PULL_REQUESTS"
echo "Begin deploy prerelease"
echo "Begin deploy prerelease"
echo "$CIRCLE_TAG"
echo "Begin deploy feature"


echo "Begin deploy Release Candidate"

export RC_NUMBER=$(echo $CIRCLE_TAG| cut -d'c' -f 2)
echo $RC_NUMBER

./gradlew assembleRcDebug

