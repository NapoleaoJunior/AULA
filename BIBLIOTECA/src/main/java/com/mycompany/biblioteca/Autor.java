/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Autor {
   private int codigo;
   private String nome;
   private Livro livro;
   private ArrayList<Livro> listaLivros;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(ArrayList<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }
   
   public void exibirDados(){
       System.out.println("codigo");
       System.out.println("nome");
       this.listaLivros.add(livro);
   }
}
