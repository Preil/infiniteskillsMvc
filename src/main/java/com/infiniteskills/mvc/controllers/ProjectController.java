package com.infiniteskills.mvc.controllers;

import com.infiniteskills.mvc.data.entities.Project;
import com.infiniteskills.mvc.data.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Ilya 02.08.2017.
 */

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/{projectId}")
    public String findProject(Model model, @PathVariable("projectId") Long projectId){
        model.addAttribute("project", projectService.find(projectId));
        return "project";
    }

    @RequestMapping(value = "/find")
    public String find(Model model){
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject() {

        System.out.println("invoking addProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(Model model, @ModelAttribute Project project) {
        System.out.println(project);
        model.addAttribute("currentProject", project);
        return "project";
    }



}
