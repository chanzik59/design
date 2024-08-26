package com.example.design;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
class DesignApplicationTests {

    @Test
    void contextLoads() {
        log.info("info");
        log.debug("debug");
        log.warn("warn2");
        log.trace("trace2");
        log.error("error2");
    }

}
