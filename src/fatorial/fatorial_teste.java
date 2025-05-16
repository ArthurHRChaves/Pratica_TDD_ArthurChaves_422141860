package fatorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class fatorial_teste {


    @Test
    public void testFatorialDeZero() {
        // Esperamos que 0! == 1
        assertEquals(1, Calculadora_Fatorial.calcular(0));

}
}