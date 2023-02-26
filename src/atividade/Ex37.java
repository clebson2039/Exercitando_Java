package atividade;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Ex37 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int anoNascimento;
    int idade;
    int anoAlistamento;

    System.out.print("Digite o ano de nascimento do rapaz: ");
    anoNascimento = input.nextInt();

    LocalDate dataAtual = LocalDate.now();
    idade = Period.between(LocalDate.of(anoNascimento, 1, 1), dataAtual).getYears();

    if (idade < 18) {
      anoAlistamento = anoNascimento + 18;
      System.out.println("Faltam " + (anoAlistamento - dataAtual.getYear()) + " anos para o alistamento.");
    } else {
      anoAlistamento = anoNascimento + 18;
      System.out.println("Já se passaram " + (dataAtual.getYear() - anoAlistamento) + " anos desde o alistamento.");
    }

    input.close();
  }
}
