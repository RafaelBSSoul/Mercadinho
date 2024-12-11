import java.util.ArrayList;
import java.util.List;

import ItensDoMercado.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mercado");
        List<Produtos> itens = new ArrayList<>();
        Produtos novoItem = new Produtos();
        Produtos novoItem2 = new Produtos();
        novoItem2.setNome("Caixas");
        novoItem.setNome("Ovos");

        itens.add(novoItem);
        itens.add(novoItem2);


itens.stream().forEach(e->System.out.println(itens));
    }
}
