import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 int n= sc.nextInt();
		 double[] vect = new double[n];
		 double soma=0;
		 double media=0;
		 for (int i=0;i<vect.length; i++) {
			  vect[i]=sc.nextDouble();
			  soma+=vect[i];
			   media=soma/n;
		 }		 
		System.out.printf("A média das medidas é %.2f%n", media);
		System.out.println(Arrays.toString(vect));
		sc.close();
}
}