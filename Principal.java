/**
 * Created by wellingtonalvesdasneves on 6/6/16.
 */
public class Principal {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Calabresa");
        Pizza p2 = new Pizza("Presunto e Queijo");
        Pizza p3 = new Pizza("Frango com Catupiry");

        p1.adicionaIngrediente("Molho de Tomate");
        p1.adicionaIngrediente("Calabresa");
        p1.adicionaIngrediente("Massa");

        p2.adicionaIngrediente("Presunto");
        p2.adicionaIngrediente("Mussarela");
        p2.adicionaIngrediente("Molho de Tomate");
        p2.adicionaIngrediente("Massa");

        p3.adicionaIngrediente("Frango");
        p3.adicionaIngrediente("Catupiry");
        p3.adicionaIngrediente("Massa");

        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.addPizza(p1);
        carrinhoDeCompra.addPizza(p2);
        carrinhoDeCompra.addPizza(p3);

        System.out.println("| Relatório de Sabores |");
        carrinhoDeCompra.listaSabores();

        System.out.println("| Relatório de Valor |");
        Double vrTotalCarrinho = carrinhoDeCompra.getVrTotal();

        if (vrTotalCarrinho > 0 ) {
            System.out.println("Preço Total: R$ " + vrTotalCarrinho);
        }else {
            System.out.println("Carrinho de Compras Vazio!");
        }

        System.out.println();
        System.out.println("| Relatório de Ingredientes |");
        carrinhoDeCompra.listaIngredientesPizza();
    }
}
