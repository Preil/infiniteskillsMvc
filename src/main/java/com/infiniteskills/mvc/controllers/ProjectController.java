package com.infiniteskills.mvc.controllers;

import com.infiniteskills.mvc.data.entities.Project;
import com.infiniteskills.mvc.data.services.ProjectService;
import com.infiniteskills.mvc.data.validators.ProjectValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Ilya 02.08.2017.
 */

@Controller
@RequestMapping("/project")
@SessionAttributes("project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/{projectId}")
    public String findProject(Model model, @PathVariable("projectId") Long projectId) {
        model.addAttribute("project", projectService.find(projectId));
        return "project";
    }

    @RequestMapping(value = "/find/{projectId}")
    public @ResponseBody Project findProjectObject(Model model, @PathVariable("projectId")Long projectId){
        return this.projectService.find(projectId);
    }

    @RequestMapping(value = "/find")
    public String find(Model model) {
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject(@ModelAttribute Project project) {
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(@Valid @ModelAttribute Project project, Errors errors, RedirectAttributes attributes) {
        project.setProjectId(55L);
        this.projectService.save(project);
        attributes.addFlashAttribute("project", project);
        return "redirect:/";
    }

    @ModelAttribute("types")
    public List<String> getTypes(){
        return new LinkedList<>(Arrays.asList("","Single year", "Multi year"));
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new ProjectValidator());
    }

    @ModelAttribute("project")
    public Project getProject(){
        return new Project();
    }

    @ExceptionHandler(Exception.class)
    public String handleError(HttpServletRequest request){
        return "controller_error";
    }
}
