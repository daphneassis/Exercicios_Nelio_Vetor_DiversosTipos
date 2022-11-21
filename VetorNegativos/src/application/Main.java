package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		if (n > 10) {
			System.out.println("Número maior do que 10. Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
		}
		// sc.nextLine();
		int[] vetor = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero:  ");
			vetor[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < n; i++) {
			if (vetor[i]<0) {
				System.out.printf("%d%n", vetor[i]);
			}
		}
		sc.close();
	}
}