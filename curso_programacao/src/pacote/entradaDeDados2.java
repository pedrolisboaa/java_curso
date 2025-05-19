package pacote;
import java.util.Scanner;
import java.util.Locale;

public class entradaDeDados2 {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.print(x);;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String nomeCompleto = sc.nextLine();
		System.out.println("Seu nome completo é "+ nomeCompleto);
		
		sc.close();

	}

}
