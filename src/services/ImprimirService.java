package services;

import java.util.ArrayList;
import java.util.List;

//A letra T pode ser qualquer uma, a gente escolhe
public class ImprimirService<T> {
	
	private List<T> lista = new ArrayList<>();
	
	public void addValor(T valor) {
		lista.add(valor);
	}
	
	public T primeiro() {
		if(lista.isEmpty()){
			throw new IllegalStateException("Lista está vazia.");
		}
		return lista.get(0);
	}
	
	public void print() {
		System.out.println("\nPrimeiro: "+this.primeiro()+"\n");
		System.out.println("Lista: ");
		for(T item : lista) {
			System.out.println(item);
		}
	}

}
