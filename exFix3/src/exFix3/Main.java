package exFix3;

import java.util.Locale;
import java.util.Scanner;
import aluno.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.NotaFinal());
		
		if(aluno.NotaFinal() >= 60.00) {
			System.out.println("PASS");
		}else {
			System.out.printf("FAILED %nMISSING %.2f POINTS", aluno.MargemDaNota());
		}
		
		sc.close();
	}

}
