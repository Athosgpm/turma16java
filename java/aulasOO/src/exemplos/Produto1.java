package exemplos;

import entidades.Produto;

public class Produto1 {
	
	public static void main(String[] args) {
		
		Produto product0 = new Produto();													//CONSTRUTOR VAZIO
		Produto product1 = new Produto("produto bom");										//CONSTRUTOR 01 ENTIDADE
		Produto product2 = new Produto("produto massa","N01");								//CONSTRUTOR 02 ENTIDADE
		Produto product3 = new Produto("produto show","N02",1000);							//CONSTRUTOR 03 ENTIDADE
		
		System.out.println(product1.descri��o);												//PRODUTO 01
		System.out.println(product2.descri��o+"\t"+product2.codigo);						//PRODUTO 02
		System.out.println(product3.descri��o+"\t"+product3.codigo+"\t"+product3.valor);	//PRODUTO 03
		System.out.println();																//PULA LINHA
		System.out.println(product0.descri��o+"\t\t"+product0.codigo+"\t"+product0.valor);	//PRODUTO 00
		
		//CASO VC COLOQUE PARA EXIBIR ALGO VAZIO ELE VAI APARECER "NULL" QUANDO STRING E "0.0" QUANDO DOUBLE
		
	}
}