import java.util.Random;

public class Q5 {

	public static void main(String[] args) {
		Random aleatorio = new Random();

		int dado1, dado2, confirma;

		System.out.println("Os dados serão jogados...");

		dado1 = aleatorio.nextInt(6) + 1;

		dado2 = aleatorio.nextInt(6) + 1;

		System.out.println("O resultado dos dados foi " + (dado1 + dado2) + "\n");

		confirma = Resultado(dado1, dado2, aleatorio);

		if (confirma == 1) {
			System.out.println("Você é um natural. Parabéns, você ganhou");

		} else if (confirma == 2) {
			System.out.println("Vish, você perdeu");

		} else if (confirma == 3) {
			System.out.println("Deu Craps. Você perdeu");
		}

	}

	static int Resultado(int dado1, int dado2, Random aleatorio) {
		int soma = dado1 + dado2;
		int opcao = 0, ponto = 0;

		if (soma == 7 || soma == 11) {
			if (soma == 7 && ponto != 0) {
				opcao = 2;
				return opcao;
			} else {

				opcao = 1;
				return opcao;
			}

		} else if (soma == 2 || soma == 3 || soma == 12) {
			opcao = 3;
			return opcao;

		} else {
			ponto = soma;

			do {
				dado1 = aleatorio.nextInt(6) + 1;
				dado2 = aleatorio.nextInt(6) + 1;
				soma = dado1 + dado2;
				
				System.out.println("Resultado dos dados: " + soma);

				if (soma == 7) {
					System.out.println("Você perdeu!");
					break;

				} else if (soma == ponto) {
					System.out.println("Você atingiu o ponto duas vezes, você ganhou");
					break;
				}

			} while (soma != ponto);
		}
		return opcao;
	}

}
