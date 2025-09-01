package com.shankrish;

import org.springframework.stereotype.Component;

@Component
public class Hello22Service
        implements MessageService
{
    @Override
    public String getMessage() {
        return "Hello 2222, Spring IoC with 2222 java Annotations!";
    }
}
