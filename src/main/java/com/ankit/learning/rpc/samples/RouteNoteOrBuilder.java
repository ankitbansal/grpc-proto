// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/grpc1.proto

package com.ankit.learning.rpc.samples;

public interface RouteNoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:samples.RouteNote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>.samples.Point location = 1;</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>.samples.Point location = 1;</code>
   */
  com.ankit.learning.rpc.samples.Point getLocation();
  /**
   * <pre>
   * The location from which the message is sent.
   * </pre>
   *
   * <code>.samples.Point location = 1;</code>
   */
  com.ankit.learning.rpc.samples.PointOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * The message to be sent.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The message to be sent.
   * </pre>
   *
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
