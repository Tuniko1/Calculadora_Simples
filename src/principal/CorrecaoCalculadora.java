package principal;
import java.util.Scanner;

public class CorrecaoCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o tipo de operação que deseja: ");
		char operacao = sc.next().charAt(0);
		
		System.out.println("Insira o número para a tabuada: ");
		int numero = sc.nextInt();
				
		switch (operacao) {
		case '+':
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " + "+ i + " = " + (i + numero));
			}
		
			break;
		case '-':
			int aux = numero;
			for (int i =1; i <= 10; i++) {
				System.out.println( (aux + i)+" - " + (numero) + " = " + ((aux + i) - numero));
			}
			
			break;
		case '*':
			for(int i = 1; i <= 10; i++) {
				System.out.println(numero + "* " + i+ "="+(i*numero));
			}
			
			break;
		case '/':
			for (int i = 1; i<= 10; i++) {
				System.out.println ((numero * i)+ "/"+numero + " = "+(numero *i / numero));
			}
			break;
			
		
		default: 
			System.out.println("Opção não encontrada!");
			break;
		}
		sc.close();
		
	}

}