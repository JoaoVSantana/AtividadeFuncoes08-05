import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Digite um n�mero");
		numero = leia.nextInt();

		System.out.println("A quantidade de d�gitos do n�mero: " + quantidade(numero));

		leia.close();
	}

	static int quantidade(Integer numero) {
		return numero.toString().length();
	}

}
