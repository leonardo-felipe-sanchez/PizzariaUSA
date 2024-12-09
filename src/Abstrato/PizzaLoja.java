package Abstrato;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



public abstract class PizzaLoja {
protected abstract Pizza criarPizza(String tipo);

    public Pizza pedirPizza(String tipo) {
        Pizza pizza = criarPizza(tipo);
        System.out.println("--- Fazendo uma " + pizza.getNome() + " ---");
        pizza.preparacao();
        pizza.cozimento();
        pizza.fatiamento();
        pizza.embalagem();
        return pizza;
    }
}
