package com.marlynconsultingltd.fizzbuzz;

import com.marlynconsultingltd.fizzbuzz.validation.ParameterValidator;
import java.util.stream.IntStream;

/**
 *
 * @author martinwarnett
 */
public class FizzBuzz {
    public Parameters validateParameters(final ParameterValidator validator,
                                         final String... args) {
        return validator.validateAndAssignParameters(args);
    }

    public String process(final Parameters parameters) {
        final StringBuilder text = new StringBuilder();

        IntStream.rangeClosed(parameters.getStart(), parameters.getEnd())
                 .forEach(i -> processNumber(i, text));

        return text.toString();
    }
    
    private void processNumber(final int number, final StringBuilder text) {
        text.append(String.format("%d : ", number));
        
        String result = "";
        if (number != 0 && number % 3 == 0) {
            result = "Fizz";
        }
        if (number != 0 && number % 5 == 0) {
            result += "Buzz";
        }
        if ("".equals(result)) {
            result = Integer.toString(number);
        }
        
        text.append(String.format("%s\n", result));
    }

    public static void main(String... args) {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        final Parameters parameters = fizzBuzz.validateParameters(new ParameterValidator(), args);
        
        System.out.println(fizzBuzz.process(parameters));
    }
}
