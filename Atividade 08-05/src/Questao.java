
import java.util.Scanner;

public class Questao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao = 0, num1, num2;

		do {
			System.out.println("Bem vindo ao menu\n");
			System.out.println("Qual operação irá escolher?:\n" + "\n1 - Soma" + "\n2 - Subtração" + "\n3 - Divisão"
					+ "\n4 - Multiplicação" + "\n0 - Sair");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextInt();

				System.out.println("Digite o segundo número: ");
				num2 = leia.nextInt();

				System.out.println("O resultado é " + Soma(num1, num2) + "\n");

				break;

			case 2:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextInt();

				System.out.println("Digite o segundo número: ");
				num2 = leia.nextInt();

				System.out.println("O resultado é " + Subtracao(num1, num2) + "\n");

				break;

			case 3:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextInt();

				System.out.println("Digite o segundo número: ");
				num2 = leia.nextInt();

				System.out.println("O resultado é " + Divisao(num1, num2) + "\n");

				break;

			case 4:
				System.out.println("Digite o primeiro número: ");
				num1 = leia.nextInt();

				System.out.println("Digite o segundo número: ");
				num2 = leia.nextInt();

				System.out.println("O resultado é " + Mult(num1, num2) + "\n");

				break;

			case 0:
				System.out.println("\nFim do programa!");
				break;

			default:
				System.out.println("Opção inválida!");
				
				break;

			}

		} while (opcao != 0);
		
		leia.close();

	}

	static int Soma(int num1, int num2) {

		int resultado;

		resultado = num1 + num2;

		return resultado;
	}

	static int Subtracao(int num1, int num2) {

		int resultado;

		resultado = num1 - num2;

		return resultado;
	}

	static int Divisao(int num1, int num2) {

		int resultado;

		resultado = num1 / num2;

		return resultado;

	}

	static int Mult(int num1, int num2) {

		int resultado;

		resultado = num1 * num2;

		return resultado;

	}

}
