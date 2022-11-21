package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, idademaisvelho=0;
		String nomemaisvelho="";

		
		System.out.println("Quantas pessoas voce vai digitar?");
		 n= sc.nextInt();
		String[] nome = new String[n];
		int[] idade= new int[n];
		
		for (i=0;i<n;i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.println("Nome: ");
			nome[i]=sc.next();
			System.out.println("Idade");
			idade[i]=sc.nextInt();	
		}
		for (i=0;i<n;i++) {
		if(idade[i]>idademaisvelho) {
			idademaisvelho=idade[i];
			nomemaisvelho=nome[i];	
		}	
	}
		System.out.println("PESSOA MAIS VELHA: "+ nomemaisvelho);
		
	sc.close();
}
}
