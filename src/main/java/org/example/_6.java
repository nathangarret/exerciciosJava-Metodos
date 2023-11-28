package org.example;

public class _6 {
    public static void main(String[] args) {
        // Implemente um método chamado trocarValores que recebe dois inteiros como parâmetros e troca os valores entre eles.

        int numero1 = 10;
        int numero2 = 20;

        trocarValores(numero1, numero2);
    }
    public static void trocarValores(int a, int b) {
        System.out.println("Valores antes da troca: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores depois da troca: a = " + a + ", b = " + b);
    }
}
