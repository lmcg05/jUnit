package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("Juice", 65); //create new object
        assertEquals("Juice", c.getLiquidType());    //what it should be equal to and where we are getting it from
    }
}