package edu.cursos.lists.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {

    ArrayList<Integer> numeros = new ArrayList<Integer>();

    public void adicionarNumero(int numero){
        numeros.add(numero);
    } 
    public void ordenarAscendente(){
        Collections.sort(numeros);

    } 
    public void ordenarDescendente(){
        numeros.sort(Collections.reverseOrder());
    }
    
   
}
