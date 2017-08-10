package com.infiniteskills.mvc.controllers;

import com.infiniteskills.mvc.data.entities.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Ilya 09.08.2017.
 */

@Controller
@RequestMapping(value = "/resource")
public class ResourceController {

    @RequestMapping(value = "/add")
    private String add(Model model){
        List<String> options = new LinkedList<>(Arrays.asList("Material", "Other", "Staff", "Technical Equipment"));
        model.addAttribute("typeOptions", options);
        List<String> radios = new LinkedList<>(Arrays.asList("Hours", "Pieces", "Tons"));
        model.addAttribute("radioOptions", radios);
        List<String> checks = new LinkedList<>(Arrays.asList("Lead Time", "Special rate", "Requires approval"));
        model.addAttribute("checkOptions", checks);
        model.addAttribute("resource", new Resource());
        System.out.println("Add resource invoked");
        return "resource_add";
    }

    @RequestMapping(value = "/save")
    private String save(@ModelAttribute Resource resource){
        System.out.println(resource);
        return "resource_add";
    }


}
