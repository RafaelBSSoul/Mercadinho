package ItensDoMercado;

import java.util.Scanner;

public class Produtos {

    Scanner entradaDeProdutos = new Scanner(System.in);
   private String nome;
   private int codigo;
   private double valor;
@Override
public String toString() {
    return "Produtos [nome=" + nome + ", codigo=" + codigo + ", valor=" + valor + "]";
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public int getCodigo() {
    return codigo;
}
public void setCodigo(int codigo) {
    this.codigo = codigo;
}
public double getValor() {
    return valor;
}
public void setValor(double valor) {
    this.valor = valor;
}
    public void cadastrar(){
        int cod = 1;
nome = entradaDeProdutos.nextLine();
codigo = cod++;
valor = entradaDeProdutos.nextDouble();

    }
}
