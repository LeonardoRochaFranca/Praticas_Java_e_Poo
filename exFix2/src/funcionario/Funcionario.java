package funcionario;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double impostos;
	
	public double SalarioLiquido() {
		return salarioBruto - impostos;
	}
	
	public void AumentoDeSalario(double percentual) {
		salarioBruto += salarioBruto*(percentual/100);
	}
	
	
}
