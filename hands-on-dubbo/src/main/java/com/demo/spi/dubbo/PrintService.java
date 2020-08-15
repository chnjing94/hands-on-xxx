package com.demo.spi.dubbo;

import org.apache.dubbo.common.extension.SPI;

@SPI("impl0")
public interface PrintService {
    void printInfo();
}
