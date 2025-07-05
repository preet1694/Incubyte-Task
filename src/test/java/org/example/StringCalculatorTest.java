package org.example;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
    public void checkForUnknownArgumentsTest()
    {
        assertEquals(0, calculator.add(""));
        assertEquals(2, calculator.add("2"));
        assertEquals(3, calculator.add("1,2"));
        assertEquals(9, calculator.add("2,3,4"));
        assertEquals(10, calculator.add("1,2,3,4"));
    }

    @Test
    public void checkForMultipleArgumentsWithNewLineCharacterTest()
    {
        assertEquals(6, calculator.add("1\n2,3"));
        assertEquals(6, calculator.add("1\n2\n3"));
    }

    @Test
    public void checkForUserDefinedDelimitersInputTest()
    {
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test
    public void checkForNegativeNumberInputTest()
    {
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class, ()->calculator.add("-1"));
        assertEquals("Negatives not allowed [-1]", exception.getMessage());
    }

    @Test
    public void checkForMultipleNegativeNumberInputTest()
    {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()->calculator.add("-1,-2"));
        assertEquals("Negatives not allowed [-1, -2]", exception.getMessage());
    }

    @Test
    public void checkCallCountTest()
    {
        assertEquals(1, calculator.add("1"));
        assertEquals(1, calculator.getCalledCount());
    }
}