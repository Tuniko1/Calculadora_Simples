package principal;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		//Faça um programa que receba o tipo de operação a ser realizada
		//(soma, divisão, multiplicação, subtração) 
		//e imprima a tabuada desse número. ex.: 1x2 = 2, 1x3 = 3...

		Scanner sc = new Scanner(System.in);
		int operacao;
		int numero;
		int opcao;
		int tabSoma = 0;
		
		System.out.println("Deseja iniciar o programa?");
		opcao = sc.nextInt();
		while (opcao == 1) {
			
		System.out.println("Qual tipo de operação deseja? Soma, Divisão, Multiplicação ou Subtração");
		System.out.println("Insira 1 para Soma:");
		System.out.println("Insira 2 para Divisão: ");
		System.out.println("Insira 3 para Multiplicação: ");
		System.out.println("Insira 4 para Subtração: ");
		operacao = sc.nextInt();
		
		if(operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4) {
		do {
		/*System.out.println("Insira o número para retornar a tabuada da operação escolhida: ");
		numero = sc.nextInt();*/
				if (operacao == 1) { 
					for (int contador =1; contador <= 10; contador++) {
						System.out.println("Insira o número para a operação: ");
						numero = sc.nextInt();
						tabSoma = numero + contador;
						contador++;
					System.out.println("A tabuada do "+numero+" é "+numero+" + "+tabSoma);
					}
				}
		
		}while (operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4); 
			
		}
		
		}
		sc.close();
	}

}
