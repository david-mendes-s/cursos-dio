package edu.cursos.lists.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoPessoas {
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade(){
        Collections.sort(pessoas, new OrdenarPorIdade());

        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa.getNome()+" - "+pessoa.getIdade());
        }
    } 

    public void ordenarPorAltura(){
        Collections.sort(pessoas, new OrdenarPorAltura());

        for(Pessoa pessoa: pessoas){
            System.out.println(pessoa.getNome()+" - "+String.format("%.2f", pessoa.getAltura()));
        }
    }

}

class OrdenarPorIdade implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {
       return Integer.compare(arg0.getIdade(), arg1.getIdade());
    }
    
}

class OrdenarPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa arg0, Pessoa arg1) {
       return Double.compare(arg0.getAltura(), arg1.getAltura());
    }
    
}