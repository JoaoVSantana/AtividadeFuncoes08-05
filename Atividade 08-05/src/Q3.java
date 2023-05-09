import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número");
		numero = leia.nextInt();

		System.out.println("A quantidade de dígitos do número: " + quantidade(numero));

		leia.close();
	}

	static int quantidade(Integer numero) {
		return numero.toString().length();
	}

}
