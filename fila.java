package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); //verdadeirou ou falso
		
		fila.offer("Bia"); //lança um erro (exceção)
		fila.offer("Jose");
		fila.offer("Gustavo");
		fila.offer("Augusto");
		fila.offer("Pedro");
		//Diferença entre Add e Offer so se dá quando a fila está cheia!
		
		//Peek e Element -> obtem o próximo elemento da fila sem remover 
		
		System.out.println(fila.peek());  //quando a lista está vazia, ele entende como null
		System.out.println(fila.element()); //quando a lista está vazia, ele entende como um erro
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		System.out.println(fila.poll());  //chama o próximo elemento da fila
		System.out.println(fila.poll());  
		System.out.println(fila.remove());  //remove o próximo item da fila, porém se nao houver mais itens, ele chama na exceção (ERRO) 
		System.out.println(fila.poll());  
		System.out.println(fila.poll());  
		System.out.println(fila.poll());  
		System.out.println(fila.poll());  
		
		
		
	}

}
