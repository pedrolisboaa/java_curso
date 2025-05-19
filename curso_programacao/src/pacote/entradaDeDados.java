package pacote;
import java.util.Scanner;
import java.util.Locale;

public class entradaDeDados {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe seu nome: ");
		String nome = sc.next();
		
		System.out.printf("Ola %s !", nome);
		
		
		System.out.println("Infome o primeiro numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Infome o segundo numero: ");
		double numero2 = sc.nextDouble();
		
		double conta = numero1 * numero2;
		System.out.printf("%d * %f = %f", numero1, numero2, conta);
		
		
		char crt = sc.next().charAt(0);
		System.out.println(crt);
		
		
		sc.close();

	}

}
