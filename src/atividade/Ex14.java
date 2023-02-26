package atividade;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = 100;
        System.out.println("Quantos km foram percorridos?: " + km);
        //double km = scanner.nextDouble();

        int dias = 10;
        System.out.println("Quantidade dias alugado: " + dias);
        //int dias = scanner.nextInt();
         
        double precoDiaria = 90.0;
        double precoKmRodado = 0.2;

        double precoTotal = (precoDiaria * dias) + (precoKmRodado * km);

        System.out.println("Preço total a pagar: R$" + precoTotal);

        scanner.close();
    }
}