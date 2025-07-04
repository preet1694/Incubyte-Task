package org.example;

import java.util.StringTokenizer;

public class StringCalculator
{
    public int add(String inputSequence)
    {
        if (inputSequence == null || inputSequence.isEmpty())
        {
            return 0;
        }

        String[]  args = inputSequence.split(",");

        if(args.length==1)
            return Integer.parseInt(args[0]);

        return Integer.parseInt(args[0])+Integer.parseInt(args[1]);
    }
}
