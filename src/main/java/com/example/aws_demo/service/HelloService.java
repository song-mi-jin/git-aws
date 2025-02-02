package com.example.aws_demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public int hap(int x, int y) {
        return x+y;
    }

}
