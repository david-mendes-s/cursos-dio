package edu.cursos.comparableXcomparator.teste;

import java.util.Comparator;

public class Alunos /* implements Comparable<Alunos> */{
    String nome;
    int matricula;

    public Alunos(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /* @Override
    public int compareTo(Alunos alu) {
        return Integer.compare(matricula, alu.matricula);
    } */


}

class ComparatorAlunosForName implements Comparator<Alunos>{

    @Override
    public int compare(Alunos arg0, Alunos arg1) {
        return arg0.getNome().compareTo(arg1.getNome());
    }

}

class ComparatorAlunosFormatricula implements Comparator<Alunos>{

    @Override
    public int compare(Alunos arg0, Alunos arg1) {
        return Integer.compare(arg0.getMatricula(), arg1.getMatricula());
    }

}