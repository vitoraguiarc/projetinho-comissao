package comissao;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		String nome;
		double anosdetrabalho, totalvendas;
		
		System.out.print("Qual o nome do vendendor(a)? ");
		nome = leitor.next();
		
		System.out.print("Qual o tempo de trabalho do vendendor(a) em anos? ");
		anosdetrabalho = leitor.nextDouble();
		
		System.out.print("Qual foi o valor total em vendas? ");
		totalvendas = leitor.nextDouble();
		
		if (anosdetrabalho >= 1 && totalvendas >= 10000 && totalvendas <= 20000 ) {
			double comissao5 = totalvendas * 5 / 100;

			System.out.println("O(A) vendendor(a) " + nome + " tem direito a uma comissão de: " + comissao5 + "R$" );
		} else if (anosdetrabalho >= 1 && totalvendas >= 20000) {
			double comissao10 = totalvendas * 10 / 100;
			System.out.println("O(A) vendendor(a) " + nome + " tem direito a uma comissão de: " + comissao10+ "R$");
		} else {
			double comissao3 = totalvendas * 3 / 100;
			System.out.println("O(A) vendendor(a) " + nome + " tem direito a uma comissão de: " + comissao3+ "R$");
			
		}  
		

	}

}
