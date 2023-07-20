package aplication;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes voçê vai digitar: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++ ) {
			System.out.printf("Digite os dados do %do contribuinte: ", i + 1);
			System.out.println();
	        System.out.print("Renda anual com salário: ");
	        double salaryIncome = sc.nextDouble();
	        System.out.print("Renda anual com prestação de serviço: ");
	        double servicesIncome = sc.nextDouble();
	        System.out.print("Renda anual com ganho de capital: ");
	        double capitalIncome = sc.nextDouble();
	        System.out.print("Gastos médicos: ");
	        double healthSpending = sc.nextDouble();
	        System.out.print("Gastos educacionais: ");
	        double educationSpending = sc.nextDouble();
	        TaxPayer  list1 = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
	        list.add(list1);
	        System.out.println();
		}
		
		System.out.println();
		int listNum = 1;
		for(TaxPayer list1 : list) {
		    System.out.printf("Imposto bruto total: %.2f%n ", list1.grossTax());
			System.out.printf("Abatimento: %.2f%n", list1.taxRebate());
			System.out.printf("Imposto devido: %.2f%n", list1.netTax());
			listNum++;
		}
		
		
		
		
		

	}

}
