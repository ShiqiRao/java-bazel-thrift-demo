package com.example.demo;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import service.demo.Hello;

public class HelloServiceClient {
    public static void main(String[] args) {
        System.out.println("Client starting....");
        try (TTransport transport = new TSocket("localhost", 9898)) {
            TProtocol protocol = new TBinaryProtocol(transport);
            Hello.Client client = new Hello.Client(protocol);
            transport.open();
            String result = client.helloString("Hi!");
            System.out.println(result);
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}