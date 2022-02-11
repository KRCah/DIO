package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        float a,b;

        System.out.println("Digite o primeiro numero");
        a= scan.nextFloat();
        System.out.println("Digite o primeiro numero");
        b= scan.nextFloat();

        float soma = soma(a,b);
        float subtracao = subtracao(a,b);
        float multiplicacao = multiplicacao(a,b);
        float divisao = divisao(a,b);

        System.out.println("A resultado da soma é "+soma);
        System.out.println("A resultado da subtração é "+subtracao);
        System.out.println("A resultado da multiplicação é "+multiplicacao);
        System.out.println("A resultado da divisão é "+divisao);

    }

    public static float soma(float a, float b)
    {
        return a + b;
    }
    public static float subtracao(float a, float b)
    {
        return a - b;
    }
    public static float multiplicacao(float a, float b)
    {
        return a * b;
    }
    public static float divisao(float a, float b)
    {
        return a / b;
    }

}
