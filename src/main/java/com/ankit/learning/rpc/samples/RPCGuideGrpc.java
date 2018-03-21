package com.ankit.learning.rpc.samples;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: grpc/grpc1.proto")
public final class RPCGuideGrpc {

  private RPCGuideGrpc() {}

  public static final String SERVICE_NAME = "samples.RPCGuide";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ankit.learning.rpc.samples.Point,
      com.ankit.learning.rpc.samples.Feature> METHOD_GET_FEATURE =
      io.grpc.MethodDescriptor.<com.ankit.learning.rpc.samples.Point, com.ankit.learning.rpc.samples.Feature>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "samples.RPCGuide", "GetFeature"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ankit.learning.rpc.samples.Point.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ankit.learning.rpc.samples.Feature.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ankit.learning.rpc.samples.Rectangle,
      com.ankit.learning.rpc.samples.Feature> METHOD_LIST_FEATURES =
      io.grpc.MethodDescriptor.<com.ankit.learning.rpc.samples.Rectangle, com.ankit.learning.rpc.samples.Feature>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "samples.RPCGuide", "ListFeatures"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ankit.learning.rpc.samples.Rectangle.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ankit.learning.rpc.samples.Feature.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ankit.learning.rpc.samples.Point,
      com.ankit.learning.rpc.samples.RouteSummary> METHOD_RECORD_ROUTE =
      io.grpc.MethodDescriptor.<com.ankit.learning.rpc.samples.Point, com.ankit.learning.rpc.samples.RouteSummary>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "samples.RPCGuide", "RecordRoute"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ankit.learning.rpc.samples.Point.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ankit.learning.rpc.samples.RouteSummary.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ankit.learning.rpc.samples.RouteNote,
      com.ankit.learning.rpc.samples.RouteNote> METHOD_ROUTE_CHAT =
      io.grpc.MethodDescriptor.<com.ankit.learning.rpc.samples.RouteNote, com.ankit.learning.rpc.samples.RouteNote>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "samples.RPCGuide", "RouteChat"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ankit.learning.rpc.samples.RouteNote.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ankit.learning.rpc.samples.RouteNote.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RPCGuideStub newStub(io.grpc.Channel channel) {
    return new RPCGuideStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RPCGuideBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RPCGuideBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RPCGuideFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RPCGuideFutureStub(channel);
  }

  /**
   */
  public static abstract class RPCGuideImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFeature(com.ankit.learning.rpc.samples.Point request,
        io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FEATURE, responseObserver);
    }

    /**
     */
    public void listFeatures(com.ankit.learning.rpc.samples.Rectangle request,
        io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_FEATURES, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.RouteSummary> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_RECORD_ROUTE, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.RouteNote> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ROUTE_CHAT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_FEATURE,
            asyncUnaryCall(
              new MethodHandlers<
                com.ankit.learning.rpc.samples.Point,
                com.ankit.learning.rpc.samples.Feature>(
                  this, METHODID_GET_FEATURE)))
          .addMethod(
            METHOD_LIST_FEATURES,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.ankit.learning.rpc.samples.Rectangle,
                com.ankit.learning.rpc.samples.Feature>(
                  this, METHODID_LIST_FEATURES)))
          .addMethod(
            METHOD_RECORD_ROUTE,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.ankit.learning.rpc.samples.Point,
                com.ankit.learning.rpc.samples.RouteSummary>(
                  this, METHODID_RECORD_ROUTE)))
          .addMethod(
            METHOD_ROUTE_CHAT,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.ankit.learning.rpc.samples.RouteNote,
                com.ankit.learning.rpc.samples.RouteNote>(
                  this, METHODID_ROUTE_CHAT)))
          .build();
    }
  }

  /**
   */
  public static final class RPCGuideStub extends io.grpc.stub.AbstractStub<RPCGuideStub> {
    private RPCGuideStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RPCGuideStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPCGuideStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RPCGuideStub(channel, callOptions);
    }

    /**
     */
    public void getFeature(com.ankit.learning.rpc.samples.Point request,
        io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.Feature> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFeatures(com.ankit.learning.rpc.samples.Rectangle request,
        io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.Feature> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIST_FEATURES, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.RouteSummary> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_RECORD_ROUTE, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.RouteNote> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_ROUTE_CHAT, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RPCGuideBlockingStub extends io.grpc.stub.AbstractStub<RPCGuideBlockingStub> {
    private RPCGuideBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RPCGuideBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPCGuideBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RPCGuideBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ankit.learning.rpc.samples.Feature getFeature(com.ankit.learning.rpc.samples.Point request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FEATURE, getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.ankit.learning.rpc.samples.Feature> listFeatures(
        com.ankit.learning.rpc.samples.Rectangle request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIST_FEATURES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RPCGuideFutureStub extends io.grpc.stub.AbstractStub<RPCGuideFutureStub> {
    private RPCGuideFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RPCGuideFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RPCGuideFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RPCGuideFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ankit.learning.rpc.samples.Feature> getFeature(
        com.ankit.learning.rpc.samples.Point request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE = 0;
  private static final int METHODID_LIST_FEATURES = 1;
  private static final int METHODID_RECORD_ROUTE = 2;
  private static final int METHODID_ROUTE_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RPCGuideImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RPCGuideImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((com.ankit.learning.rpc.samples.Point) request,
              (io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.Feature>) responseObserver);
          break;
        case METHODID_LIST_FEATURES:
          serviceImpl.listFeatures((com.ankit.learning.rpc.samples.Rectangle) request,
              (io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.Feature>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRoute(
              (io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.RouteSummary>) responseObserver);
        case METHODID_ROUTE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeChat(
              (io.grpc.stub.StreamObserver<com.ankit.learning.rpc.samples.RouteNote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class RPCGuideDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ankit.learning.rpc.samples.Grpc1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RPCGuideGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RPCGuideDescriptorSupplier())
              .addMethod(METHOD_GET_FEATURE)
              .addMethod(METHOD_LIST_FEATURES)
              .addMethod(METHOD_RECORD_ROUTE)
              .addMethod(METHOD_ROUTE_CHAT)
              .build();
        }
      }
    }
    return result;
  }
}
