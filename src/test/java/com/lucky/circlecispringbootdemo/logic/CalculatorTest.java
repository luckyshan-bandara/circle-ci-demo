package com.lucky.circlecispringbootdemo.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(11, Calculator.add(5,5));
    }
}