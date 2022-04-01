package com.example.demo;

import com.chaoba.starter.demo.upload.LocalUploadService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private LocalUploadService localUploadService;

    @Test
    void contextLoads() {
        localUploadService.print();
    }
}
