package exerciciosLista1;
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        // Solicita a temperatura em Celsius
	        System.out.print("Digite a temperatura em graus Celsius: ");
	        double celsius = scanner.nextDouble();

	        // Converte para Fahrenheit
	        double fahrenheit = celsius * 9 / 5 + 32;

	        // Exibe o resultado
	        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

	        // Fecha o scanner
	        scanner.close();

	}

}
