import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int hora = 0, minutos = 0, opcao = 1;
		String resultado;
		
		do {
			
			System.out.println("Digite a hora: ");
			hora = leia.nextInt();
			
			System.out.println("Digite os minutos: ");
			minutos = leia.nextInt();
			
			resultado = Conversao(hora, minutos);
			
			System.out.println("Hora convertida: " + resultado);
			
			System.out.println("Deseja continuar?:"
					+ "\n1- sim"
					+ "\nQualquer outra tecla - não");
			opcao = leia.nextInt();
			
		} while (opcao != 1);
		
		leia.close();
	}
		static String Conversao( int hora, int minutos){
			String periodo;
		 
		if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {
			if(hora >= 12) {
				periodo = "P.M";
				hora -= 12;
				
			} else {
				periodo = "A.M";
				
			}
			
			if(hora == 0) {
				hora -= 12;
			}
			
			return String.format("%d:%02d %s", hora, minutos, periodo);
		
		} else {
			return "Hora inválida!";
		}
	}

}
