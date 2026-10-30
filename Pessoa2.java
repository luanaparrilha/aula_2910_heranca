package aula_2910_heranca;

public class Pessoa2 {
	private String nome;
	private String cpf;

	public Pessoa2(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public void exibirInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}

}