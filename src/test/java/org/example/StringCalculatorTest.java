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
    public void checkForOneArgumentsTest()
    {
        assertEquals(1, calculator.add("1"));
        assertEquals(18, calculator.add("18"));
    }

    @Test
    public void checkForTwoArgumentsTest()
    {
        assertEquals(5, calculator.add("2,3"));
    }

    @Test
    public void checkForMultipleArgumentsTest()
    {
        assertEquals(9, calculator.add("2,3,4"));
        assertEquals(10, calculator.add("1,2,3,4"));
    }
}