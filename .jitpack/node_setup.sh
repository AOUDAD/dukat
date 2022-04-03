./gradlew -q exportNodeVersion
export NODE_HOME="$HOME/.gradle/node-distrib/unpacked/node-v$(cat .jitpack/node_version.txt)-linux-x64/bin"
echo "Set NODE_HOME to $NODE_HOME"
export PATH="$NODE_HOME:$PATH"