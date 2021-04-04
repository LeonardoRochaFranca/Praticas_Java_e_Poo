package exFix2;

import java.util.Locale;
import java.util.Scanner;

import funcionario.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome = ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario Bruto = ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Impostos = ");
		funcionario.impostos = sc.nextDouble();
		
		System.out.printf("Dados = %s, $ %.2f%n",
				funcionario.nome, funcionario.SalarioLiquido());
		
		System.out.print("Digite o percentual de aumento salarial do funcionario = ");
		double porcentagem = sc.nextDouble();
		funcionario.AumentoDeSalario(porcentagem);
		
		System.out.printf("Dados Atualizados = %s, $ %.2f%n",
				funcionario.nome, funcionario.SalarioLiquido());
		
		sc.close();
	}

}
