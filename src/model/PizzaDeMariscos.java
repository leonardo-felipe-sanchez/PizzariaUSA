package model;

import Abstrato.Pizza;
import fabrica.PizzaIngredientFactory;

public class PizzaDeMariscos extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PizzaDeMariscos(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory); // Call the Pizza constructor (assuming you've modified it)
    }

    @Override
        public void preparacao() {
            
            massa = ingredientFactory.criarMassa();
            tempero = ingredientFactory.criarTempero();
            queijo = ingredientFactory.criarQueijo();
            adicionarCobertura(new CoberturaMarisco());
            System.out.println("Preparing " + getNome() + " with " + massa.getName() + ", " + tempero.getName() + ", and " + queijo.getName());
            printToppings();
        }


    
}
