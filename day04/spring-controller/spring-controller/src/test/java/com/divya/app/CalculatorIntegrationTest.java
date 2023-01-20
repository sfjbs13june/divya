package com.divya.app;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({Calculator.class})
public class CalculatorIntegrationTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testCalculatorControllerAdd() throws Exception{
        String a = "3.0";
        String b = "3.0";
        ResultActions responseEntity = mockMvc.perform(MockMvcRequestBuilders.get("/add").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("6.0",result);
    }

    @Test
    public void testCalculatorControllerSub() throws Exception{
        String a = "3.0";
        String b = "3.0";
        ResultActions responseEntity = mockMvc.perform(MockMvcRequestBuilders.get("/sub").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result =responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("0.00",result);
    }

    @Test
    public void testCalculatorControllerMul() throws Exception{
        String a = "3.0";
        String b = "3.0";
        ResultActions responseEntity = mockMvc.perform(MockMvcRequestBuilders.get("/mul").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("9.0",result);
    }

    @Test
    public void testCalculatorControllerDiv() throws Exception{
        String a ="3.0";
        String b= "3.0";
        ResultActions responseEntity = mockMvc.perform(MockMvcRequestBuilders.get("/div").param("a",a).param("b",b));
        String result = responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("1.0",result);
    }

}