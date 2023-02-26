package atividade;

import java.util.Scanner;


public class Ex34 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nome;
    double nota1, nota2, media;

    System.out.print("Digite o nome do aluno: ");
    nome = input.nextLine();

    System.out.print("Digite a primeira nota: ");
    nota1 = input.nextDouble();

    System.out.print("Digite a segunda nota: ");
    nota2 = input.nextDouble();

    media = (nota1 + nota2) / 2.0;

    System.out.println("A média do aluno " + nome + " é: " + media);

    if (media >= 7.0) {
      System.out.println("O aluno " + nome + " teve um bom aproveitamento!");
    } else {
      System.out.println("O aluno " + nome + " precisa se esforçar mais!");
    }

    input.close();
  }
}
