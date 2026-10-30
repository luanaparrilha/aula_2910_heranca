package aula_2910_heranca;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String rg;

	public PessoaFisica(String nome, String telefone, String cpf, String rg) {
		super(nome, telefone);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getRG() {
		return rg;
	}

	public void setRG(String rg) {
		this.rg = rg;
	}

}