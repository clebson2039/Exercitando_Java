package atividade;

import java.util.Scanner;

public class Ex31 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero;
    int soma = 0;

    while (true) {
      System.out.print("Digite um número: ");
      numero = input.nextInt();

      if (numero < 0) {
        break;
      }

      soma += numero;
    }

    System.out.println("A soma dos números digitados é: " + soma);

    input.close();
  }
}
