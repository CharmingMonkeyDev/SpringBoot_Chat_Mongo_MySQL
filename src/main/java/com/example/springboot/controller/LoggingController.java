package com.example.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoggingController {
    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String Index() {
        logger.trace("A Trace Message");
        logger.debug("A Debug Message");
        logger.info("A Info Message");
        logger.warn("An Warning Message");
        logger.error("An Error message");

        return "Lion! Check out the Logs to see the output...";
    }
}
