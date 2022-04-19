package classe;

public class ValorVsRef {
		public static void main(String[] args) {
			
			double a = 2;
			double b = a; //atribuindo por valores;
			
			a++;
			b--;
			
			System.out.println(a);
			System.out.println(b);
			
			
			Data d1 = new Data(1, 2, 2021);
			Data d2 = d1; //atribuindo por referencia;
			
			System.out.println(d1.dataFormatada());
			System.out.println(d2.dataFormatada());
			
					
//			Para comentário em bloco, selecionar as linhas a
//			serem comentadas e utilizar CTRL+SHIFT+C

	}
}
