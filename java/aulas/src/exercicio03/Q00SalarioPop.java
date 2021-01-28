//A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
//a) m�dia do sal�rio da popula��o; 
//b) m�dia do n�mero de filhos; 
//c) maior sal�rio; 
//d) percentual de pessoas com sal�rio at� R$100,00.

package exercicio03;

import java.util.Scanner;

public class Q00SalarioPop {
 public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double salario, filhos, maior=0.0,somaSalario=0.0,somaFilho=0.0;
	int contador=0;
	final int populacao=3;
	
	for(int i=0;i<populacao;i++) {
		System.out.printf("Insira o salario do %d� cidad�o: ",(i+1));
		salario=ler.nextDouble();
		System.out.printf("Insira o numero de filhos do %d� cidad�o: ",(i+1));
		filhos=ler.nextDouble();
		
		somaSalario+=salario;
		somaFilho+=filhos;
		
		if(salario>maior) {
			maior=salario;
		}
		if(salario<=100) {
			contador++;
		}
	}
	
	System.out.printf("\nA media de salario �: %.2f\n",(somaSalario/populacao));
	System.out.printf("A media de filhos �: %.2f\n",(somaFilho/populacao));
	System.out.printf("O maior salario �: %.2f\n",maior);
	System.out.printf("O percentual de pessoas com salario at� 100 �: %.2f\n",contador*100.0/populacao);
 }
}
