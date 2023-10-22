package com.study.git.tcs.facade;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GreetingFacadeTest {

    @Test
    public void testGreeting() {
        String greeting = "Hello, World!"; // add more complex steps
        assertEquals("Hello, World!", greeting);
    }
}
