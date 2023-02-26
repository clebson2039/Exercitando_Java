package atividade;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double preco = 39.0;
        System.out.println("Digite o preço do produto: R$" + preco);
        //double preco = sc.nextDouble();
        
        // calcula o preço promocional com 5% de desconto
        double precoPromocional = preco * 0.95;
        
        System.out.println("Preço promocional: R$" + precoPromocional);
        
        sc.close();
    }
}
