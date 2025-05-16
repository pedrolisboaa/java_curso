package pacote;

public class atividade1 {

	public static void main(String[] args) {

		
		
		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		
		int idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		
		double preco1 = 2100;
		double preco2 = 650.50;
		double medir = 53.2345678;
		
		
		System.out.println("Produtos:");
		System.out.printf("%s, custa o preço de R$ %.2f%n", produto1, preco1);
		System.out.printf("%s, custa o preco de R$ %.2f%n", produto2, preco2);
		System.out.println();
		
		String mensagem = String.format("Dados: %d anos de idade, codigo %d e o sexo é %s", idade, codigo, sexo);
		System.out.println(mensagem);
		
		System.out.println();
		System.out.printf("Quantidade de cadas decimais 8: %.8f%n", medir);
		System.out.printf("Quantidade de cadas decimais 3: %.3f%n", medir);
		System.out.printf("Quantidade de cadas decimais 2: %.2f%n", medir);
	}

}
