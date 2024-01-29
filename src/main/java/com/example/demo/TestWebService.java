package com.example.demo;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService(targetNamespace = "http://test.rjst.de", name = "TestWebService")
public interface TestWebService {

    @WebMethod
    @WebResult(name = "result")
    String getHelloWorld(@WebParam(name = "input") String name);

    @WebMethod
    @WebResult(name = "result")
    List<DemoResult> getHelloWorlds(@WebParam(name = "input") List<DemoRequest> requests);

}
