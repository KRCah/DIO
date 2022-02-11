package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma
{
    public static void main(String[] args)
    {
        Gato gato = new Gato("Blue","siames", 2);
        System.out.println(gato);

        /*int a=10;
        int b=2;
        System.out.println("Hello World" + (a*b));*/

        Livro livrinho = new Livro("Aprendendo Programação", 300);
        System.out.println(livrinho);
    }

}

class Livro
{
    private String nome;
    private int numPaginas;

    public Livro(String nome, int numPaginas)
    {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
