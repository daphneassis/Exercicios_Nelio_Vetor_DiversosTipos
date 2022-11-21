package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n=sc.nextInt();
		int[] npares= new int[n];
		int qtdpares=0;
		for (int i=0;i<n;i++) {
			System.out.println("Digite um numero: ");
			npares[i]=sc.nextInt();
		}
		System.out.println("NÚMEROS PARES:");
		for (int i=0;i<n;i++) {
			if(npares[i]%2==0) {
				System.out.printf("%d ",npares[i]);
				qtdpares+=1;
			}
		}
		System.out.printf("\nQUANTIDADE DE PARES:%d", qtdpares);	
		sc.close();
			}
		}
	
