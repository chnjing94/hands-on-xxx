package com.demo.spi.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Main {
    public static void main(String[] args) {
        PrintService printService = ExtensionLoader.getExtensionLoader((PrintService.class)).getDefaultExtension();

        printService.printInfo();
    }
}
