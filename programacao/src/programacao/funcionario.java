package programacao;

import java.util.Locale;
import java.util.Scanner;

public class funcionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
		
		

	}

}
