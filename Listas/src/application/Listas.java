package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("cleiton");
		list.add("jorge");
		list.add("joao");
		list.add("pedro");
		list.add("paulo");
		
		list.add(1, "maria");
		
		System.out.println(list.size());
		
		//list.remove(0);
		
		//remove todas as Strings começadas em p
		list.removeIf(x -> x.charAt(0) == 'p');
		
		for (String x: list) {
			System.out.println(x);
		}
		
		//filtra a lista para ter apenas Strings começadas com j.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'j').collect(Collectors.toList());
		
		System.out.println("-------------------");

		for (String x: result) {
			System.out.println(x);
		}
		System.out.println("-------------------");
		//Encontra o primeiro elemento começado com j, se não achar, retorna null
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
	}

}
