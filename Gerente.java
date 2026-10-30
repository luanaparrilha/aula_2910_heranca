package aula_2910_heranca;

public class Gerente extends Funcionario2 {
	private String beneficios;
	private double premiacao;

	public Gerente(String nome, String cpf, double salario, String cargo, String departamento, String beneficios, double premiacao) {
		super(nome, cpf, salario, cargo, departamento);
		this.beneficios = beneficios;
		this.premiacao = premiacao;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public double getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(double premiacao) {
		this.premiacao = premiacao;
	}

}