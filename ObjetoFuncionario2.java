package aula_2910_heranca;

public class ObjetoFuncionario2 {

	public static void main(String[] args) {

		Atendente atendente = new Atendente("Steve Rogers", "111.111.111-11", 1200.00, "Atendente", "Vendas", 10);

		Gerente gerente = new Gerente("Tony Stark", "222.222.222-22", 9000.00, "Gerente", "Administração", "Auxílio-Creche", 1000.00);

		System.out.println("---REGISTRO DE FUNCIONÁRIOS---");

		System.out.println(" ");

		System.out.println("Nome: " + atendente.getNome());
		System.out.println("CPF: " + atendente.getCpf());
		System.out.println("Salário: " + atendente.getSalario());
		System.out.println("Cargo: " + atendente.getCargo());
		System.out.println("Departamento: " + atendente.getDepartamento());
		System.out.println("Ajuda-Custo: " + atendente.getAjudaCusto() + "%");
		
		System.out.println(" ");

		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("Cargo: " + gerente.getCargo());
		System.out.println("Departamento: " + gerente.getDepartamento());
		System.out.println("Benefícios: " + gerente.getBeneficios());
		System.out.println("Premiação: " + gerente.getPremiacao());
	}

}