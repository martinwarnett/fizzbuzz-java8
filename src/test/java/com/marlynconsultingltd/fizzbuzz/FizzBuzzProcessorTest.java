package com.marlynconsultingltd.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


/**
 *
 * @author martinwarnett
 */
@DisplayName("FizzBuzzProcessor tests")
@RunWith(JUnitPlatform.class)
public final class FizzBuzzProcessorTest {
    
    private FizzBuzzProcessor testSubject;
    
    @BeforeEach
    public void setUp() {
        testSubject = new FizzBuzzProcessor();
    }

    @DisplayName("Checks exception thrown upon null parameter object")
    @Test
    public void checkExceptionThrownWhenParametersAreNull() {
        final Throwable exception = assertThrows(IllegalArgumentException.class,
                     () -> testSubject.process(null));
        assertEquals("No parameters were provided", 
                     exception.getMessage());   
    }
   
}
