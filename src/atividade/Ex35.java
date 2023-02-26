package atividade;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.print("Digite um número inteiro: ");
        numero = input.nextInt();

        if(numero %2 == 0){
            System.out.println("Esse número é par");
        }else{
            System.out.println("Esse número é impar");
        }

        input.close();
    }
}