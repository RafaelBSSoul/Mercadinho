import java.util.ArrayList;
import java.util.List;

import ItensDoMercado.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mercado");
        List<Produtos> itens = new ArrayList<>();
        Produtos novoItem = new Produtos();
        novoItem.setNome("Ovos");

        itens.add(novoItem);



System.out.println(itens);

    }
}
