package br.com.dio.model;

import java.util.Objects;

public class Gato
{
    private String nome;
    private String color;
    private int idade;

    public Gato(String nome, String color, int idade)
    {
        this.nome = nome;
        this.color = color;
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return idade == gato.idade && Objects.equals(nome, gato.nome) && Objects.equals(color, gato.color);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nome, color, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", color='" + color + '\'' +
                ", idade=" + idade +
                '}';
    }
}
