package com.shankrish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class MainApp {

    private static final Logger logger = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) {
        logger.info("Main - Begin");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(MessagePrinter.class).printMessage();
        context.getBean(MessagePrinter.class).printMessage();

        logger.info("Main - End");

    }

}