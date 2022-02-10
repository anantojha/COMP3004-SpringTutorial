package com.example.springdemo;

import com.example.springdemo.Models.Sport;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.Assert;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpringDemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void TestHomePage() throws Exception {
        ResultActions ra = mockMvc.perform(get("/sport")).andDo(print()).andExpect(status().isOk());

        MvcResult result = ra.andReturn();
        String contentString = result.getResponse().getContentAsString();

        ArrayList<Sport> sports = objectMapper.readValue(contentString, new TypeReference<>() {});
        Assert.isTrue(sports.size() == 3, "Arraylist is not size of 3");
//        for(Sport s: sports){
//            System.out.println("id: " + s.getId() + " name: " + s.getName());
//        }
    }

}
