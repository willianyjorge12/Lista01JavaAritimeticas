package exerciciosLista1;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro");
		int numero2 = sc.nextInt();
		//usa-se Math para gerar um número absoluto positivo não importando a ordem dos números
		int diferença = Math.abs(numero1 - numero2);
		
		System.out.println("A diferença dos números é : " +diferença);
	}

}
