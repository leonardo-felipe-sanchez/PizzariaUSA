package fabrica;

import Interfaces.Massa;
import Interfaces.Queijo;
import Interfaces.Tempero;

public interface PizzaIngredientFactory {
    Massa criarMassa();
    Tempero criarTempero();
    Queijo criarQueijo();
}
