package colecoes;

import java.util.ArrayList;
import java.util.List;

public class lista {
	public static void main(String[] args) {
		
		List <Usuario> lista = new ArrayList<>();
		
		//Inserindo manualmente
		Usuario u1 = new Usuario("Abel");
		lista.add(u1);		
		
		//Inserindo através da sequencia
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Jaqueline"));
		lista.add(new Usuario("Israel"));
		lista.add(new Usuario("Miriam"));
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		System.out.println("------------");
		
		//Acessando indice de lista
		System.out.println("Acessado " + lista.get(3).nome);
		System.out.println("------------");
		
		//Removendo item da Lista
		System.out.println("Removido " + lista.remove(1).nome);
		System.out.println("------------");
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		System.out.println("------------");
		
		//Verificando se existe na lista
		
		String name = lista.remove(0).nome; 
		System.out.println("O nome " + name +  " está na lista? " + lista.contains(0));
	}
}
