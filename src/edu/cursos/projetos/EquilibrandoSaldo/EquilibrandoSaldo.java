package edu.cursos.projetos.EquilibrandoSaldo;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println("Saldo atualizado na conta: "+calcularSaldo(saldoAtual, valorDeposito, valorRetirada));
    }

    public static double calcularSaldo(double saldoAtual, double valorDeposito, double valorRetirada){
        double resultado = saldoAtual + valorDeposito - valorRetirada;

        return resultado;
    }
}
