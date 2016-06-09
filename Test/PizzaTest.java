import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by wellingtonalvesdasneves on 6/9/16.
 */
public class PizzaTest {

    @Test
    public void testValorPizza(){
        Pizza p1 = new Pizza("Calabresa c/ Catupiry");

        p1.adicionaIngrediente("Molho de Tomate");
        p1.adicionaIngrediente("Calabresa");
        p1.adicionaIngrediente("Cebola");
        p1.adicionaIngrediente("Catupiry");
        p1.adicionaIngrediente("Tempero");
        p1.adicionaIngrediente("Massa");

        assertEquals(Double.valueOf(23.0), Double.valueOf(p1.getPreco()));
    }

    @Test
    public void testAddIngredientes(){
        Pizza portuguesa = new Pizza("Calabresa c/ Catupiry");

        portuguesa.adicionaIngrediente("Molho de Tomate");
        portuguesa.adicionaIngrediente("Palmito");
        portuguesa.adicionaIngrediente("Cebola");
        portuguesa.adicionaIngrediente("Catupiry");
        portuguesa.adicionaIngrediente("Tempero");
        portuguesa.adicionaIngrediente("Massa");

        assertEquals(6, portuguesa.getCountIngredientesPizza());
    }

    @After
    public void testZeraIngredientes(){
        Pizza.zeraIngredientes();
    }
}