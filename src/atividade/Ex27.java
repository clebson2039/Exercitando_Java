package atividade;

import java.util.Scanner;

public class Ex27 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero;
    int numerosMaioresQue8 = 0;

    for (int i = 1; i <= 20; i++) {
      System.out.print("Digite o número " + i + ": ");
      numero = input.nextInt();

      if (numero > 8) {
        numerosMaioresQue8++;
      }
    }

    System.out.println("Existem " + numerosMaioresQue8 + " números maiores que 8.");

    input.close();
  }
}
