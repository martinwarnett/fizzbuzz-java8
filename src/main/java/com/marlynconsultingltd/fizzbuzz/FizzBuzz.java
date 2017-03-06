package com.marlynconsultingltd.fizzbuzz;

import com.marlynconsultingltd.fizzbuzz.validation.ParameterValidator;

/**
 *
 * @author martinwarnett
 */
public class FizzBuzz {
    public void validateParameters(final ParameterValidator validator,
                                   final String... args) {
        validator.validate(args);
    }

    
    public static void main(String... args) {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.validateParameters(new ParameterValidator(), args);
    }
}
