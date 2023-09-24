package edu.cursos.lists.OrdenacaoNumeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros numero = new OrdenacaoNumeros();

        numero.adicionarNumero(0);
        numero.adicionarNumero(10);
        numero.adicionarNumero(10);
        numero.adicionarNumero(20);
        numero.adicionarNumero(30);

        numero.ordenarAscendente();

        System.out.println(numero.numeros);

        numero.ordenarDescendente();

        System.out.println(numero.numeros);

    }
}
