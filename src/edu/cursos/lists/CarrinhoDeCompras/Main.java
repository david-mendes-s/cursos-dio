package edu.cursos.lists.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras cart = new CarrinhoDeCompras();

        cart.adicionarItem("batata", 50.2, 2);
        cart.adicionarItem("bolacha", 12, 3);

        cart.exibirItens();
        cart.calcularValorTotal();
        cart.removerItem("batata");

        cart.exibirItens();
        cart.calcularValorTotal();
        
    }
}
