package atividade;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double reais = 50.0;

        System.out.println("Digite quanto você tem na carteira (em reais): R$" + reais);
        //double reais = entrada.nextDouble();
        
        double taxaCambio = 3.45;
        double dolares = reais / taxaCambio;
        
        System.out.println("Com R$"+ reais + " você pode comprar: US$" + dolares);
        
        entrada.close();
    }

}
