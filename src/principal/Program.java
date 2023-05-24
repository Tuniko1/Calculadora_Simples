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
		char opcao;
		int tabSoma;
		char opcao1;
		
		System.out.println("Deseja iniciar o programa?");
		opcao = sc.next().charAt(0);
		while (opcao == 's' || opcao == 'S') {
		
		do {
		System.out.println("Qual tipo de operação deseja? Soma, Divisão, Multiplicação ou Subtração");
		System.out.println("Insira 1 para Soma:");
		System.out.println("Insira 2 para Divisão: ");
		System.out.println("Insira 3 para Multiplicação: ");
		System.out.println("Insira 4 para Subtração: ");
		operacao = sc.nextInt();
		
		
		if(operacao == 1) {
		
			System.out.println("Insira o número para a tabuada: ");
			numero = sc.nextInt();
			
			for (int contador = 1; contador <= 10; contador++){
				 
				 tabSoma = (contador + numero);
				 System.out.println("Tabuada -> "+numero+" + "+contador+" = "+ (contador + numero));
				 System.out.println();
			}}
		else if(operacao == 2) {
				
			System.out.println("Insira o número para a tabuada: ");
			numero = sc.nextInt();
				
				for (int contador = 1; contador <= 10; contador++){		 	 
				 tabSoma = (numero * contador / numero);
				 System.out.println ("Tabuada -->"+(numero * contador)+"/"+numero + " = "+(tabSoma));
				 System.out.println();
				 }
					
			}else if(operacao == 3) {
				
			System.out.println("Insira o número para a tabuada: ");
			numero = sc.nextInt();
				
				 for (int contador = 1; contador <= 10; contador++){
				 tabSoma = (contador * numero);
				 System.out.println("Tabuada -> "+numero + " x " + contador + " = "+(tabSoma));
				 System.out.println();
				 
		  }
			 }else if(operacao == 4) {
				
			System.out.println("Insira o número para a tabuada: ");
			numero = sc.nextInt();
				
				 for (int contador = 1; contador <= 10; contador++){
				 int aux = numero;
				 //System.out.println("Tabuada -> "+numero+" - "+contador+" = "+tabSoma);
				 tabSoma = ((aux+contador )- numero);
				 System.out.println( (aux + contador)+" - " + (numero) + " = " + tabSoma);
				 System.out.println();
				 }
		}else {
			System.out.println("NÚMERO INVÁLIDO PARA ESCOLHA DA OPERAÇÃO!");
			System.out.println("Vamos tentar novamente: ");
			System.out.println();
		}
		System.out.println("Deseja continuar? ");
		opcao1 = sc.next().charAt(0);
		}while(opcao1 == 's'||opcao1 == 'S');{ 
			if (opcao1 != 's'|| opcao1 != 'S') {
			System.out.println("Voce terminou por aqui!! :)");
				System.exit(0);
			}
		}
		}System.out.println("Você terminou por aqui!! :)");
		sc.close();
	}

}
