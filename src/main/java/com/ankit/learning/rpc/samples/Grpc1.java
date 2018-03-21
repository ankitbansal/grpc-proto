// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/grpc1.proto

package com.ankit.learning.rpc.samples;

public final class Grpc1 {
  private Grpc1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_samples_Point_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_samples_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_samples_Rectangle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_samples_Rectangle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_samples_Feature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_samples_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_samples_FeatureDatabase_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_samples_FeatureDatabase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_samples_RouteNote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_samples_RouteNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_samples_RouteSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_samples_RouteSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020grpc/grpc1.proto\022\007samples\",\n\005Point\022\020\n\010" +
      "latitude\030\001 \001(\005\022\021\n\tlongitude\030\002 \001(\005\"C\n\tRec" +
      "tangle\022\032\n\002lo\030\001 \001(\0132\016.samples.Point\022\032\n\002hi" +
      "\030\002 \001(\0132\016.samples.Point\"9\n\007Feature\022\014\n\004nam" +
      "e\030\001 \001(\t\022 \n\010location\030\002 \001(\0132\016.samples.Poin" +
      "t\"4\n\017FeatureDatabase\022!\n\007feature\030\001 \003(\0132\020." +
      "samples.Feature\">\n\tRouteNote\022 \n\010location" +
      "\030\001 \001(\0132\016.samples.Point\022\017\n\007message\030\002 \001(\t\"" +
      "b\n\014RouteSummary\022\023\n\013point_count\030\001 \001(\005\022\025\n\r" +
      "feature_count\030\002 \001(\005\022\020\n\010distance\030\003 \001(\005\022\024\n" +
      "\014elapsed_time\030\004 \001(\0052\353\001\n\010RPCGuide\0220\n\nGetF" +
      "eature\022\016.samples.Point\032\020.samples.Feature" +
      "\"\000\0228\n\014ListFeatures\022\022.samples.Rectangle\032\020" +
      ".samples.Feature\"\0000\001\0228\n\013RecordRoute\022\016.sa" +
      "mples.Point\032\025.samples.RouteSummary\"\000(\001\0229" +
      "\n\tRouteChat\022\022.samples.RouteNote\032\022.sample" +
      "s.RouteNote\"\000(\0010\001B\"\n\036com.ankit.learning." +
      "rpc.samplesP\001b\006proto3"
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
        }, assigner);
    internal_static_samples_Point_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_samples_Point_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_samples_Point_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
    internal_static_samples_Rectangle_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_samples_Rectangle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_samples_Rectangle_descriptor,
        new java.lang.String[] { "Lo", "Hi", });
    internal_static_samples_Feature_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_samples_Feature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_samples_Feature_descriptor,
        new java.lang.String[] { "Name", "Location", });
    internal_static_samples_FeatureDatabase_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_samples_FeatureDatabase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_samples_FeatureDatabase_descriptor,
        new java.lang.String[] { "Feature", });
    internal_static_samples_RouteNote_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_samples_RouteNote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_samples_RouteNote_descriptor,
        new java.lang.String[] { "Location", "Message", });
    internal_static_samples_RouteSummary_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_samples_RouteSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_samples_RouteSummary_descriptor,
        new java.lang.String[] { "PointCount", "FeatureCount", "Distance", "ElapsedTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}