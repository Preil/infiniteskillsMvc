package com.infiniteskills.mvc.controllers;

import com.infiniteskills.mvc.data.entities.Project;
import com.infiniteskills.mvc.data.entities.Sponsor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Ilya 26.07.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String goHome(Model model) {
        Project project = new Project();
        project.setName("First project");
        project.setSponsor(new Sponsor("NASA", "777-777-77", "nasa@gmail.com"));
        project.setDescription("Simple project sponsored by NASA");
        model.addAttribute("currentProject", project);

        return "home";
    }
}
