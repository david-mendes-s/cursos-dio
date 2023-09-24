package edu.cursos.lists.ListaTarefas;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefas> tarefas = new ArrayList<Tarefas>();

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefas(descricao));
    }

    public Tarefas buscarTarefa(String descricao){
        Tarefas tarefa = null;

        for(Tarefas t : tarefas){
            if(t.getDescrição().equals(descricao)){
                tarefa = t;
            }
        }

        return tarefa;
    }

    public void removerTarefa(String descricao){
        if(buscarTarefa(descricao).getDescrição() == descricao){
            tarefas.remove(buscarTarefa(descricao));
        }else{
            System.out.println("Tarefa não encontrada");
        }
    }

    public void obterNumeroTotalTarefas(){
        System.out.println(tarefas.size());
    }

    public void obterDescricoesTarefas(){
        for(Tarefas t : tarefas){
            System.out.println(t.getDescrição());
        }
    }

}
