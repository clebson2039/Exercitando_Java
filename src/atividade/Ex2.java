package atividade;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu nome?: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");

        scanner.close();
    }

}
