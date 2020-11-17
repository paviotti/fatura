import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Fatura> list = new ArrayList<>();

		System.out.print("Informe quantos itens serão cadastrados:  ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Número do itens faturado: ");
			int numeroDoItem = sc.nextInt();
			sc.nextLine();
			System.out.print("Descrição do item: ");
			String descricao = sc.nextLine();
			System.out.print("Quantidade comprada: ");
			int quantidade = sc.nextInt();
			System.out.print("Preço unitário: ");
			double precoUnitario = sc.nextDouble();
			list.add(new Fatura(numeroDoItem, descricao, quantidade, precoUnitario));
			System.out.println();
		}
		sc.close();
		System.out.println("Nº do item   Descrição            Quantidade  preço unitário");
		double total = 0;
		for (Fatura fat : list) {
			System.out.printf("%-12s %-20s %-11d %.2f", fat.getNumerItem(), fat.getDescricao(), fat.getQuantidade(), fat.getPrecoItem());
			total += fat.getValorFatura();
			System.out.println("");
		}
		System.out.println("Valor da fatura: " + String.format("%10.2f",total));
	}

}
