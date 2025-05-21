package exerciciosLista1;
import java.util.Scanner;
public class Ex06Quadrado {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        // Solicita ao usuário que digite um número inteiro
		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();

		        // Calcula o quadrado do número
		        int quadrado = numero * numero;

		        // Exibe o resultado
		        System.out.println("O quadrado de " + numero + " é " + quadrado + ".");

		        // Fecha o scanner
		        scanner.close();
		    }


	}


