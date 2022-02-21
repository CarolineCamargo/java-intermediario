package com.caroline.javaintermediario.aula56.labs;

public class Calculadora {

	public static void main(String[] args) {

		for (OpMatematica operacao : OpMatematica.values()) {
			
			double x = 10;
			double y = 2;
			
			System.out.print(x + " ");
			System.out.print(operacao.getSimbolo() + " ");
			System.out.print(y + " = ");
			System.out.println(operacao.executarOperacao(x, y));
		}
	}
}
