package exFix1;
import java.util.Locale;
import java.util.Scanner;
import retangulo.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%nPERIMETRO = %.2f%nDIAGONAL = %.2f%n"
				, ret.Area(), ret.Perimetro(), ret.Diagonal());
		
		sc.close();
	}

}
