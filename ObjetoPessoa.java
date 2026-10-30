package aula_2910_heranca;

public class ObjetoPessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Peter Parker", "11 11111-1111");

		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());

		System.out.println(" ");

		PessoaFisica pessoaFisica = new PessoaFisica("Peter Parker", "22 22222-2222", "222.222.222-22",
				"222.222.222-X");

		System.out.println("Pessoa Física: ");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCPF());
		System.out.println("RG: " + pessoaFisica.getRG());

		System.out.println(" ");

		PessoaJuridica pessoaJuridica = new PessoaJuridica("Peter Parker's", "33 33333-3333", "33.333.333/3333-33");

		System.out.println("Pessoa Jurídica: ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CNPJ: " + pessoaJuridica.getTelefone());
	}

}