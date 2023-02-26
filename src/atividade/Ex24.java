package atividade;

import java.util.Scanner;

public class Ex24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int idade;
    int maioresDeIdade = 0;

    for (int i = 1; i <= 20; i++) {
      System.out.print("Digite a idade da pessoa " + i + ": ");
      idade = input.nextInt();

      if (idade >= 18) {
        maioresDeIdade++;
      }
    }

    System.out.println("Existem " + maioresDeIdade + " pessoas maiores de idade.");

    input.close();
  }
}
