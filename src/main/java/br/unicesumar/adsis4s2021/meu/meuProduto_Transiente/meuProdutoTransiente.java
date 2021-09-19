package br.unicesumar.adsis4s2021.meu.meuProduto_Transiente;

public class meuProdutoTransiente {

    private String id;
    private String nome;
    private double preco;

    public meuProdutoTransiente(String id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;   
    }

    public String getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
       
}
