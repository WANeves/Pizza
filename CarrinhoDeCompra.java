import java.util.ArrayList;

/**
 * Created by wellingtonalvesdasneves on 6/6/16.
 */
public class CarrinhoDeCompra {

    private ArrayList<Pizza> itensCarrinho = new ArrayList<Pizza>();
    private double vrTotal = 0;

    public void addPizza(Pizza pizza){
        if (pizza.getCountIngredientesPizza() > 0) {
            this.itensCarrinho.add(pizza);
        }
    }

    public double getVrTotal() {

        for (Pizza p: itensCarrinho) {
            vrTotal += p.getPreco();
        }

        return vrTotal;
    }

    public void listaSabores(){

        for (Pizza p: itensCarrinho) {
            System.out.println(" * " + p.getSabor() + " | Valor R$ " + p.getPreco());
        }
        System.out.println();
    }

    public void listaIngredientesPizza(){
        for( String p : Pizza.ingredientes.keySet() ){
            System.out.println("Ingrediente: " + p + " - Qtde: " + Pizza.ingredientes.get(p) );
        }
    }

}
