package atividade;

import java.util.Scanner;

public class Ex30 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero;
    int numerosEntre0e100 = 0;
    int numerosEntre101e200 = 0;
    int numerosMaioresQue200 = 0;

    for (int i = 1; i <= 20; i++) {
      System.out.print("Digite o número " + i + ": ");
      numero = input.nextInt();

      if (numero >= 0 && numero <= 100) {
        numerosEntre0e100++;
      } else if (numero >= 101 && numero <= 200) {
        numerosEntre101e200++;
      } else if (numero > 200) {
        numerosMaioresQue200++;
      }
    }

    System.out.println("Existem " + numerosEntre0e100 + " números entre 0 e 100.");
    System.out.println("Existem " + numerosEntre101e200 + " números entre 101 e 200.");
    System.out.println("Existem " + numerosMaioresQue200 + " números maiores que 200.");

    input.close();
  }
}
