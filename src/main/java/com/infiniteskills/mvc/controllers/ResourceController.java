package com.infiniteskills.mvc.controllers;

import com.infiniteskills.mvc.data.entities.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Ilya 09.08.2017.
 */

@Controller
@RequestMapping(value = "/resource")
public class ResourceController {

    @RequestMapping(value = "/add")
    private String add(Model model){
        model.addAttribute("resource", new Resource());
        System.out.println("Add resource invoked");
        return "resource_add";
    }

    @RequestMapping(value = "/save")
    private String save(){
        System.out.println("Invoking method save");
        return "resource_add";
    }


}
