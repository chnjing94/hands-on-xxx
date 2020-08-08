package com.demo;

import com.demo.api.EchoService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

public class EchoAPIConsumer {
    public static void main(String[] args) {
        ReferenceConfig<EchoService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("first-dubbo-consumer"));
        reference.setRegistry(new RegistryConfig("zookeeper://localhost:2181"));
        reference.setInterface(EchoService.class);
        EchoService service = reference.get();
        String message = service.echo("Hello CJ!");
        System.out.println(message);
    }
}
