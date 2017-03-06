package com.marlynconsultingltd.fizzbuzz;

import com.marlynconsultingltd.fizzbuzz.validation.ParameterValidator;

/**
 *
 * @author martinwarnett
 */
public class FizzBuzz {
    public Parameters validateParameters(final ParameterValidator validator,
                                   final String... args) {
        return validator.validateAndAssignParameters(args);
    }

    
    public static void main(String... args) {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        final Parameters parameters = fizzBuzz.validateParameters(new ParameterValidator(), args);
    }
}
