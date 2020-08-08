package com.demo.impl;

import com.demo.api.EchoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@DubboService
public class EchoServiceImplAnnotation implements EchoService {

    @Override
    public String echo(String message) {
        String now = new SimpleDateFormat("HH:mm:ss").format(new Date());

        System.out.println("[" + now + "] Annotation Hello " + message + ", request from consumer: " + RpcContext.getContext().getRemoteAddressString());

        return message;
    }
}
