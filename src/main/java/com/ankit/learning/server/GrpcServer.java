package com.ankit.learning.server;

import com.ankit.learning.service.HelloService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * Created by anbabans on 3/21/2018.
 */
public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new HelloService()).build();

        server.start();
        server.awaitTermination();
    }
}
