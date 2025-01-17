package com.first_junit_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    Calculator calculadora = new Calculator();

    @Test
    public void sum(){
        assertEquals(2, calculadora.add(1, 1));
    }

}
