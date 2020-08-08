package com.demo.action;

import com.demo.api.EchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class AnnotationAction {

    @DubboReference
    private EchoService echoService;

    public String echo(String name) {
        return echoService.echo(name);
    }
}
