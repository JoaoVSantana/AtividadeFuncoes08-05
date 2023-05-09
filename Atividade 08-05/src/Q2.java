import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double prestacao, valor, valorTotal = 0;
		int atraso, qntdPrestacoes = 0;
		
		do {
			System.out.println("Digite o valor da prestação: ");
			prestacao = leia.nextInt();

			System.out.println("\nDigite o número de dias em atraso: ");
			atraso = leia.nextInt();

			valor = valorPagamento(prestacao, atraso);

			System.out.println("\nO valor a ser pago será de: R$" + valor + "\n");
			
			qntdPrestacoes ++;
			
			valorTotal += valor;

		} while (prestacao != 0);
		
		System.out.println("Relatório do dia:");
		System.out.println("\nA quantidade de prestações verificadas foram: " + qntdPrestacoes);
		System.out.println("\nO valor total a ser pago é de: R$" + valorTotal);

		leia.close();
	}

	static double valorPagamento(double prestacao, int atraso) {

		double pagamento;

		if (atraso > 0) {
			pagamento = prestacao + (prestacao * 0.03) + (atraso * 0.01);

			return pagamento;

		} else {
			pagamento = prestacao;

			return prestacao;
		}
	}

}
