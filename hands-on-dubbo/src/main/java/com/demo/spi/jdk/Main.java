package com.demo.spi.jdk;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<PrintService> loader = ServiceLoader.load(PrintService.class);

        for (PrintService printService : loader) {
            printService.printInfo();
        }
    }
}
