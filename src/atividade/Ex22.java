package atividade;


import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Digite a idade da pessoa %d: ", i);
            int idade = scanner.nextInt();
            soma += idade;
        }

        System.out.println("A soma das idades é: " + soma);
        scanner.close();
    }
}
