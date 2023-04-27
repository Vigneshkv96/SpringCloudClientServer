package com.springcloudconfig.SpringCloudConfigClient.Controller;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;

@RestController
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private Environment environment;

    @GetMapping("/Welcome")
    public String GetMessageInfo(){
        log.info("you are inside the getMessage function: "+ environment.getProperty("welcome.env"));
        return environment.getProperty("welcome.message");
    }
}
