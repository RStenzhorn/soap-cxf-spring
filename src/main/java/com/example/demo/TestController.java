package com.example.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class TestController {

    private final TestService testService;

    @GetMapping
    public String getHelloWorld(@RequestParam String name) {
        return testService.getHelloWorld(name);
    }

}
