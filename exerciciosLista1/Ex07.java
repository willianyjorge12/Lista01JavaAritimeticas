package exerciciosLista1;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		 
		        // Cria o objeto Scanner para leitura
		        Scanner scanner = new Scanner(System.in);

		        // Solicita os três números inteiros
		        System.out.print("Digite o primeiro número inteiro: ");
		        int numero1 = scanner.nextInt();

		        System.out.print("Digite o segundo número inteiro: ");
		        int numero2 = scanner.nextInt();

		        System.out.print("Digite o terceiro número inteiro: ");
		        int numero3 = scanner.nextInt();

		        // Calcula a média aritmética
		        double media = (numero1 + numero2 + numero3) / 3.0;

		        // Exibe o resultado
		        System.out.println("A média aritmética é: " + media);

		        // Fecha o scanner
		        scanner.close();
		    }

	}


