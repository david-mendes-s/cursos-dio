package edu.cursos.lists.SomaNumeros;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(40);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(0);
        numeros.adicionarNumero(1);

        numeros.calcularSoma();
        numeros.encontrarMaiorNumero();
        numeros.encontrarMenorNumero();

        numeros.exibirNumeros();
    }
}
