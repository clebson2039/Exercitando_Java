package atividade;

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância que deseja percorrer em Km: ");
        double distancia = scanner.nextDouble();
        
        double precoPorKm = distancia <= 200 ? 0.5 : 0.45;
        double precoTotal = distancia * precoPorKm;
        
        System.out.println("O preço da passagem é: R$" + precoTotal);

        scanner.close();
    }
}
