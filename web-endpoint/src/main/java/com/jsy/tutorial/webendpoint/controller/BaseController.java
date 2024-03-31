package com.jsy.tutorial.webendpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @GetMapping(value = "/")
    public String base() {
        return "yes, from jsy' serverside";
    }
}
