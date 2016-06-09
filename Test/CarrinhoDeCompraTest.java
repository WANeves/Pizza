import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wellingtonalvesdasneves on 6/9/16.
 */
public class CarrinhoDeCompraTest {

    @Test
    public void testVrTotalCarrinho(){
        Pizza p1 = new Pizza("Calabresa");

        p1.adicionaIngrediente("Molho de Tomate");
        p1.adicionaIngrediente("Palmito");
        p1.adicionaIngrediente("Cebola");
        p1.adicionaIngrediente("Tempero");
        p1.adicionaIngrediente("Massa");

        Pizza p2 = new Pizza("Pizza e Mussarela");

        p2.adicionaIngrediente("Presunto");
        p2.adicionaIngrediente("Mussarela");
        p2.adicionaIngrediente("Molho de Tomate");
        p2.adicionaIngrediente("Massa");

        Pizza p3 = new Pizza("Frango c/ Catupiry");

        p3.adicionaIngrediente("Frango");
        p3.adicionaIngrediente("Catupiry");
        p3.adicionaIngrediente("Massa");

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.addPizza(p1);
        carrinhoDeCompra.addPizza(p2);
        carrinhoDeCompra.addPizza(p3);

        assertEquals(Double.valueOf(60.0), Double.valueOf(carrinhoDeCompra.getVrTotal()));
    }

    @Test
    public void testPizzaSemIngrediente(){
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        Pizza lombo = new Pizza("Lombo");
        carrinhoDeCompra.addPizza(lombo);

        assertEquals(Double.valueOf(0), Double.valueOf(carrinhoDeCompra.getVrTotal()));
    }
}