package fatorial;

public class Main {
    public static void main(String[] args) {
        testarFatorial(0, 1);
        testarFatorial(1, 1);
        testarFatorial(5, 120);
        testarFatorial(7, 5040);
        testarFatorial(10, 3628800);
    }

    private static void testarFatorial(int entrada, int esperado) {
        int resultado = Calculadora_Fatorial.calcular(entrada);
        if (resultado == esperado) {
            System.out.println("✅ Teste passou: " + entrada + "! = " + resultado);
        } else {
            System.out.println("❌ Teste falhou: " + entrada + "! retornou " + resultado + " (esperado: " + esperado + ")");
        }
    }
}