package atividade;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diasTrabalhados = 22;
        System.out.println("Digite o número de dias trabalhados no mês: " + diasTrabalhados);
        //int diasTrabalhados = sc.nextInt();

        int horasTrabalhadas = diasTrabalhados * 8;
        double salario = horasTrabalhadas * 25.0;

        System.out.println("O salário do funcionário é: R$" + salario);

        sc.close();
    }
}
