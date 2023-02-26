package atividade;

import java.util.Scanner;

public class Ex29 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero;
    int numerosEntre0e100 = 0;

    for (int i = 1; i <= 20; i++) {
      System.out.print("Digite o número " + i + ": ");
      numero = input.nextInt();

      if (numero >= 0 && numero <= 100) {
        numerosEntre0e100++;
      }
    }

    System.out.println("Existem " + numerosEntre0e100 + " números entre 0 e 100.");

    input.close();
  }
}
