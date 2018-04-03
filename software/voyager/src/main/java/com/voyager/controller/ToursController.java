package com.voyager.controller;

import com.voyager.model.Tour;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
public class ToursController {
    private static final Logger logger = Logger
            .getLogger(ToursController.class);
    public ToursController(){
        System.out.println("Controller constructor");
    }


    @RequestMapping(value = "/")
    public ModelAndView toursList(ModelAndView model) throws IOException {
        /*List<Tour> toursList = tourService.getAllTours();
        model.addObject("toursList", toursList);
        */
        model.setViewName("home");
        System.out.println("toursList");
        return model;
    }
}
