package aula_2910_heranca;

public class ObjetoPessoa2 {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("Thomas", "123.456.789-01", 2500.00);

		System.out.println("---ATUALIZANDO SALÁRIO---");

		funcionario.exibirInfo();

		funcionario.aumentarSalario(10);

		funcionario.exibirInfo();

	}

}