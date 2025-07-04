package org.example;


public class StringCalculator
{
    public int add(String inputSequence)
    {
        int sum=0;
        String delimiters="[,|\n]";
        // Handling empty input string
        if (inputSequence == null || inputSequence.isEmpty())
        {
            return 0;
        }


        // Splitting input string into numbers
        String[]  args = inputSequence.split(delimiters);

        // Handling multiple numbers input
        for(String arg : args)
        {
            sum+=Integer.parseInt(arg);
        }

        return sum;
    }
}
