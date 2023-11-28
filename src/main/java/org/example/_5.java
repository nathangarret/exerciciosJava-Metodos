package org.example;

public class _5 {
    public static void main(String[] args) {
        // Crie um método chamado contarVogais que recebe uma string como parâmetro e retorna o número de vogais nela.
        String exemplo = "Hello World?";
        int vogais = contarVogais(exemplo);
        System.out.println("O número de vogais na string é: " + vogais);
    }
    public static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase(); // Convertendo para minúsculas para facilitar a contagem

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }
        return contador;
    }

}
