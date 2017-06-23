package com.gv.spittr.controllers;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SpittleControllerTest {

    @Test
    public void getSpittlesTest() throws Exception {
        SpittleController controller = new SpittleController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/spittles"))
                .andExpect(view().name("views/spittles"))
                .andExpect(model().attributeExists("spittles"));
    }
    @Test
    public void getSpittleWithIdTest() throws Exception {
//        Spittle expectedSpittle = new Spittle(1, "Spittle 1", 1, new Date());
//        SpittleRepository mockRepository = mock(SpittleRepository.class);
//        when(mockRepository.findOne(12345)).thenReturn(expectedSpittle);
//
//        SpittleController controller = new SpittleController(mockRepository);
//        MockMvc mockMvc = standaloneSetup(controller).build();
//
//        mockMvc.perform(get("/spittles/12345"))
//                .andExpect(view().name("spittle"))
//                .andExpect(model().attributeExists("spittle"))
//                .andExpect(model().attribute("spittle", expectedSpittle));
    }

}