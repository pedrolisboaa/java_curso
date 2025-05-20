package pacote;
import java.util.Scanner;
import java.util.Locale;

public class atividade2 {

	public static void main(String[] args) {
		
		/* 
		Exercício 01
		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.
		*/
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int numero1, numero2;
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println("Soma = " + soma);
		
		
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
			casas decimais conforme exemplos.
			Fórmula da área: area = π . raio2
			Considere o valor de π = 3.14159
		 * 
		 * 
		 * */
		
		double PI  =  3.14159;
		double raio;
		
		raio = sc.nextDouble();
		
		double area = PI * Math.pow(raio, 2);
		System.out.println("A = " + area);
		
		
		
		
		sc.close();

	}

}
