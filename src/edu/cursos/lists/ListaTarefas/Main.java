package edu.cursos.lists.ListaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        listaTarefa.adicionarTarefa("Beber água");
        listaTarefa.adicionarTarefa("Tomar Banho");

        listaTarefa.obterNumeroTotalTarefas();
        listaTarefa.obterDescricoesTarefas();
    }
}
