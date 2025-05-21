package exerciciosLista1;
import java.util.Scanner;
public class ExL01 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o primeiro número inteiro");
	int numero1 = sc.nextInt();
	
	System.out.println("Digite o segundo número inteiro");
	int numero2 = sc.nextInt();
	
	int soma = numero1 + numero2;
	
	System.out.println("A soma dos dois números é : " +soma);

	}
    
}
