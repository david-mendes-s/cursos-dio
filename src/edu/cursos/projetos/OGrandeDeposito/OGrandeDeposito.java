package edu.cursos.projetos.OGrandeDeposito;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OGrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(valor));

        if (valor > 0) {
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
            System.out.println("Deposito realizado com sucesso!\r\n" + //
                    "Saldo atual: "+ String.format("%.2f", valor));
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
            System.out.println("Encerrando o programa...");
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
             System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
    }
}