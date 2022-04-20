package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe número de notas: ");
		int qtde = entrada.nextInt();
		
		double[] notas = new double [qtde];
		
		for (int i = 0; i < notas.length; i++){
			System.out.printf("Informe nota %d: ", i+1);
			notas [i] = entrada.nextDouble();
		}
		
		double totalNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			totalNotas += notas[i];
		}
		entrada.close();		
		System.out.println("As notas são:");
		System.out.print(Arrays.toString(notas));	
		double media = totalNotas / notas.length;
		System.out.println("");
		System.out.println(totalNotas);
		System.out.println(media);
	}
}

