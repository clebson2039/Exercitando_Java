package atividade;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int velocidade = 85;

        System.out.println("Digite sua velocidade " + velocidade);
        //int velocidade = scanner.nextInt();
        

        if(velocidade > 80){
            System.out.println("Você foi multado e terá que pagar R$5 por cada km rodado");
        }

        scanner.close();
    }
}