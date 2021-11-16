load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_library(
    name="java-maven-lib",
    srcs = glob(["**/*.java"]),
    deps = [
        "@maven//:org_apache_thrift_libthrift",
        "@maven//:org_slf4j_slf4j_api",
        "@maven//:javax_annotation_javax_annotation_api",
        "@maven//:ch_qos_logback_logback_classic",
    ]
)

java_binary(
    name = "client",
    main_class = "com.example.demo.HelloServiceClient",
    runtime_deps=[":java-maven-lib"]
)


java_binary(
    name = "server",
    main_class = "com.example.demo.HelloServiceServer",
    runtime_deps = [":java-maven-lib"]
)