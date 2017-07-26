package com.infiniteskills.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Ilya 26.07.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    @ResponseBody
    public String goHome() {
        return "Welcome home!";
    }
}
