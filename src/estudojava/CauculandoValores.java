package estudojava;

import javax.swing.JOptionPane;

public class CauculandoValores {
    public static void main(String []args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qal o seu salário"));
        
        JOptionPane.showMessageDialog(null,"Olá " + nome +", é um prazer te conhecer."
                +"\n O slário digitado foi " + salario);
    }
   }