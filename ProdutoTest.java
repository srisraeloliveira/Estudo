package classe;

public class ProdutoTest {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "papel";
		p1.preco = 4.0;
		Produto.desconto = 0.35; //Chamando o desconto direto na classe produto
		
		//p1.desconto = 0.1; -> Impossível alterar pois foi usado 
		//final static na classe "desconto" -> para o exercício, foi utilizado o valor variado para todos os itens.
		
		Produto p2 = new Produto("lápis", 2.5);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2= p2.precoComDesconto();
		
		System.out.println(p1.nome + " " + precoFinal1);
		System.out.println(p2.nome + " " + precoFinal2);
		
	}
}
