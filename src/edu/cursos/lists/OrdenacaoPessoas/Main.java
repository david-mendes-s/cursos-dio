package edu.cursos.lists.OrdenacaoPessoas;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas pessoa = new OrdenacaoPessoas();

        pessoa.adicionarPessoa("David", 23, 1.70);
        pessoa.adicionarPessoa("Telma", 43, 1.55);

        pessoa.ordenarPorAltura();
        pessoa.ordenarPorIdade();
    }
}
