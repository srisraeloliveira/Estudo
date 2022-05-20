package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); //verdadeirou ou falso
		
		fila.offer("Bia"); //lan�a um erro (exce��o)
		fila.offer("Jose");
		fila.offer("Gustavo");
		fila.offer("Augusto");
		fila.offer("Pedro");
		//Diferen�a entre Add e Offer so se d� quando a fila est� cheia!
		
		//Peek e Element -> obtem o pr�ximo elemento da fila sem remover 
		
		System.out.println(fila.peek());  //quando a lista est� vazia, ele entende como null
		System.out.println(fila.element()); //quando a lista est� vazia, ele entende como um erro
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		System.out.println(fila.poll());  //chama o pr�ximo elemento da fila
		System.out.println(fila.poll());  
		System.out.println(fila.remove());  //remove o pr�ximo item da fila, por�m se nao houver mais itens, ele chama na exce��o (ERRO) 
		System.out.println(fila.poll());  
		System.out.println(fila.poll());  
		System.out.println(fila.poll());  
		System.out.println(fila.poll());  
		
		
		
	}

}
