package com.gv.spittr.controllers;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class MainControllerTest {

    @Test
    public void testHomePageWithSlash() throws Exception {
        MainController controller = new MainController();
        MockMvc mockMvc = standaloneSetup(controller).build();          // Set up MockMvc
        mockMvc.perform(get("/"))                            // perform GET request
                .andExpect(view().name("/views/home")); // expect correct path to the view
    }

    @Test
    public void testHomePageWithHome() throws Exception {
        MainController controller = new MainController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/home"))
                .andExpect(view().name("/views/home"));
    }

    @Test
    public void testHomePageWithHomepage() throws Exception {
        MainController controller = new MainController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/homepage"))
                .andExpect(view().name("/views/home"));
    }
}