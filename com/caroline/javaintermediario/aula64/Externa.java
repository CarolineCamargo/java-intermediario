package com.caroline.javaintermediario.aula64;

public class Externa {
	
	private String texto = "texto externo";
	
	public class Interna {
		
		private String texto = "texto interno";
		
		public void ImprimeTexto() {
			System.out.println(texto);
			
			//consegue ver atributos da classe externa
			System.out.println(Externa.this.texto);
		}
	}

	public static void main(String[] args) {
		
		Externa externa = new Externa();
		Interna interna = externa.new Interna();
		
		interna.ImprimeTexto();
	}

}
