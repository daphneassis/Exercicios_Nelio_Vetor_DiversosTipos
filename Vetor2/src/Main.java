import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		double[] vetor = new double[n];
		String nome;
		double soma=0;
		double media=0;
		
		for (int i=0;i<vetor.length;i++) {
			 nome= sc.next();
			 vetor[i]=sc.nextDouble();
		}
		for (int i=0;i<n;i++) {
			soma+=vetor[i];
			media=soma/n;
		}
		System.out.printf("Media %.2f%n",media);
		System.out.println(Arrays.toString(vetor));
	}

}
