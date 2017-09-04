package com.infiniteskills.mvc.controllers;

import com.infiniteskills.mvc.data.entities.Project;
import com.infiniteskills.mvc.data.entities.Sponsor;
import com.infiniteskills.mvc.data.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Ilya 26.07.2017.
 */
@Controller
public class HomeController {

    @Autowired
    ProjectService service;

    @RequestMapping(value="/", params = "projectId")
    public String goHomeAgain(Model model, @RequestParam("projectId") Long projectId){
        model.addAttribute("currentProject", this.service.find(projectId));
        return "home";
    }

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
