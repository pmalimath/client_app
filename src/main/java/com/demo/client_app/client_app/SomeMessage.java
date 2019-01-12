package com.demo.client_app.client_app;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/")
@RestController
public class SomeMessage {

    @Value("${test_key: Default Hello}")
    private String test_key;

    @GetMapping("/test_key")
    public String test_key() {
        return test_key;
    }
}