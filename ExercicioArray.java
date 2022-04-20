package arrays;

import java.util.Arrays;

public class ExercicioArray {
	
	public static void main(String[] args) {
		
		double[] notasA = new double [4];
		
		notasA [0] = 3.5;
		notasA [1] = 9.5;
		notasA [2] = 4.5;
		notasA [3] = 7.5;
		
		//Arrays.toString(notasA); -> import para stringar um array
		
		System.out.println(Arrays.toString(notasA));
		
		double totalA = 0;
		for (int i = 0; i < notasA.length; i++) { //laço 'for' que a própria IDE nos fornece
			totalA += notasA[i];
			System.out.println(totalA);
		}
		
		System.out.println(totalA/notasA.length);
		
		double[] notasB = { 3.5, 9.5, 4.5, 7.5 }; // outra forma de criar array
		
		System.out.println(Arrays.toString(notasB));
		 
		double totalB = 0;
		for (int i = 0; i < notasB.length; i++) {
			totalB += notasB[i];
		}
		
		System.out.println(totalB/notasB.length);
		}

}
