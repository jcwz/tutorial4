package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.test.Calc;

public class TestCalc {


    @Test
    public void testCalcAdd() {

        assertEquals(3, Calc.add(1,2));

    }

    @Test
    public void testCalcSubtract() {

        assertEquals(2, Calc.subtract(4,2));

    }
}
