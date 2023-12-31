package org.example;

public class _8 {
    public static void main(String[] args) {
        // Implemente um método chamado encontrarMaiorElemento que recebe uma matriz de inteiros como parâmetro e retorna o maior elemento presente nela.
        int[][] matriz = {
                {3, 7, 12},
                {8, 21, 5},
                {15, 9, 4}
        };

        int maiorElemento = encontrarMaiorElemento(matriz);
        System.out.println("O maior elemento na matriz é: " + maiorElemento);
    }

    public static int encontrarMaiorElemento(int[][] matriz) {
        int maior = matriz[0][0]; // Assumimos que o primeiro elemento é o maior inicialmente

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }
}
