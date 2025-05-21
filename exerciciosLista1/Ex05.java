package exerciciosLista1;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro");
		int numero2 = sc.nextInt();
		
		if(numero2 !=0) {
			int resto = numero1 % numero2;
			System.out.println("O resto da divisão é : "+resto);
					
		}else {
			System.out.println("Erro: Divisão por zero não é permitida");
		}

	}

}
