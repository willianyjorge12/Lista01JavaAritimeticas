package exerciciosLista1;
import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita a largura do retângulo
	        System.out.print("Digite a largura do retângulo: ");
	        double largura = scanner.nextDouble();

	        // Solicita a altura do retângulo
	        System.out.print("Digite a altura do retângulo: ");
	        double altura = scanner.nextDouble();

	        // Calcula a área
	        double area = largura * altura;

	        // Exibe a área
	        System.out.println("A área do retângulo é: " + area);

	        // Fecha o scanner
	        scanner.close();

	}

}
