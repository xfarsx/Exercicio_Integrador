package Exc_integrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Livro {

    private String titulo;
    private int codigo;
    private String autor;
    private double preco;
    private String anoDeLancamento;
    private int codigoISBN;
    private int qtdEstoque;

    public Livro() {
    }
    public Livro(String titulo, int codigo, String autor, double preco, String anoDeLancamento, int qtdEstoque) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.preco = preco;
        this.anoDeLancamento = anoDeLancamento;
        this.qtdEstoque = qtdEstoque;
    }
    public Livro(String titulo, int codigo, String autor, double preco, String anoDeLancamento, int codigoISBN, int qtdEstoque) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autor = autor;
        this.preco = preco;
        this.anoDeLancamento = anoDeLancamento;
        this.codigoISBN = codigoISBN;
        this.qtdEstoque = qtdEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(int codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    public void gerarcodigoISBN ()
    {
        int codigoIBSN = 0;
        Random random = new Random ();
        this.setCodigoISBN(random.nextInt(1000000));

    }
}
