package edu.cursos.projetos.ContaBancaria;

import java.util.Scanner;

public class ContaTerminal {

    int numeroConta;
    String agencia;
    String cliente;
    double saldo; 
    
    public void status(){
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia ! ");
        agencia = in.next();
        System.out.println("Informe o numero da Conta ! ");
        numeroConta = in.nextInt();
        System.out.println("Digite seu Nome: ");
        cliente = in.next();
        System.out.println("Informe seu saldo da conta");
        saldo = in.nextDouble();

        System.out.println("Olá "+ cliente 
        +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+
        " , conta "+ numeroConta+ " e seu saldo "+saldo+" já está disponível para saque");
    }
}
