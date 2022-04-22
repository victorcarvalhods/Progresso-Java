package application;

import java.util.Date;

import entities.*;

public class Programa {

	public static void main(String[] args) {
		Post post1, post2;
		Date data1 = new Date();
		Date data2 = new Date();
		
		
		post1 = new Post(data1, "Viajando para nova zelândia", "Estou indo para esse país", 12);
		post2 = new Post(data2, "Boa noite", "Vejo vocês amanhã", 5);
		
		Comentario com1 = new Comentario("tenha uam boa viagem");
		Comentario com2 = new Comentario("Isso é incrível");
		post1.adicionarComentario(com1);
		post1.adicionarComentario(com2);
		
		Comentario com3 = new Comentario("Boa noite");
		Comentario com4 = new Comentario("askdbjasd");
		post2.adicionarComentario(com3); post2.adicionarComentario(com4);
		
		System.out.println(post1);
		
		System.out.println(post2);


	}
}
