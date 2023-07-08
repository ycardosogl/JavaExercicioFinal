package atividade;

public class Produto {
    private String nome;
    private String cod;
    private int qtd;
    private Double preco;

    
    public Produto(String nome, String cod, int qtd, Double preco) {
        this.nome = nome;
        this.cod = cod;
        this.qtd = qtd;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public Double calcPrecoVenda(){

        Double precoVenda = preco+(preco*0.8);
        return precoVenda;
    }

}
