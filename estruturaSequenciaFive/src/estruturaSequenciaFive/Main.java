package estruturaSequenciaFive;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, qnt1, cod2, qnt2;
		Double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = qnt1 * preco1 + qnt2 * preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ", total);
		
		
		
		
		
		sc.close();
	}

}
