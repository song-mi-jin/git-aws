package com.example.aws_demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AwsServiceTest {
    //DI
    @Autowired
    AwsService awsService;

    @Test
    void hap() {
        //실제값과 기대값 비교
        int a = awsService.hap(10, 5);
        //assertEquals(expected, real)
        assertEquals(15,a);

    }
}