package exercicio03;

import java.util.Scanner;

public class Q06SomaDiv3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,soma=0,cont=0;
		
		do {
			System.out.println("Digite o valor do numero: ");
			a=ler.nextInt();
			if(a%3==0&&a!=0) {
				soma+=a;
				cont++;
			}
		}while(a!=0);
		
		if(cont!=0) {
			System.out.printf("O valor da media dos numeros multiplos de 3 �: %.2f",(soma*1d/cont));
		}else {
			System.out.println("n�o teve nenhum numero multiplo de 3");
		}
		
	}
}
