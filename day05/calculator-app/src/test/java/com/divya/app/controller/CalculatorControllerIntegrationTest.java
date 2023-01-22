package com.divya.app.controller;



import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest({CalculatorController.class})
public class CalculatorControllerIntegrationTest {

    @Autowired
    MockMvc mockMvc;

    public void addTest() throws Exception {
        long a = (long) 10.0;
        long b = (long) 20.0;
        ResultActions result = mockMvc.perform(get("/add").param("a",String.valueOf(a)).param("b",String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData = result.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals(resultData,"30");
    }

    public void subTest() throws Exception{
        long a = (long) 20.0;
        long b = (long) 10.0;
        ResultActions result = mockMvc.perform(get("/sub").param("a",String.valueOf(a)).param("b", String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData = result.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals(resultData,"10");

    }

    public void mulTest() throws Exception{
        long a = (long) 20.0;
        long b = (long) 10.0;
        ResultActions result = mockMvc.perform(get("/mul").param("a",String.valueOf(a)).param("b", String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData = result.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals(resultData,"200");

    }

    public void divTest() throws Exception{
        long a = (long) 20.0;
        long b = (long) 10.0;
        ResultActions result = mockMvc.perform(get("/div").param("a",String.valueOf(a)).param("b", String.valueOf(b)));
        result.andExpect(status().isOk());
        String resultData = result.andReturn().getResponse().getContentAsString();
        Assertions.assertEquals(resultData,"2");

    }


}
