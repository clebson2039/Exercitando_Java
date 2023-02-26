package atividade;

import java.util.Scanner;

public class Ex11{
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    double a = 3, b = 15, c = 9;
    System.out.println("Digite o valor de A: " + a);
    //double a = input.nextDouble();
    
    System.out.println("Digite o valor de B: " + b);
    //double b = input.nextDouble();
    
    System.out.println("Digite o valor de C: " + c);
    //double c = input.nextDouble();
    
    double delta = Math.pow(b, 2) - 4 * a * c;
    
    System.out.println("O valor de Delta é: " + delta);
    
    input.close();
}

}
