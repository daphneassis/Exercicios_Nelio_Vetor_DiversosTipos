package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int i,n;
		double media;
		
		System.out.println("Quantos alunos serao digitados? ");
		n=sc.nextInt();
		String[] nome= new String[n];
		double[] nota1= new double[n];
		double[] nota2= new double[n];
		
		for (i=0;i<n;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
			sc.nextLine();
			nome[i]=sc.nextLine();
			nota1[i]=sc.nextDouble();
			nota2[i]=sc.nextDouble();
		}
		
		System.out.println("APROVADOS:");
		for (i=0;i<n;i++) {
			media= (nota1[i]+nota2[i])/2;
		if(media>=6.0) {
			System.out.printf("%s%n",nome[i]);
		}		
	}
sc.close();
	}
	}
