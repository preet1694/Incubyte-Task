package org.example;


import java.util.ArrayList;

public class StringCalculator
{

    private int calledCount = 0;


    public int getCalledCount() {
        return calledCount;
    }

    // Extracts delimiters from the input string
    private String extractDelimiters(String inputSequence)
    {
        int delimiterIndex=inputSequence.indexOf("//");
        int delimiterEndIndex=inputSequence.indexOf("\n");

        String delimiters = inputSequence.substring(delimiterIndex+2,delimiterEndIndex);

        // If multiple length delimiter is encountered
        if(delimiters.startsWith("[")&&delimiters.endsWith("]"))
            return ",|\\n|"+escapeRegex(delimiters.substring(1,delimiters.length()-1));
        return "["+delimiters+",\n]"; // Provides the regex for splitting
    }

    // Processing multiple length delimiters
    private String escapeRegex(String delimiter) {
        return delimiter.replaceAll("([\\\\*+\\[^$?.|])", "\\\\$1");
    }

    // Extract numbers from the input string
    private String extractNumberPart(String input) {
        int delimiterEndIndex = input.indexOf("\n");
        return input.substring(delimiterEndIndex + 1);  // Extract the string after \n
    }

    public int add(String inputSequence)
    {
        calledCount++;
        int sum=0;
        String delimiters="[,\\n]";
        ArrayList<Integer> negativeNumbers=new ArrayList<>();

        // Handling empty input string
        if (inputSequence == null || inputSequence.isEmpty())
        {
            return 0;
        }

        // Check if user defined delimiter is passed
        if(inputSequence.startsWith("//"))
        {

            delimiters=extractDelimiters(inputSequence);
            inputSequence=extractNumberPart(inputSequence);
        }

        // Splitting input string into numbers
        String[]  numbers = inputSequence.split(delimiters);

        // Handling multiple numbers input
        for(String number : numbers)
        {
            int num=Integer.parseInt(number);
            if(num>1000)
                continue;
            if(num<0)
                negativeNumbers.add(num);
            else
            {sum+=num;}
        }
        if(!negativeNumbers.isEmpty())
        {
            throw new IllegalArgumentException("Negatives not allowed "+ negativeNumbers);
        }
        return sum;
    }
}
