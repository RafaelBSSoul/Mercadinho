import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ItensDoMercado.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Mercado");
        String iniciar;
        List<Produtos> itens = new ArrayList<>();
        Produtos novoItem = new Produtos();
        Produtos novoItem2 = new Produtos();
        novoItem2.setNome("Caixas");
        novoItem.setNome("Ovos");
        itens.add(novoItem);
        itens.add(novoItem2);
itens.stream().findFirst();

itens.stream().forEach(e->System.out.println(itens));
//Adicionar
iniciar = entrada.nextLine();
switch (iniciar) {
    case value:
        
        break;

          case value:
        
             break;

    default:
        break;
}



entrada.close();
    }
}
