package com.gv.spittr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping({"/", "/home", "/homepage"})
public class MainController {

    @RequestMapping(method=GET)
    public String getHome() {
        return "/views/home";
    }
}