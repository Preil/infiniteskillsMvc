package com.infiniteskills.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Ilya 02.08.2017.
 */

@Controller
@RequestMapping("/project")
public class ProjectController {

    @RequestMapping("/add")
    public String addProject() {
        return "project_add";
    }
}
