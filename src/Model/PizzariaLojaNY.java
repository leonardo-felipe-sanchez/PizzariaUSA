package Model;

import Abstrato.Pizza;
import Abstrato.PizzaLoja;
import fabrica.NYPizzaIngredientFactory;
import fabrica.PizzaIngredientFactory;
import model.*;

public class PizzariaLojaNY extends PizzaLoja {
    @Override
    protected Pizza criarPizza(String tipo) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (tipo) {
            case "queijo":
                pizza = new PizzaDeQueijo(ingredientFactory);
                pizza.setNome("Pizza de Queijo no estilo Nova York");
                break; //Add break statements here
            case "calabresa":
                pizza = new PizzaPepperoni(ingredientFactory);
                pizza.setNome("Pizza Calabresa no estilo Nova York");
                break; //Add break statements here
            case "vegetariana":
                pizza = new PizzaVegetal(ingredientFactory);
                pizza.setNome("Pizza Vegetariana no estilo Nova York");
                break; //Add break statements here
            default:
                // Handle the case where the pizza type is not recognized.  Perhaps throw an exception or return null.
                System.err.println("Tipo de pizza inválido: " + tipo);
                break;
        }
        return pizza;
    }
}