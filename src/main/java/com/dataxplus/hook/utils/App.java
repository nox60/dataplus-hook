package com.dataxplus.hook.utils;


import com.alibaba.datax.common.spi.Hook;
import com.alibaba.datax.common.util.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class App implements Hook {
    private static final Logger log = LoggerFactory.getLogger(Hook.class);

    public static void main(String[] args) {
//        if (args != null && args.length > 0) {
//            for (int i = 0; i < args.length; i++) {
//                System.out.println(args[i]);
//            }
//        }

        try {
            fileWriterMethod("D:\\backup\\eeee.sss", "asdf");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Hello World!！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        System.out.println("Hello World!！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        System.out.println("Hello World!！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        System.out.println("Hello World!！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        System.out.println("Hello World!！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void invoke(Configuration configuration, Map<String, Number> map) {
        if (configuration != null ) {
           System.out.println(configuration);
        }
        try {
            fileWriterMethod("/opt/local/tempdir", configuration.toJSON());
        } catch (IOException e) {
            e.printStackTrace();
        }

        log.info("2222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        log.info("2222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        log.info("2222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        log.info("2222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        log.info("2222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        log.info("2222222222222222222222222222222222222222222222222222222222222222222222222222222222");

        try {
            throw new Exception("sadfasdfasdfasdfasdfasdfasdfsadf");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello 111111!！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
    }

    public static void fileWriterMethod(String filepath, String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filepath)) {
            fileWriter.append("asdfasdfasdfasdfasdfasdfasdf");
            fileWriter.append("asdfasdfasdfasdfasdfasdfasdf");
            fileWriter.append("asdfasdfasdfasdfasdfasdfasdf");
            fileWriter.append("asdfasdfasdfasdfasdfasdfasdf");

            fileWriter.append(content);
        }
    }


}
