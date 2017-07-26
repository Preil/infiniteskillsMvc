package com.infiniteskills.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Ilya 26.07.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String goHome() {
        return "home";
    }
}
