package aula_2910_heranca;

public class ObjetoVeiculo {

	public static void main(String[] args) {

		Automovel automovel = new Automovel("Honda", "Honda Civic", 2015, "Cinza", 4, "1.8 16V");

		Moto moto = new Moto("Honda", "Honda XRE190", 2026, "Preta", 184);

		System.out.println("-----CADASTRANDO AUTOMÓVEL-----");

		System.out.println(" ");

		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: " + automovel.getAno());
		System.out.println("Cor: " + automovel.getCor());
		System.out.println("Número de Portas: " + automovel.getNumeroPortas());
		System.out.println("Motor: " + automovel.getMotor());

		System.out.println(" ");

		System.out.println("-----CADASTRANDO MOTO-----");

		System.out.println(" ");

		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: " + moto.getAno());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Cilindradas: " + moto.getCilindrada());
	}

}