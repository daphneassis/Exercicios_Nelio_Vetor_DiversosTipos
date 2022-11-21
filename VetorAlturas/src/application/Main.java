package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n,i,numeroMenores ; 
		double somaAlturas, media, percentualMenores;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		 n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome:");
			nome[i] = sc.next();
			System.out.print("Idade:");
			idade[i] = sc.nextInt();
			System.out.print("Altura:");
			altura[i] = sc.nextDouble();
		}
		 somaAlturas = 0;
		for (i = 0; i < n; i++) {
			somaAlturas += altura[i];
		}
		 media = (double)somaAlturas/n;

		 numeroMenores = 0;
		
		for (i = 0; i < n; i++) {
			if (idade[i] < 16) {
				numeroMenores++;
			}
		}
		percentualMenores =((double)numeroMenores/n)* 100.0;

		System.out.printf("Altura média das pessoas:%.2f%n\n", media);
		System.out.printf("Pessoas com menos de 16 anos:%.1f%%\n", percentualMenores);
		for (i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		sc.close();
	}
}
