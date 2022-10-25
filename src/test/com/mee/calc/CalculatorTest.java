package com.mee.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void canAddZeroPlusZero(){
      Calculator cal = new Calculator();
      int a =  cal.add(0,0);
      assertEquals(0,a, "The sum of two zeros is zero");
    }
}
