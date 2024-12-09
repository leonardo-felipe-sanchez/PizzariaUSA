package fabrica;

import Interfaces.Massa;
import Interfaces.Queijo;
import Interfaces.Tempero;
import model.MassaFina;
import model.Reggiano;
import model.TemperoMarinara;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Massa criarMassa() {
      return new MassaFina();
    }

    @Override
    public Tempero criarTempero() {
    return  new TemperoMarinara();    
    
    }

    @Override
    public Queijo criarQueijo() {
    return new Reggiano();   
    }

}
