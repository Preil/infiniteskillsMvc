package com.infiniteskills.mvc.controllers;

import com.infiniteskills.mvc.data.entities.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Ilya 09.08.2017.
 */

@Controller
@RequestMapping(value = "/resource")
@SessionAttributes("resource")
public class ResourceController {

    @RequestMapping(value = "/add")
    private String add(){
        return "resource_add";
    }

    @RequestMapping("/review")
    private String review(@ModelAttribute Resource resource){
        System.out.println("Invoking review");
        return "resource_review";
    }

    @RequestMapping(value = "/save")
    private String save(@ModelAttribute Resource resource, SessionStatus status){
        System.out.println(resource);
        status.setComplete();
        return "home";
    }

    @ModelAttribute("resource")
    public Resource getResource(){
        return new Resource();
    }

    @ModelAttribute("typeOptions")
    public List<String> getTypeOptions(){
        return new LinkedList<>(Arrays.asList("Material", "Other", "Staff", "Technical Equipment"));
    }

    @ModelAttribute("checkOptions")
    public List<String> getChecks() {
        return new LinkedList<>(Arrays.asList("Lead Time", "Special rate", "Requires approval"));
    }

    @ModelAttribute("radioOptions")
    public List<String> getRadios(){
        return new LinkedList<>(Arrays.asList("Hours", "Pieces", "Tons"));
    }


}
