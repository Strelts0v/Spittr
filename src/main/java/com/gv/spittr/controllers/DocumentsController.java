package com.gv.spittr.controllers;

import com.gv.spittr.entities.Spittle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class DocumentsController {

    @RequestMapping(value = "/excel", method = RequestMethod.GET)
    public ModelAndView excel() {
        System.out.println("Documents controller is called");
        List<Spittle> spittles = createSpittles();

        //excelDocument - look documents-config.xml
        return new ModelAndView("excelDocument", "modelObject", spittles);

    }

    @RequestMapping(value = "/pdf", method = RequestMethod.GET)
    public ModelAndView pdf() {
        System.out.println("Documents controller is called");
        List<Spittle> spittles = createSpittles();

        //pdfDocument - look documents-config.xml
        return new ModelAndView("pdfDocument", "modelObject", spittles);

    }

    private List<Spittle> createSpittles() {
        List<Spittle> spittles = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Spittle cat = new Spittle(i + 1, "Spittle content #" + String.valueOf(i+1),
                    i+1, new Date());
            spittles.add(cat);
        }
        return spittles;
    }
}