package aula_2910_heranca;

public class Funcionario extends Pessoa2 {
	private double salario;

	public Funcionario(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double percentualSalario) {
		this.salario = this.salario + (this.salario * percentualSalario) / 100;
	}

	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Salário atual: " + salario);
		System.out.println(" ");
	}
}