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
		System.out.print("Digite o pre�o do produto: ");
		preco = sc.nextFloat();
		System.out.print("Digite a quantidade que ir� comprar: ");
		quantidade = sc.nextInt();
		valortotal = preco * quantidade;
		System.out.println("O produto que voc� est� prestes a comprar � " + produto);
		System.out.printf("O pre�o unit�rio do produto � de %.2f%n", preco);
		System.out.printf("Voc� vai comprar %d%n", quantidade);
		System.out.printf("O valor total � de %.2f", valortotal);

		sc.close();
	}
}