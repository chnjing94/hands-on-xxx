package com.demo.spi.dubbo;

public class PrintServiceImpl0 implements PrintService {
    @Override
    public void printInfo() {
        System.out.println("Dubbo SPI PrintServiceImpl0");
    }
}
