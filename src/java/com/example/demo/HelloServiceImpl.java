package com.example.demo;

import service.demo.Hello;

public class HelloServiceImpl implements Hello.Iface {
    public String helloString(String para) {
        return "received:" + para;
    }
}