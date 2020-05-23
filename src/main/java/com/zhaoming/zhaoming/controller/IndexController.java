package com.zhaoming.zhaoming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * spring学习2020.5.24
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public  String index(){ return "index";}



}
