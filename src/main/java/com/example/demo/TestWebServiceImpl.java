package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestWebServiceImpl implements TestWebService {

    private final TestService testService;

    @Override
    public String getHelloWorld(String name) {
        return testService.getHelloWorld(name);
    }

    @Override
    public List<DemoResult> getHelloWorlds(@NotNull List<DemoRequest> requests) {
        return requests.stream().map(testService::getHelloWorld).toList();
    }
}