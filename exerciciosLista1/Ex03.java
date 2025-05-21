package exerciciosLista1;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primero número inteiro");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro");
		int numero2 = sc.nextInt();
		
		int produto = numero1 * numero2;
		
		System.out.println("O produto dos números digitados é : " +produto);
		
		sc.close();
	}

}
