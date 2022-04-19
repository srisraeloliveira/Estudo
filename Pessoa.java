package desafioModuloClasseMetodos;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa (String nome, double peso) {
		this.nome = nome;
		this.peso = peso;	// até aqui eu fiz e fiz o método retorno de peso em jantar
	}
	
	void comer (Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + "kg."; 
	}
}