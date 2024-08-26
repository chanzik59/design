package com.example.design;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
class DesignApplicationTests {

    @Test
    void contextLoads() {
        log.info("info1");
        log.debug("debug1");
        log.warn("warn1");
        log.trace("trace");
        log.error("error");
    }

}
