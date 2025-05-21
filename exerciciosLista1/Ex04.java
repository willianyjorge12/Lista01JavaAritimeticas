package exerciciosLista1;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Digite o primeiro número");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número");
		int numero2 = sc.nextInt();
		
		//verificar se o divisor é diferente de zero com if else
		
		if (numero2 != 0) {
			int quociente = numero1 / numero2;
			System.out.println("O quociente da divisão é : "+quociente);
		}else {
			System.out.println("Erro: Divisão por 0 não é permitida");
		}
		//se a condição for verdadeira diferente de zero ele roda
		// se não for diferente e for falsa gera erro
	}

}
