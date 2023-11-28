package org.example;

public class _3 {
    public static void main(String[] args) {
        // Crie um método chamado calcularMedia que recebe um array de números como parâmetro e retorna a média deles.
        int[] arrayNumeros = {5, 10, 15, 20, 25};
        double media = calcularMedia(arrayNumeros);
        System.out.println("A média é: " + media);
    }

    public static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            return 0.0;
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
    }
}
