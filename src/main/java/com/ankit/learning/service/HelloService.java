package com.ankit.learning.service;

import com.ankit.learning.rpc.hello.HelloRequest;
import com.ankit.learning.rpc.hello.HelloResponse;
import com.ankit.learning.rpc.hello.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * Created by anbabans on 3/21/2018.
 */
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(
            HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        String greeting = new StringBuilder()
                .append("Hello, ")
                .append(request.getFirstName())
                .append(" ")
                .append(request.getLastName())
                .toString();

        HelloResponse response = HelloResponse.newBuilder()
                .setGreeting(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
