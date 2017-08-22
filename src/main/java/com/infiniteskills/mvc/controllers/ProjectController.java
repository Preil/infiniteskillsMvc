package com.infiniteskills.mvc.controllers;

import com.infiniteskills.mvc.data.entities.Project;
import com.infiniteskills.mvc.data.services.ProjectService;
import com.infiniteskills.mvc.data.validators.ProjectValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Ilya 02.08.2017.
 */

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/{projectId}")
    public String findProject(Model model, @PathVariable("projectId") Long projectId) {
        model.addAttribute("project", projectService.find(projectId));
        return "project";
    }

    @RequestMapping(value = "/find")
    public String find(Model model) {
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject(Model model) {
        model.addAttribute("types", new ArrayList<String>() {
            {
                add("");
                add("Single year");
                add("Multi year");
            }
        });
        System.out.println("invoking addProject");
        model.addAttribute("project", new Project());
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(Model model, @ModelAttribute Project project) {
        System.out.println(project);
        model.addAttribute("currentProject", project);
        return "project";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new ProjectValidator());
    }


}
