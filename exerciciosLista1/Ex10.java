package exerciciosLista1;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        // Solicita o raio do círculo
	        System.out.print("Digite o raio do círculo: ");
	        double raio = scanner.nextDouble();

	        // Calcula o perímetro usando a constante Math.PI
	        double perimetro = 2 * Math.PI * raio;

	        // Exibe o resultado
	        System.out.println("O perímetro do círculo é: " + perimetro);

	        // Fecha o scanner
	        scanner.close();

	}

}
