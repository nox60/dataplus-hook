package com.dataxplus.hook.utils;


import com.alibaba.datax.common.spi.Hook;
import com.alibaba.datax.common.util.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class App implements Hook {
    private static final Logger log = LoggerFactory.getLogger(Hook.class);

    public static void main(String[] args) {
        System.out.println("");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void invoke(Configuration configuration, Map<String, Number> map) {
        log.info(configuration.toJSON());
        log.info("----------------------------------------------");
        map.forEach((key, value) -> {
            log.info(key+", "+value);
        });
        log.info("----------------------------------------------");
        String result = HttpReq.postMsg("http://localhost:8080/dataxs/jobReport", configuration.toJSON());
    }
}
