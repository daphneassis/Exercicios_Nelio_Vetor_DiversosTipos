package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n=sc.nextInt();
		double[] vetor= new double[n];
		double maior=0;
		int posicaomaior=0;
		for(int i=0;i<n;i++) {
			System.out.println("Digite um numero:");
			vetor[i]=sc.nextDouble();
		}
		for(int i=0;i<n;i++) {
			if (vetor[i]>maior) {
				maior=vetor[i];
				posicaomaior=i;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR =%d", posicaomaior);
	}

}
