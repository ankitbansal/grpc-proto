package com.ankit.learning.client;

import com.ankit.learning.rpc.hello.HelloRequest;
import com.ankit.learning.rpc.hello.HelloResponse;
import com.ankit.learning.rpc.hello.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Created by anbabans on 3/21/2018.
 */
public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext(true)
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("Baeldung")
                .setLastName("gRPC")
                .build());
        System.out.println(helloResponse.getGreeting());
        channel.shutdown();
    }
}
