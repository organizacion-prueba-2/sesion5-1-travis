package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private final App calculadora;

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

    @Test
    public void testResta()
    {

        assertEquals( 4, this.calculadora.resta(5, 1));
        assertEquals( -1, this.calculadora.resta(1, 2));

    }

    @Test
    public void testMultiplica() {
        assertEquals( 4, this.calculadora.multiplicacion(2, 2));

    }
}
