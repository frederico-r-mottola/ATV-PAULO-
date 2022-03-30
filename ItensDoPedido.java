package br.senai.model;

public class ItensDoPedido {
    //atributos
    private Produto produto;
    private int quantidade;

    public ItensDoPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "ItensDoPedido :" +
                "Produto : " + produto +
                "Quantidade =" + quantidade;
    }
}
