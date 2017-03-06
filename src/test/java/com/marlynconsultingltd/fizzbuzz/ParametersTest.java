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
@DisplayName("Parameters tests")
@RunWith(JUnitPlatform.class)
public final class ParametersTest {
    private static final int START = 67;
    private static final int END = 34;
    
    private Parameters testSubject;
    
    @BeforeEach
    public void setUp() {
        testSubject = new Parameters(START, END);
    }
    
    @DisplayName("Start parameter should be unaltered")
    @Test
    public void checkStartParameterUnaltered() {
        assertEquals(START, testSubject.getStart());
    }

    @DisplayName("End parameter should be unaltered")
    @Test
    public void checkEndParameterUnaltered() {
        assertEquals(END, testSubject.getEnd());
    }
}
