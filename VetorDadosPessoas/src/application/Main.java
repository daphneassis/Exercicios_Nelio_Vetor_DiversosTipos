package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		double maioraltura, menoraltura, mediaaltura, somaaltura=0;
		int i, numhomens=0; 
		int nummulheres=0;
		for (i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			genero[i]=sc.next().charAt(0);
		}
		maioraltura=altura[0];
		menoraltura=altura[0];
				
		for (i = 0; i < n; i++) {
			if(altura[i]>maioraltura) {
				maioraltura=altura[i];
			}if(altura[i]<menoraltura) {
				menoraltura=altura[i];
			}
		}
		
		for (i = 0; i < n; i++) {
			if(genero[i]=='M') {
				numhomens++; 
			}else {
				somaaltura+=altura[i];
				nummulheres++;
			}
		}
		
		mediaaltura=(double)somaaltura/nummulheres;
		System.out.printf("Menor altura = %.2f%n", menoraltura);
		System.out.printf("Maior altura = %.2f%n", maioraltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n",mediaaltura);
		System.out.printf("Numero de homens = %d", numhomens);
		
		sc.close();
	}

}
