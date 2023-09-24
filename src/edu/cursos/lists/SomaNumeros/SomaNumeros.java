package edu.cursos.lists.SomaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SomaNumeros {
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public void calcularSoma(){
        int soma = 0;
        
        for(Integer num : numeros){
            soma += num;
        }

        System.out.println("A soma total é: "+soma);

    }

    public void encontrarMaiorNumero(){
        int numero = 0;

        for(Integer num : numeros){
            if(num > numero){
                numero = num;
            }
        }

        System.out.println("O maior numero: "+numero);
    }

    public void encontrarMenorNumero(){
        int numero = numeros.get(0);

        for(Integer num : numeros){
            
            if(num < numero){
                numero = num;
            }
        }

        System.out.println("O menor numero: "+numero);
    }

    public void exibirNumeros(){

        Collections.sort(numeros, new OrdenarNumero());

        for(Integer num : numeros){
            System.out.print(num+" - "); 
        }
    }
}

class OrdenarNumero implements Comparator<Integer>{

    @Override
    public int compare(Integer arg0, Integer arg1) {
       return Integer.compare(arg0, arg1);
    }
}