package atividade;

//import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        
        //System.out.print("Digite um número: ");
        //int numero = scanner.nextInt();
        int numero = 9;
        System.out.println("Digite um número: " + numero);

        int antecessor = numero -1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor );
        System.out.println("O sucessor de " + numero + " é " + sucessor );
    }
}