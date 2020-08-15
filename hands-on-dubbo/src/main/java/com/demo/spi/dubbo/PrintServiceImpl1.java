package com.demo.spi.dubbo;

public class PrintServiceImpl1 implements PrintService {
    @Override
    public void printInfo() {
        System.out.println("Dubbo SPI PrintServiceImpl1");
    }
}
