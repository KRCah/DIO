package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) 
	{
		try (Scanner scan = new Scanner(System.in)) {
			float a,b;
			
			System.out.println("Digite o Primeiro Valor");
			a = scan.nextInt();
			
			System.out.println("Digite o Segundo Valor");
			b = scan.nextInt();
			
			float soma = soma(a,b);
			float subtracao = subtracao(a,b);
			float divisao = divisao (a,b);
			float multiplicacao = multiplicacao (a,b);
			
			System.out.println("A soma dos numeros é " + soma);
			System.out.println("A subtração dos numeros é " + subtracao);
			System.out.println("A divisão dos numeros é " + divisao);
			System.out.println("A multiplicação dos numeros é " + multiplicacao);
		}
		
	}
	
	public static float soma (float a,float b)
	{
		return a + b;
	}
	public static float subtracao (float a, float b)
	{
		return a - b;
	}
	public static float divisao (float a,float b)
	{
		return a / b;
	}
	public static float multiplicacao (float a, float b)
	{
		return a * b;
	}
	

}
