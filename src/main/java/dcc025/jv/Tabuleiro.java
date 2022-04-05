/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.jv;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brysa
 */
public class Tabuleiro {

    char[][] tabuleiro = new char[3][3];
    Scanner teclado = new Scanner(System.in);

    public Tabuleiro() {

        for (int i = 0; i < this.tabuleiro.length; i++) {

            for (int j = 0; j < this.tabuleiro.length; j++) {
                this.tabuleiro[i][j] = '0';
            }
        }
    }

    public char getValorPosicao(int linha, int coluna) {
        char posicao = this.tabuleiro[linha][coluna];
        return posicao;
    }

    public void setValorPosicao(int linha, int coluna, char simbolo) {
        tabuleiro[linha][coluna] = simbolo;
    }

    public  void imprime() {
        for (int i = 0; i < this.tabuleiro.length; i++) {

            for (int j = 0; j < this.tabuleiro.length; j++) {
                if (this.tabuleiro[i][j] == '0') {
                    System.out.print(" |");
                } else {
                    System.out.print(this.tabuleiro[i][j] + "|");
                }
            }
            System.out.println("  ");
        }

    }
     public boolean adicionarJogada(Jogador jg)
    {
        int linha;
        int coluna;
        System.out.println("Para adicionar um jogada digite: ");
        System.out.println("([linha],[coluna])");
        String jogada = "(0,0)";
        jogada = teclado.nextLine();
        jogada = jogada.trim();
        if (jogada.matches("\\(\\d{1}+,\\d{1}+\\)")) {
            linha = (Integer.parseInt(String.valueOf(jogada.charAt(1)))) - 1;
            coluna = (Integer.parseInt(String.valueOf(jogada.charAt(3)))) - 1;
            if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
                if (getValorPosicao(linha,coluna)!= '0') {
                    System.out.println("Linhas e colunas selecionadas previamentes nao podem ser alteradas");
                    return false;

                } else {
                   setValorPosicao(linha,coluna,jg.simbolo);
                   return true;
                }

            } else {
                System.out.println("Linha ou coluna selecionada nao existe");
                return false;
            }
        } else {
            System.out.println("Digite no formato solicitado");
            return false;
        }
    }
    public  void bot(Jogador jg)
    {
        Random gerador = new Random();
        int lin ;
        int col ; 
        System.out.println("Bot fazendo jogada...");
        lin = gerador.nextInt(3);
        col = gerador.nextInt(3);
        while(getValorPosicao(lin,col)!= '0')
        {
            lin = gerador.nextInt(3);
            col = gerador.nextInt(3);                                        //getProxLinha,getProxColuna
        }
         setValorPosicao(lin,col,jg.getSimbolo());
        System.out.println("Jogada feita pelo bot - linha[ " + (lin+1)+ "] coluna [ " + (col+1)+"] ");
    }
}
