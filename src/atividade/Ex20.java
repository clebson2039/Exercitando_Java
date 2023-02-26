package atividade;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Clebson";
        System.out.println("Digite um nome: " + nome);
        //String nome = scanner.next();

        int n = 40;
        System.out.println("Digite um numero " + n);
        //int numero = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println(nome);
        }
        scanner.close();
    }
}