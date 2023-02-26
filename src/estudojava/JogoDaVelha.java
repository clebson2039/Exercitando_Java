package estudojava;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jogadorAtual = 'X';
        int jogadas = 0;

        while(true) {
            // Mostra o tabuleiro atual
            mostrarTabuleiro(tabuleiro);

            // Pede a posição da jogada
            System.out.printf("Jogador %c, digite a posição da jogada (linha coluna): ", jogadorAtual);
            int linha = input.nextInt();
            int coluna = input.nextInt();

            // Verifica se a jogada é válida
            if (tabuleiro[linha][coluna] != ' ') {
                System.out.println("Posição inválida!");
                continue;
            }

            // Faz a jogada
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            // Verifica se houve um vencedor
            if (verificarVencedor(tabuleiro, jogadorAtual)) {
                mostrarTabuleiro(tabuleiro);
                System.out.printf("Jogador %c ganhou!%n", jogadorAtual);
                break;
            }

            // Verifica se houve empate
            if (jogadas == 9) {
                mostrarTabuleiro(tabuleiro);
                System.out.println("Empate!");
                break;
            }

            // Passa a vez para o próximo jogador
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        input.close();
    }

    public static void mostrarTabuleiro(char[][] tabuleiro) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d %c|%c|%c%n", i, tabuleiro[i][0], tabuleiro[i][1], tabuleiro[i][2]);
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }

    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {
        // Verifica as linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }

        // Verifica as colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }

        // Verifica as diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;

        // Se não houver v
    }
}