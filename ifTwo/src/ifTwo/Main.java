package ifTwo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Escreva um número: ");
		n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("NEGATIVO");
		}else {
			System.out.println("POSITIVO");
		}
		
		sc.close();
	}

}
