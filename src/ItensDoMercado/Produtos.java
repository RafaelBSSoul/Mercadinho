package ItensDoMercado;

public class Produtos {
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
    
}
