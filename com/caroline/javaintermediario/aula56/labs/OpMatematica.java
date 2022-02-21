package com.caroline.javaintermediario.aula56.labs;

public enum OpMatematica {
	
	SOMAR('+') {
		@Override
		public double executarOperacao(double x, double y) {
			double soma = x + y;
			return soma;
			
			// return x + y; solução Loiane
		}
	}, SUBTRAIR('-') {
		@Override
		public double executarOperacao(double x, double y) {
			double subtrai = x - y;
			return subtrai;
		}
	}, MULTIPLICAR('*') {
		@Override
		public double executarOperacao(double x, double y) {
			double mutiplica = x * y;
			return mutiplica;
		}
	}, 
	DIVIDIR('/') {
		@Override
		public double executarOperacao(double x, double y) {
			double dividi = x / y;
			return dividi;
		}
	};
	
	private char simbolo;
	
	OpMatematica(char simbolo) {
		this.simbolo = simbolo;
	}
	
	public char getSimbolo() {
		return this.simbolo;
	}
	
	public abstract double executarOperacao(double x, double y);
}
