package atividade;

import java.util.Scanner;


public class Ex38{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = input.nextLine();

        System.out.print("Digite o sexo do cliente (M/F): ");
        char sexo = input.nextLine().charAt(0);

        System.out.print("Digite o valor das compras do cliente: R$");
        double valorCompras = input.nextDouble();

        double desconto = 0.0;
        if (sexo == 'F') {
            desconto = valorCompras * 0.13;
        } else if (sexo == 'M') {
            desconto = valorCompras * 0.05;
        }

        double valorComDesconto = valorCompras - desconto;

        System.out.printf("O preço com desconto para o cliente %s é R$%.2f.\n", nome, valorComDesconto);

        input.close();
    }
}
