package org.example;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        // Crie um método chamado soma que recebe dois números como
        // parâmetros e retorna a soma deles.
        Scanner sc = new Scanner(System.in);
        System.out.println("Descreva um número: ");
        int a = sc.nextInt();

        System.out.println("Descreva um número: ");
        int b = sc.nextInt();

        System.out.println("O resultado é de: " + soma(a, b));

        sc.close();
    }

    public static int soma(int a, int b){
        return a + b;
    }
}

