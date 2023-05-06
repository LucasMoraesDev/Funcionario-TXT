package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nInforme o ID do funcionário: ");
		int id = sc.nextInt();
		sc.nextLine(); // consome a quebra de linha após o número

		System.out.print("\nInforme o nome do funcionário: ");
		String nome = sc.nextLine();

		System.out.print("\nInforme o CPF do funcionário: ");
		String cpf = sc.nextLine();

		System.out.print("\nInforme a matrícula do funcionário: ");
		String matricula = sc.nextLine();

		System.out.print("\nInforme o salário do funcionário: ");
		double salario = sc.nextDouble();

		Funcionario funcionario = new Funcionario(id, nome, cpf, matricula, salario);
		FuncionarioRepository repository = new FuncionarioRepository();
		repository.salvar(funcionario);

		System.out.println("\nFuncionário cadastrado com sucesso!");

		sc.close();
	}

}
