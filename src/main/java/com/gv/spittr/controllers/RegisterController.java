package com.gv.spittr.controllers;

import com.gv.spittr.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @RequestMapping(method=RequestMethod.GET)
    public String getRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "/views/registration";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String registerNewUser(@Valid @ModelAttribute("user") User user,
                                  BindingResult result){
        if(result.hasErrors()) {
            return "/views/registration";
        }
        return "redirect:/home";
    }
}
