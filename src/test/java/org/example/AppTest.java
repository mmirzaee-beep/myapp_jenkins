package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

    @Test
    public void testCalculate(){
        int result = App.calculate(9,1);

        assertEquals(10, result);
    }
    @Test
    public void evenTest() {

        assertEquals("Even number", true, App.isEvenNumber(14));
    }

    @Test
    public void oddTest() {

        assertEquals("Odd number", true, App.isOddNumber(13));
    }
}
