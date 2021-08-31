package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App calculadora;

    public AppTest() {
        this.calculadora = new App();
    }
    @Test
    public void testSuma()
    {
        int num1 = 3;
        int num2 = 4;

        assertEquals( 7, this.calculadora.suma(num1, num2));

    }

    public void testResta()
    {

        assertEquals( 4, this.calculadora.resta(5, 1));
        assertEquals( -1, this.calculadora.resta(1, 2));

    }
}
