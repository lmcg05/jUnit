package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizz() {
        FizzBuzz fb = new FizzBuzz(15);
        assertEquals("fizz", fb.fizz(15));

        FizzBuzz fb2 = new FizzBuzz(6);
        assertEquals("buzz", fb2.fizz(6));

        FizzBuzz fb3 = new FizzBuzz(8);
        assertEquals("none", fb3.fizz(8));
    }

}