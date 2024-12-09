package model;

import Abstrato.Pizza;
import fabrica.PizzaIngredientFactory;

public class PizzaDeQueijo extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PizzaDeQueijo(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory); // Call the Pizza constructor (assuming you've modified it)
    }

    @Override
        protected void preparacao() {
            
            massa = ingredientFactory.criarMassa();
            tempero = ingredientFactory.criarTempero();
            queijo = ingredientFactory.criarQueijo();
            System.out.println("Preparing " + getNome() + " with " + massa.getName() + ", " + tempero.getName() + ", and " + queijo.getName());
            printToppings();
        }


    
}
