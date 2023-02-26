package atividade;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        

        double largura = 5.0;
        double altura = 3.0;
        System.out.println("Digite a largura da parede (em metros): " + largura);
        //double largura = entrada.nextDouble();
        
        System.out.println("Digite a altura da parede (em metros): " + altura);
        //double altura = entrada.nextDouble();
        
        double area = largura * altura;
        double litrosTinta = area / 2;
        
        System.out.printf("A área a ser pintada é de %.2f m²\n", area);
        System.out.printf("Você precisará de %.2f litros de tinta\n", litrosTinta);
        
        entrada.close();
    }

}
