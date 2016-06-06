import java.util.HashMap;
import java.util.Map;

/**
 * Created by wellingtonalvesdasneves on 6/6/16.
 */
public class Pizza {
    public static Integer totalIngredientes = 0;
    public static Map<String, Integer> ingredientes = new HashMap<>();

    private String sabor;

    public Pizza(String sabor) {
        this.sabor = sabor;
    }

    public void adicionaIngrediente(String ingrediente){

        if (!ingredientes.containsKey(ingrediente) ){
            ingredientes.put(ingrediente, 1);
        } else{
            ingredientes.computeIfPresent(ingrediente,(k,v) -> v + 1);
        }

        contabilizaIngrediente();
    }

    public static void contabilizaIngrediente(){
        totalIngredientes += 1;
    }

    public Double getPreco(){
        double preco = 0;

        if (totalIngredientes >= 2) {
            preco = 15;
        }else if(totalIngredientes >= 3 && totalIngredientes <= 5){
            preco = 20;
        }else{
            preco = 23;
        }
        return preco;
    }

//    public void listaDeIngredientes() {
//        for (Map<String, Integer> item : ingredientes)
//            System.out.println("Ingrediente Utilizado : " + item.getKey() + " " + item.getValue() + " unidade(s)");
//    }

    public String getSabor() {
        return sabor;
    }
}
