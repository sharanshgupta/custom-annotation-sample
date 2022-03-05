package com.sharansh.annotations.service;

import com.sharansh.annotations.customannotation.LogDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@LogDetails
public class SampleService {

    @LogDetails
    public String sampleMethod() {
        return "Hello from Sample Method.";
    }
}
