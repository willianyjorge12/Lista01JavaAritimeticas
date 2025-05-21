package exerciciosLista1;

public class Ex06 {

	public static void main(String[] args) {
		int[] vetor = {2,4,6,8,10};
		int soma = 0;
		
		for (int i=0; i < vetor.length; i++) {
			soma += vetor [i];
		}
	System.out.println("A soma dos elementos é : "+soma);
	}

}
