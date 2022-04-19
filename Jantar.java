package desafioModuloClasseMetodos;

public class Jantar {

//	public static void main(String[] args) {
//		
//		Pessoa rand = new Pessoa("Isabelly", 65);
//		
//		Comida prato = new Comida();
//		prato.arroz = 0.3;
//		prato.feijao = 0.2;
//		prato.macarrao = 0.3;
//		prato.salada = 0.1;
//		prato.mistura = 0.6;
//			
//		double pesoPessoa = rand.pesoPessoa();
//		double pesoComida = prato.pesoComida();
//		double pesoPosJantar = pesoPessoa + pesoComida;
//		
//		System.out.println("Nome: "+ rand.nome + "\nPeso antes do Jantar: " + pesoPessoa);
//		System.out.println("Peso da Comida: " + pesoComida);
//		System.out.println("Peso depois do Jantar: " + pesoPosJantar);
//			
//	}
	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);

		Pessoa p = new Pessoa("João", 95.3);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
		
	}
}
