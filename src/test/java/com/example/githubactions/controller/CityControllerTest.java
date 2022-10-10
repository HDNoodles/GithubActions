package com.example.githubactions.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@WebMvcTest(controllers = CityController.class)
public class CityControllerTest {

    @Test
    public void test_getCityById(){
        assertEquals(1,1);
    }
}
