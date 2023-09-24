package edu.cursos.lists.CatalagoLivros;

public class Main {
    public static void main(String[] args) {
        CatalagoLivros cl = new CatalagoLivros();

        cl.adicionarLivro("ladrão de raios", "david", 2023);
        cl.adicionarLivro("ladrão de supinos", "anderson", 2021);
        cl.adicionarLivro("ladrão de halters", "mendes", 2018);
        cl.adicionarLivro("ladrão de cargas", "david", 2020);

        cl.pesquisarPorTitulo("ladrão de raios");
    }
}
