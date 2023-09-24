package edu.cursos.comparableXcomparator.teste;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alunos> alunos = new ArrayList<Alunos>(){
            {
                add(new Alunos("Mendes", 789));
                add(new Alunos("David", 123));
                add(new Alunos("Anderson", 456));
                
            }
        };

        Collections.sort(alunos, new ComparatorAlunosFormatricula());

        for(Alunos aluno : alunos){
            System.out.println(aluno.getNome() +" "+ aluno.getMatricula());
        }
    }
}
