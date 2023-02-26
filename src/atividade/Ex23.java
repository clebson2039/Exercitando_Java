package atividade;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Digite a idade da pessoa %d: ", i);
            int idade = scanner.nextInt();
            soma += idade;
            contador++;
        }

        double media = (double) soma / contador;
        System.out.printf("A média das idades é: %.2f", media);
        scanner.close();
    }
}
