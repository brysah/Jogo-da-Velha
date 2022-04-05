/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dcc025.jv;
import java.util.Random;

/**
 *
 * @author brysa
 */
public class Jogador {
    int id_jogador;
    String nome;
    char simbolo;
    

    public Jogador(int id_jogador) {
        this.id_jogador = id_jogador;
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setSimbolo(char simbolo)
    {
        this.simbolo = simbolo;
    }
    public String getNome()
    {
        return this.nome;
    }
    public char getSimbolo()
    {
        return this.simbolo;
    }


   
    
}
