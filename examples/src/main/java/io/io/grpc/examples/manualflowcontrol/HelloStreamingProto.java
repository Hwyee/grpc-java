// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_streaming.proto

// Protobuf Java Version: 3.25.1
package io.io.grpc.examples.manualflowcontrol;

public final class HelloStreamingProto {
  private HelloStreamingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manualflowcontrol_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manualflowcontrol_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_manualflowcontrol_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_manualflowcontrol_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025hello_streaming.proto\022\021manualflowcontr" +
      "ol\"\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\"\035\n\nHell" +
      "oReply\022\017\n\007message\030\001 \001(\t2m\n\020StreamingGree" +
      "ter\022Y\n\021SayHelloStreaming\022\037.manualflowcon" +
      "trol.HelloRequest\032\035.manualflowcontrol.He" +
      "lloReply\"\000(\0010\001BB\n\"io.grpc.examples.manua" +
      "lflowcontrolB\023HelloStreamingProtoP\001\242\002\004HL" +
      "WSb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_manualflowcontrol_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_manualflowcontrol_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manualflowcontrol_HelloRequest_descriptor,
        new String[] { "Name", });
    internal_static_manualflowcontrol_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_manualflowcontrol_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_manualflowcontrol_HelloReply_descriptor,
        new String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
