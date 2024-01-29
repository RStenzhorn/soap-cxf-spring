package com.example.demo;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getHelloWorld(String name) {
        return "Hello world " + name;
    }

    @Override
    public DemoResult getHelloWorld(@NotNull DemoRequest request) {
        DemoResult result = new DemoResult();
        result.setResult(getHelloWorld(request.getName()));
        return result;
    }
}
