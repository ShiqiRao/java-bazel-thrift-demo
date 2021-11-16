# bazel-thrift-demo

## Install Thrift
brew install thrift

## Generate Java Code With Thrift
thrift -r -gen java Hello.thrift

## Build
bazel build //:server_deploy.jar
bazel build //:client_deploy.jar

## Run
java -jar bazel-bin/server_deploy.jar
java -jar bazel-bin/client_deploy.jar

## Result
The client's terminal will display:
```text
received:Hi!
```
