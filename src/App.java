import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ItensDoMercado.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Mercado");
        int iniciar;
        List<Produtos> itens = new ArrayList<>();
        Produtos novoItem = new Produtos();
            








        novoItem.setNome("Ovos");
        itens.add(novoItem);
itens.stream().findFirst();

itens.stream().forEach(e->System.out.println(itens));
//Adicionar

iniciar = entrada.nextInt();
switch (iniciar) {
    case 1://cadastrar
    novoItem.cadastrar();
        
System.out.println(itens);

        break;

          case 2://remover
        
             break;

    default:
        break;
}



entrada.close();
    }
}
