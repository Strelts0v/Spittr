package com.gv.spittr.controllers;

import com.gv.spittr.entities.Spittle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private List<Spittle> spittleList;

    public SpittleController(){
        spittleList = new ArrayList<>(10);
        spittleList.add(new Spittle(1, "Spittle 1", 1, new Date()));
        spittleList.add(new Spittle(2, "Spittle 2", 2, new Date()));
        spittleList.add(new Spittle(3, "Spittle 3", 3, new Date()));
        spittleList.add(new Spittle(4, "Spittle 4", 4, new Date()));
    }

    @RequestMapping(method=RequestMethod.GET)
    public String getSpittles(Model model) {
        model.addAttribute("spittles", spittleList);
        return "/views/spittles";
    }

    @RequestMapping(value="/show", method=RequestMethod.GET)
    public String getSpittle(Model model,
                             @RequestParam("spittle_id") int spittleId){
        if(spittleId > 0 && spittleId <= spittleList.size()){
            model.addAttribute("spittles", spittleList.subList(spittleId-1, spittleId));
        }
        return "views/spittles";
    }
}
