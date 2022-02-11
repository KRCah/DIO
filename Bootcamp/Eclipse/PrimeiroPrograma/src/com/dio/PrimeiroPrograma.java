package com.dio;

import com.dio.gato.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) 
	{
		Gato gato = new Gato("Blue","Siames",2);
		System.out.println(gato);
	//*******************************************************************
		int a= gato.getIdade();
		String nome = gato.getNome();
		int b=2;

		System.out.println("Hello World, " + nome +" have "+ a +" years old" + "valor de b" + b);

	}

}
