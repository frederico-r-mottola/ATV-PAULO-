package br.senai.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    //atributos
    private String descricao;
    private String data;
    private double total;
    private ArrayList<ItensDoPedido> itens;

    public Pedido(String descricao, String data) {
        this.descricao = descricao;
        this.data = data;
        itens = new ArrayList<>();
    }

    public void setItem(String nome, double preco, int qtde){
        Produto p1 = new Produto(nome, preco);
        ItensDoPedido item = new ItensDoPedido(p1, qtde);
        this.itens.add(item);
        total += preco*qtde;

   }


    @Override
    public String toString() {
        return
                "Descrição = " + descricao + " \nData = " + data +
                "\nTotal = " + total +
                "\nItensDoPedido=" + itens + "\n"
                ;


    }
}