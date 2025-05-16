package fatorial;

public class Calculadora_Fatorial {
    public static int calcular(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
