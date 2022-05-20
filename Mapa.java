package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap <>();
		
			usuarios.put(1, "Roberto");
			usuarios.put(20, "Ricardo");
			usuarios.put(3, "Rafaela");
			usuarios.put(4, "Rebeca");
			
			System.out.println(usuarios.size()); //Tamanho do Map
			System.out.println(usuarios.isEmpty()); //Verifica se o Map está vazio
			
			System.out.println(usuarios.keySet()); //Listar chaves existentes
			System.out.println(usuarios.values()); //Listar valores existentes
			System.out.println(usuarios.entrySet()); //Listar chaves vinculadas aos valores 
			
			System.out.println(usuarios.containsKey(20)); //Verificar se contem essa chave
			System.out.println(usuarios.containsValue("Rebeca")); //Verificar se contem esse valor
			
			System.out.println(usuarios.get(4)); //encontrar um valor atraves de seu indice (chave)
			System.out.println(usuarios.remove(1)); //apresentar qual valor foi removido
			System.out.println(usuarios.remove(4, "Gui")); //retorna true ou falso se o valor existe 
			
			//Percorrer chaves
			for(int chave: usuarios.keySet()) {
				System.out.println(chave);
			}
			
			//Percorrer valores
			for(String valor: usuarios.values()) {
				System.out.println(valor);
			}
			
			//Percorrer chaves e valores
			for(Entry<Integer, String> registro: usuarios.entrySet()) { //Entry é sempre o java.util.Map
				System.out.print(registro.getKey() + " ==> ");
				System.out.println(registro.getValue());
			}
	}

}
