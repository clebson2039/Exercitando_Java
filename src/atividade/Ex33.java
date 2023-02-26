package atividade;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex33 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int anoDeNascimento;
    int idade;

    System.out.print("Digite o ano de nascimento: ");
    anoDeNascimento = input.nextInt();

    idade = LocalDate.now().getYear() - anoDeNascimento;

    if (idade >= 16) {
      System.out.println("A pessoa tem " + idade + " anos e pode votar.");
    } else {
      System.out.println("A pessoa tem " + idade + " anos e não pode votar.");
    }

    input.close();
  }
}
