package com.marlynconsultingltd.fizzbuzz;

import com.marlynconsultingltd.fizzbuzz.Parameters;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


/**
 * Provides unit tests for the {@link FizzBuzz} class.
 *
 * @author martinwarnett
 */
@DisplayName("Main FizzBuzz tests")
@RunWith(JUnitPlatform.class)
public final class FizzBuzzTest {

    private FizzBuzz testSubject;
    private Parameters parameters;
    
    @BeforeEach
    public void setUp() {
        testSubject = new FizzBuzz();
    }
    

    @DisplayName("Output Correct for Positive Integers")
    @Test
    public void checkOutputCorrectForPositiveIntegers() {
        parameters = new Parameters(1,15);
        final String actualText = testSubject.process(parameters);
        
        final String expectedText = "1 : 1\n" +
                                    "2 : 2\n" +
                                    "3 : Fizz\n" +
                                    "4 : 4\n" +
                                    "5 : Buzz\n" +
                                    "6 : Fizz\n" +
                                    "7 : 7\n" +
                                    "8 : 8\n" +
                                    "9 : Fizz\n" +
                                    "10 : Buzz\n" +
                                    "11 : 11\n" +
                                    "12 : Fizz\n" +
                                    "13 : 13\n" +
                                    "14 : 14\n" +
                                    "15 : FizzBuzz\n";

        assertEquals(expectedText, actualText);       
    }

    @DisplayName("Output Correct for Negative Integers")
    @Test
    public void checkOutputCorrectForNegativeIntegers() {
        parameters = new Parameters(-15,-1);
        final String actualText = testSubject.process(parameters);
        
        final String expectedText = "-15 : FizzBuzz\n" +
                                    "-14 : -14\n" +
                                    "-13 : -13\n" +
                                    "-12 : Fizz\n" +
                                    "-11 : -11\n" +
                                    "-10 : Buzz\n" +
                                    "-9 : Fizz\n" +
                                    "-8 : -8\n" +
                                    "-7 : -7\n" +
                                    "-6 : Fizz\n" +
                                    "-5 : Buzz\n" +
                                    "-4 : -4\n" +
                                    "-3 : Fizz\n" +
                                    "-2 : -2\n" +
                                    "-1 : -1\n";

        assertEquals(expectedText, actualText);       
    }


    @DisplayName("Zero rendered correctly in output")
    @Test
    public void checkOutputCorrectForZeroInRange() {
        parameters = new Parameters(-1,1);
        final String actualText = testSubject.process(parameters);
        
        final String expectedText = "-1 : -1\n" +
                                    "0 : 0\n" +
                                    "1 : 1\n";

        assertEquals(expectedText, actualText);       
    }
}