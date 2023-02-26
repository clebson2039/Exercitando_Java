package atividade;

import java.util.Scanner;

public class Ex36 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int ano;

    System.out.print("Digite um ano: ");
    ano = input.nextInt();

    //Todo ano divisível por 4 é bissexto
    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
      System.out.println(ano + " é bissexto.");
    } else {
      System.out.println(ano + " não é bissexto.");
    }

    input.close();
  }
}
