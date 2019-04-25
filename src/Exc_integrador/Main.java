package Exc_integrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int digitar;

        Livraria livrariaDH = new Livraria();
        List<Livro> colecaoHP = new ArrayList();
        List<Livro> colecaoGOT = new ArrayList();
        Livraria colecaoHarryPotter = new Livraria();

        Livro livro = new Livro("Romeu & Julieta",1000,"William Shakespeare",50.48,"2016",1);
        livro.gerarcodigoISBN();
        Livro livro1 = new Livro("Java para Iniciantes",1001,"Herbet Schildt",152.00,"2015",1);
        livro1.gerarcodigoISBN();
        Livro livro2 = new Livro("HP Lovecraft",1002,"Howard Phillips",29.90,"2018",1);
        Colecao harryportter = new Colecao();
        Livro harry1 = new Livro ("Harry Potter 1",1003,"J.K. Howling",150.00,"2008",20);
        harry1.gerarcodigoISBN();
        Livro harry2 = new Livro ("Harry Potter 2",1004,"J.K. Howling",165.00,"2010",25);
        harry2.gerarcodigoISBN();
        Livro harry3 = new Livro ("Harry Potter 3",1005,"J.K. Howling",180.00,"2011",28);
        harry3.gerarcodigoISBN();
        colecaoHP.add(harry1);
        colecaoHP.add(harry2);
        colecaoHP.add(harry3);

        Colecao got = new Colecao();
        Livro got1 = new Livro("GOT - 1",1006,"George R.R. Martim",190.00,"2012",40);
        got1.gerarcodigoISBN();
        Livro got2 = new Livro("GOT - 2",1007,"George R.R. Martim",210.00,"2016",60);
        got2.gerarcodigoISBN();
        Livro got3 = new Livro("GOT - 3",1008,"George R.R. Martim",255.00,"2018",100);
        got3.gerarcodigoISBN();







        //   livrariaDH.cadastrarLivro(livro);
     //   livrariaDH.cadastrarLivro(livro1);
    //    livrariaDH.cadastrarLivro(livro2);

       // livrariaDH.consultarLivro(1005);
       // livrariaDH.efetuarVenda(1000);
       // livrariaDH.efetuarVenda(1000);

        System.out.println("Venda de Coleção de Livros" + "(1)");
        Scanner sc = new Scanner(System.in);
        digitar = sc.nextInt();






    }
}
