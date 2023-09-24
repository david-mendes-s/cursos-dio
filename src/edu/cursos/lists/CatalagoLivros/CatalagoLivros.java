package edu.cursos.lists.CatalagoLivros;

import java.util.ArrayList;

public class CatalagoLivros {

    ArrayList<Livro> livros = new ArrayList<Livro>(); 
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void pesquisarPorAutor(String autor){

        boolean isObras = false;
       
        for(Livro li : livros){
            if(li.getAutor().equals(autor)){
                System.out.println(li.getTítulo());
                isObras = true;
            }
        }

        if(!isObras){
            System.out.println("não existem obras para esse autor");
        }
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        boolean isObras = false;

        for(Livro li : livros){
            if(li.getAno() >= anoInicial && li.getAno() <= anoFinal ){
                System.out.println(li.getTítulo());
                isObras = true;
            }
        }

        if(!isObras){
            System.out.println("não existem obras para esse autor");
        }
    }

    public void pesquisarPorTitulo(String titulo){
        boolean isObras = false;
       
        for(Livro li : livros){
            if(li.getTítulo().equals(titulo)){
                System.out.println(li.getTítulo());
                isObras = true;
            }
        }

        if(!isObras){
            System.out.println("não existem obras para esse titulo");
        }
    }

}
