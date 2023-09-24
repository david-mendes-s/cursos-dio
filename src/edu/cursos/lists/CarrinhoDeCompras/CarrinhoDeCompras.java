package edu.cursos.lists.CarrinhoDeCompras;

import java.util.ArrayList;

import edu.cursos.lists.ListaTarefas.Tarefas;

public class CarrinhoDeCompras {
    ArrayList<Item> carrinhoDeCompras = new ArrayList<Item>();

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public Item buscarItem(String nome){
        Item item = null;
        
        for(Item t : carrinhoDeCompras){
            if(t.getNome() == nome){
                item = t;
            }
        }

        return item;
    }

    public void removerItem(String nome){
        if(buscarItem(nome).getNome() == nome){
            carrinhoDeCompras.remove(buscarItem(nome));
        }else{
            System.out.println("Item não encontrado");
        }
        
    }

    public void calcularValorTotal(){
        double soma = 0;
        
        for(Item t : carrinhoDeCompras){
            soma += (t.getPreco() * t.getQuantidade());
        }

        System.out.println("Total do carrinho: "+soma);
    }

    public void exibirItens(){
        for(Item t : carrinhoDeCompras){
           System.out.println("Descrição: "+t.getNome()+" - Preço: R$ "+ t.getPreco() + " - Qtd: "+ t.getQuantidade());
        }
    }
}
