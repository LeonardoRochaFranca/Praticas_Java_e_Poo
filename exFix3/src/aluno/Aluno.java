package aluno;

public class Aluno {
	public double n1;
	public double n2;
	public double n3;
	public String nome;
	
	public double NotaFinal(){
		return n1 + n2 + n3;
	}
	
	public double MargemDaNota(){
		return 60 - NotaFinal();
	} 
}
