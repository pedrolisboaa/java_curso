package pacote;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Ola mundo!");
		System.out.println("Bom dia!");
		
		int idade = 32;
		double temperatura = 37.54;
		String nome = "Pedro";
		
		System.out.println(idade);
		System.out.println(idade * 2);
		System.out.println(temperatura);
		System.out.printf("%.4f%n", temperatura);
		
		// concaternar
		
		String mensagem = String.format("Ola eu sou %s, tenho %d anos e estou com %.2f º.", nome, idade, temperatura);
		
		System.out.println(mensagem);
		System.out.printf("Ola eu me chamo %s e tenho %d anos.%n", nome, idade);
		
		
		
		
	}
}
