package tiposprimitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Fábio dos Reis";
        String endereco = "Rua das Flores, 2345";
        byte idade = 38;
        char estadoCivil = 'C';
        float salario = 2300.00f;
        double num = 3.14;
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Estado civil: %c%n", estadoCivil);
        System.out.printf("Salário: %.2f%n", salario);
        System.out.printf("Double: " + num);
     }
}