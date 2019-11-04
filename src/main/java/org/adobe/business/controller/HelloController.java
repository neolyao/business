package org.adobe.business.controller;

import org.adobe.business.pojo.Test;
import org.adobe.business.service.TestServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * test
 */
@RestController
public class HelloController {
    @Autowired
    private TestServie testServie;
    @GetMapping("/test")
    public List<Test> test(){
        return testServie.getTests();
    }
}
