package br.senai;

import br.senai.model.Pedido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido("Produtos do Cliente 1","24/03");
        pedido1.setItem("Nescau ",5, 2);
        pedido1.setItem("Toddy ",5, 5);
        pedido1.setItem("Uva k",5, 5);
        pedido1.setItem("Cenoura k",5, 5);
        pedido1.setItem("Maça un",5, 4);
        pedido1.setItem("Uva-Verde k",5, 2);
        pedido1.setItem("Guaraná Jesus 350ml un",5, 2);
        pedido1.setItem("Coca-Cola 2l un",5, 2);
        pedido1.setItem("Pureza 2l",5, 2);
        pedido1.setItem("Tainha 1k",25, 1);
        System.out.println("Pedido 1 - \n" + pedido1);

        Pedido pedido2 = new Pedido("Produtos do Cliente 2","24/03");
        pedido2.setItem("Cocaína",25,1);
        pedido2.setItem("Crack",2,1);
        pedido2.setItem("Vodka Raiska",15,1);
        pedido2.setItem("MariaJuana",3,1);
        pedido2.setItem("Loló",100,1);
        pedido2.setItem("Laça-Perfume",50,1);
        pedido2.setItem("Whisky",120,1);
        pedido2.setItem("Cola de Sapateiro",12,1);
        pedido2.setItem("Catuaba",10,1);
        pedido2.setItem("Ópio",0.50,1);
        System.out.println("Pedido 2 -" + pedido2);



   }





}
