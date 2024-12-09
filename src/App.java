
import Abstrato.PizzaLoja;
import Model.PizzariaLojaNY;

public class App {
    public static void main(String[] args) throws Exception {
        PizzaLoja nyStore = new PizzariaLojaNY();
        nyStore.pedirPizza("queijo");
        nyStore.pedirPizza("calabresa");
        nyStore.pedirPizza("vegetariana");
    }
}
