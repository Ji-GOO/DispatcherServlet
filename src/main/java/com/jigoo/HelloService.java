package com.jigoo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getName() {
        return "jigoo";
    }
}
