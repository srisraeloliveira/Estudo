package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		//Criando conjunto
		HashSet conjunto = new HashSet();
		
		//Criando elementos no conjunto
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		System.out.println("Tamanho é: " + conjunto.size());
		
		//Adicionando elementos no conjunto
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho é: " + conjunto.size());
		
		//Removendo elementos no conjunto
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho é: " + conjunto.size());
		
		// Verificando se contem elementos
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		//Criando novo conjunto
		Set nums = new HashSet();
		
		//Inserindo elementos em novo conjunto
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//Imprimindo conjunto
		System.out.println(conjunto);
		System.out.println(nums);
		
		//União entre dois conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		//Remoção de elementos iguais entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		//Limpar conjunto
		conjunto.clear();
		System.out.println(conjunto);
		
		
		
		
		
		
		
		
	
		
		
	}

}
