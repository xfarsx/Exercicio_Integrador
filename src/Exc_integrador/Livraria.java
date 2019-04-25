package Exc_integrador;
import java.util.ArrayList;
import java.util.List;


public class Livraria extends Livro {

    List<Livro> cadastroDeLivros = new ArrayList<>();
    List<Colecao> livrosDaColecao = new ArrayList<>();


    public void cadastrarLivro (Livro livro)
    {
        cadastroDeLivros.add(livro);
        //System.out.println("===================\nLivro Cadastrado!\n===================");
    }
    public void consultarLivro (Integer codigo)
    {
        String nExiste = "teste";
        for (int x = 0;x<cadastroDeLivros.size();x++) {
            if (codigo == cadastroDeLivros.get(x).getCodigo()) {
              nExiste = "falso";
            }
        }
            if (nExiste.equals("falso"))
            {
                for (int i = 0; i<cadastroDeLivros.size();i++)
                {
                    if (codigo == cadastroDeLivros.get(i).getCodigo())
                    {
                        System.out.println("=======================\n" + "Título: " + cadastroDeLivros.get(i).getTitulo() + "\nAutor: " + cadastroDeLivros.get(i).getAutor()
                                + "\nData de Lançamento: " + cadastroDeLivros.get(i).getAnoDeLancamento() + "\nPreço: R$" + cadastroDeLivros.get(i).getPreco() +
                                "\nCódigo ISBN: " + cadastroDeLivros.get(i).getCodigoISBN() + "\n=======================");
                    }
                }
            }
            if (!nExiste.equals("falso"))
            {
                System.out.println("Livro não encontrado!");
            }


    }
    public void efetuarVenda (Integer codigo) {

        int menosEstoque =0;
        for (int i = 0; i < cadastroDeLivros.size(); i++) {
            if (cadastroDeLivros.get(i).getQtdEstoque() == 0){
                System.out.println("Estoque esgotado!");}
            else if (codigo == cadastroDeLivros.get(i).getCodigo()) {
                menosEstoque = cadastroDeLivros.get(i).getQtdEstoque() - 1;
                cadastroDeLivros.get(i).setQtdEstoque(menosEstoque);
                System.out.println("=====Livro Vendido====\n" + "Título: " + cadastroDeLivros.get(i).getTitulo() + "\nAutor: " + cadastroDeLivros.get(i).getAutor()
                        + "\nData de Lançamento: " + cadastroDeLivros.get(i).getAnoDeLancamento() + "\nPreço: R$" + cadastroDeLivros.get(i).getPreco() +
                        "\nCódigo ISBN: " + cadastroDeLivros.get(i).getCodigoISBN() + "\n=======================");

            }
        }
    }

   // public void criarColecao(List<Livro> lista)
   // {

        //livrosDaColecao.add(lista);

  //  }


}
