package com.sharansh.annotations.controller;

import com.sharansh.annotations.customannotation.LogDetails;
import com.sharansh.annotations.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class AppController {

    private final SampleService sampleService;

    public AppController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/checkAnnotation")
    public String checkAnnotation() throws ClassNotFoundException {
        Class sampleServiceClass = sampleService.getClass();
        LogDetails annotation = (LogDetails) sampleServiceClass.getAnnotation(LogDetails.class);
        if (annotation.isLogTime()) {
            System.out.println("The time is " + ZonedDateTime.now());
        }
        return sampleService.sampleMethod();
    }
}
