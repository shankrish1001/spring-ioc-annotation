package com.shankrish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class MessagePrinter {
    private static final Logger logger = Logger.getLogger(MessagePrinter.class.getName());
    private final MessageService service;

    // Constructor injection (recommended)
    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {

        logger.info(this.service.getMessage());

    }
}
