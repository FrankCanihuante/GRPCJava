// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services.proto

package io.grpc.benchmarks.proto;

public final class Services {
  private Services() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016services.proto\022\014grpc.testing\032\016messages" +
      ".proto\032\rcontrol.proto2\246\003\n\020BenchmarkServi" +
      "ce\022F\n\tUnaryCall\022\033.grpc.testing.SimpleReq" +
      "uest\032\034.grpc.testing.SimpleResponse\022N\n\rSt" +
      "reamingCall\022\033.grpc.testing.SimpleRequest" +
      "\032\034.grpc.testing.SimpleResponse(\0010\001\022R\n\023St" +
      "reamingFromClient\022\033.grpc.testing.SimpleR" +
      "equest\032\034.grpc.testing.SimpleResponse(\001\022R" +
      "\n\023StreamingFromServer\022\033.grpc.testing.Sim" +
      "pleRequest\032\034.grpc.testing.SimpleResponse" +
      "0\001\022R\n\021StreamingBothWays\022\033.grpc.testing.S" +
      "impleRequest\032\034.grpc.testing.SimpleRespon" +
      "se(\0010\0012\227\002\n\rWorkerService\022E\n\tRunServer\022\030." +
      "grpc.testing.ServerArgs\032\032.grpc.testing.S" +
      "erverStatus(\0010\001\022E\n\tRunClient\022\030.grpc.test" +
      "ing.ClientArgs\032\032.grpc.testing.ClientStat" +
      "us(\0010\001\022B\n\tCoreCount\022\031.grpc.testing.CoreR" +
      "equest\032\032.grpc.testing.CoreResponse\0224\n\nQu" +
      "itWorker\022\022.grpc.testing.Void\032\022.grpc.test" +
      "ing.Void2^\n\030ReportQpsScenarioService\022B\n\016" +
      "ReportScenario\022\034.grpc.testing.ScenarioRe" +
      "sult\032\022.grpc.testing.VoidB$\n\030io.grpc.benc" +
      "hmarks.protoB\010Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grpc.benchmarks.proto.Messages.getDescriptor(),
          io.grpc.benchmarks.proto.Control.getDescriptor(),
        }, assigner);
    io.grpc.benchmarks.proto.Messages.getDescriptor();
    io.grpc.benchmarks.proto.Control.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
