package aula_2910_heranca;

public class Atendente extends Funcionario2 {
	private double ajudaCusto;

	public Atendente(String nome, String cpf, double salario, String cargo, String departamento, double ajudaCusto) {
		super(nome, cpf, salario, cargo, departamento);
		this.ajudaCusto = ajudaCusto;
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

}