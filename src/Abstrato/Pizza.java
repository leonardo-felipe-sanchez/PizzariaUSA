package Abstrato;

import Interfaces.*; //Make sure you have this line and have implemented your interfaces
import fabrica.PizzaIngredientFactory;
import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String nome;
    protected Massa massa;
    protected Tempero tempero;
    protected Queijo queijo;
    List<Cobertura> coberturas;
    PizzaIngredientFactory ingredientFactory;

    //CONSTRUCTOR ADDED HERE
    public Pizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    protected abstract void preparacao();
    public void cozimento() { System.out.println("Assar por 25 minutos a 350º"); }
    public void fatiamento() { System.out.println("Cortar as fatias em diagonais"); }
    public void embalagem() { System.out.println("Colocar a pizza na caixa oficial da pizzaria"); }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    protected void adicionarCobertura(Cobertura cobertura) {
        if (coberturas == null) coberturas = new ArrayList<>();
        coberturas.add(cobertura);
    }
    protected void printToppings() {
        if (coberturas != null && !coberturas.isEmpty()) {
            System.out.print("Coberturas: ");
            for (Cobertura cobertura : coberturas) {
                System.out.print(cobertura.getName() + ", ");
            }
            System.out.println();
        }
    }
}

// ... (Other classes: PizzaDeQueijo, PizzaLoja, App, etc.) ...