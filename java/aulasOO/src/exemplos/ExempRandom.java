package exemplos;

import java.util.Scanner;

public class ExempRandom {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		try {
//			
				System.out.println("digite a sequencia de nome");
				String[] vetor =leia.nextLine().split(" ");
				System.out.println("digite uma posi��o na lista");
				int posicao=leia.nextInt();
				System.out.println("o nome na posi��o escolhida �: "+vetor[posicao]);
//			
//		catch(java.lang.ArrayIndexOutOfBoundsException erro) {
//			System.out.println("o valor digitado ta errado");
//		}
		}catch(Exception e) {
			System.out.println("Digite bem as informa��es!");
		}
		
		System.out.println("o programa finalizou!!!");
	}
	
}
