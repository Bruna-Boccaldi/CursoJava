package estruturaSequenciaFour;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionarios;
		Double horas, valor, salario;
		funcionarios = sc.nextInt();
		horas =sc.nextDouble();
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("NUMBER = "+ funcionarios);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		
		sc.close();

	}

}
