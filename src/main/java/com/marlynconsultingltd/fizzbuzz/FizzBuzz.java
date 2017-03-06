/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


    
    public void process() {
        
    }
    
    public static void main(String... args) {
        final FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.validateParameters(new ParameterValidator(), args);
        fizzBuzz.process();
    }
}
