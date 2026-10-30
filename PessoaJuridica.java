package aula_2910_heranca;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica(String nome, String telefone, String cnpj) {
		super(nome, telefone);
		this.cnpj = cnpj;
	}

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}

}