package com.caroline.javaintermediario.aula74.labs;

public class SimuladorSemaforo {

	public static void main(String[] args) {

		ThreadSemaforo semafaro = new ThreadSemaforo();

		for (int i=0; i<10; i++){
			System.out.println(semafaro.getCor());
			semafaro.esperaCorMudar();
		}
		semafaro.desligarSemafaro();
	}
}

