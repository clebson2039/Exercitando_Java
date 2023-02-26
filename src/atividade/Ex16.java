package atividade;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdCigarros = 20, anosFumante = 1;
        System.out.println("Digite a quantidade de cigarros fumados por dia: " + qtdCigarros);
        //int qtdCigarros = sc.nextInt();

        System.out.println("Digite por quantos anos você fumou: " + anosFumante);
        //int anosFumante = sc.nextInt();

        int totalCigarros = qtdCigarros * 365 * anosFumante;
        int totalMinutosPerdidos = totalCigarros * 10;
        int totalDiasPerdidos = totalMinutosPerdidos / 1440;

        System.out.println("Você perdeu " +totalDiasPerdidos + " dias de vida como fumante.");

        sc.close();
    }
}
