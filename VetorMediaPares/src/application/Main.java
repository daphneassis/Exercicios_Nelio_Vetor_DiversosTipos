package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, posicao=0,nimpares=0;
		double soma=0,media;
		
		System.out.println("Quantos elementos vai ter o vetor?");
		 n=sc.nextInt();
		double[] vetor = new double[n];
		for(int i=0;i<n;i++) {
			System.out.println("Digite um numero:");
			vetor[i]=sc.nextDouble();
			if (vetor[i]%2==0) {
				soma+=vetor[i];
				posicao+=1;
			}else {
				nimpares++;
			}
		}
		if(nimpares==n) {
			System.out.println("NENHUM NUMERO PAR");	
		}else {
		media=(double)soma/posicao;
		System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		sc.close();
	}
}
