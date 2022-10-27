package estruturaSequenciaTwo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double pi, raio, t, a;
		
		a = sc.nextDouble();
		pi = 3.14159;
		raio = Math.pow( a , 2.0);
		
		t = pi * raio;
		System.out.printf("A=%.4f", t);
		sc.close();
		
	}

}
