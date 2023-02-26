package atividade;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double salarioAtual = 2884.0;
        System.out.println("Digite o salário atual do funcionário: R$" + salarioAtual);
        //double salarioAtual = scanner.nextDouble();

        // Calcula o novo salário com um aumento de 15%
        double novoSalario = salarioAtual * 1.15;

        System.out.println("O novo salário do funcionário com 15% de aumento é: R$" + novoSalario);

        scanner.close();
    }
}
