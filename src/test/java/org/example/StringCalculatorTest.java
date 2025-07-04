package org.example;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringCalculatorTest
{
    private StringCalculator calculator;

    @Before
    public void setUpTest()
    {
        calculator = new StringCalculator();
    }

    @Test
    public void emptyStringTest()
    {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void checkForOneOrTwoArgumentsTest()
    {
        assertEquals(1, calculator.add("1"));
    }
}