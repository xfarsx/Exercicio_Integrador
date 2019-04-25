package Exc_integrador;

import java.util.List;

public class Colecao {

    private List<Livro> livroDaColecao;
    private int codigo;
    private double preco;
    private String descricao;

    public Colecao() {
    }

    public Colecao(List<Livro> livroDaColecao) {
        this.livroDaColecao = livroDaColecao;

    }
    public Colecao(List<Livro> livroDaColecao, int codigo, double preco, String descricao) {
        this.livroDaColecao = livroDaColecao;
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public List<Livro> getLivroDaColecao() {
        return livroDaColecao;
    }

    public void setLivroDaColecao(List<Livro> livroDaColecao) {
        this.livroDaColecao = livroDaColecao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
