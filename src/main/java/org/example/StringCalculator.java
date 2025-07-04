package org.example;


public class StringCalculator
{
    // Extracts delimiters from the input string
    private String extractDelimiters(String inputSequence)
    {
        int delimiterIndex=inputSequence.indexOf("//");
        int delimiterEndIndex=inputSequence.indexOf("\n");
        return "["+inputSequence.substring(delimiterIndex+2,delimiterEndIndex)+",\n]"; // Provides the regex for splitting
    }

    // Extract numbers from the input string
    private String extractNumberPart(String input) {
        int delimiterEndIndex = input.indexOf("\n");
        return input.substring(delimiterEndIndex + 1);  // Extract the string after \n
    }

    public int add(String inputSequence)
    {
        int sum=0;
        String delimiters="[,\\n]";
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
            if(num<0)
                throw new IllegalArgumentException("Negatives Not Allowed " +num);
            sum+=num;
        }
        return sum;
    }
}
