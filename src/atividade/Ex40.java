package atividade;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do primeiro segmento de reta: ");
        double a = sc.nextDouble();

        System.out.println("Digite o tamanho do segundo segmento de reta: ");
        double b = sc.nextDouble();

        System.out.println("Digite o tamanho do terceiro segmento de reta: ");
        double c = sc.nextDouble();
        

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("É possível formar um triângulo com essas retas.");
        } else {
            System.out.println("Não é possível formar um triângulo com essas retas.");
        }

        sc.close();
    }
}
