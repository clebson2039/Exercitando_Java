package atividade;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double metros = 85.7;
        System.out.println("Digite uma distância em metros: " + metros);
        //double metros = entrada.nextDouble();
        
        double quilometros = metros / 1000;
        double centimetros = metros * 100;
        double milimetros = metros * 1000;
        
        System.out.println(metros + " metros equivalem a:");
        System.out.println(quilometros + " quilômetros");
        System.out.println(centimetros + " centímetros");
        System.out.println(milimetros + " milímetros");
        
        entrada.close();
    }

}

