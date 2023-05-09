import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num;
		String resultado;

		System.out.println("Digite um número: ");
		num = leia.nextInt();

		resultado = numeroInvertido(num);
		
		System.out.println("O número invertido é: " + resultado);
		
		leia.close();
	}

	static String numeroInvertido (Integer num) {
		
		String invertido = " ";
	
		for(int cont = num.toString().length(); cont >0 ; cont --) {
			invertido += num.toString().substring(cont - 1, cont); 
		}
		
		return invertido;
	
	}
}
