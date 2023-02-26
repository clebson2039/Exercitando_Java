package atividade;

import java.util.Scanner;

public class Ex28 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero;
    int numerosPares = 0;

    for (int i = 1; i <= 20; i++) {
      System.out.print("Digite o número " + i + ": ");
      numero = input.nextInt();

      if (numero % 2 == 0) {
        numerosPares++;
      }
    }

    System.out.println("Existem " + numerosPares + " números pares.");

    input.close();
  }
}
