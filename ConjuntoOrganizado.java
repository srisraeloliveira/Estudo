package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {
	
	public static void main(String[] args) {
		
		//Criando conjunto (lista) organizada
		Set<String> lista = new TreeSet<>();
		lista.add("Ana");
		lista.add("Julia");
		lista.add("Isa");
		lista.add("Claudia");
		lista.add("Eva");
		//Imprime em array
		System.out.println(lista);
		
		for (String candidato: lista) {
			System.out.println(candidato);
		}
		
		//Criando conjunto com inteiros (deve-se usar os Wrappers)
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2); 
		nums.add(3);
		nums.add(4);
		nums.add(6);
		//Imprime em array
		System.out.println(nums);
	
		for (int n: nums) {
			System.out.println(n);
		}		
	}
}
