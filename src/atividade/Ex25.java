package atividade;

import java.util.Scanner;

public class Ex25 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nome;
    int idade;
    String nomeMaisNovo = "";
    int idadeMaisNova = Integer.MAX_VALUE;

    for (int i = 1; i <= 10; i++) {
      System.out.print("Digite o nome da pessoa " + i + ": ");
      nome = input.nextLine();
      
      System.out.print("Digite a idade da pessoa " + i + ": ");
      idade = input.nextInt();
      input.nextLine(); // Limpa o buffer do teclado

      if (idade < idadeMaisNova) {
        nomeMaisNovo = nome;
        idadeMaisNova = idade;
      }
    }

    System.out.println("A pessoa mais nova é " + nomeMaisNovo + ", com " + idadeMaisNova + " anos.");

    input.close();
  }
}
