package atividade;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Clebson";
        System.out.print("Digite seu nome: ");
        //String nome = scanner.next();

        for(int i = 0; i < 10; i++){
            System.out.println(nome);
        }

        scanner.close();
    }
}