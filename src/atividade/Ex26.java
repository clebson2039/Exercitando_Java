package atividade;

import java.util.Scanner;

public class Ex26 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero;

    System.out.print("Digite um número: ");
    numero = input.nextInt();

    System.out.println("Tabuada de multiplicação de " + numero + ":");

    for (int i = 1; i <= 10; i++) {
      int resultado = numero * i;
      System.out.println(numero + " x " + i + " = " + resultado);
    }

    input.close();
  }
}
