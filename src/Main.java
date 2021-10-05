import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String produto;
		double preco;
		int quantidade;
		double valortotal;

		System.out.print("Digite o nome do produto: ");
		produto = sc.next();
		System.out.print("Digite o preço do produto: ");
		preco = sc.nextFloat();
		System.out.print("Digite a quantidade que irá comprar: ");
		quantidade = sc.nextInt();
		valortotal = preco * quantidade;
		System.out.println("O produto que você está prestes a comprar é " + produto);
		System.out.printf("O preço unitário do produto é de %.2f%n", preco);
		System.out.printf("Você vai comprar %d%n", quantidade);
		System.out.printf("O valor total é de %.2f", valortotal);

		sc.close();
	}
}