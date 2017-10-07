package com.infiniteskills.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Ilya 11.09.2017.
 */

@ControllerAdvice(annotations = Controller.class)
public class GlobalControllerAdvice {
    @ModelAttribute("currentDate")
    public Date getCurrentDate(){
        return new Date();
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        binder.addValidators(new ProjectValidator());
//    }

    @ExceptionHandler(Exception.class)
    public String handleError(HttpServletRequest request){
        return "controller_error";
    }

}
