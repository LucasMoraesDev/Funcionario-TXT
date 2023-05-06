package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\nInforme o ID do funcion�rio: ");
		int id = sc.nextInt();
		sc.nextLine(); // consome a quebra de linha ap�s o n�mero

		System.out.print("\nInforme o nome do funcion�rio: ");
		String nome = sc.nextLine();

		System.out.print("\nInforme o CPF do funcion�rio: ");
		String cpf = sc.nextLine();

		System.out.print("\nInforme a matr�cula do funcion�rio: ");
		String matricula = sc.nextLine();

		System.out.print("\nInforme o sal�rio do funcion�rio: ");
		double salario = sc.nextDouble();

		Funcionario funcionario = new Funcionario(id, nome, cpf, matricula, salario);
		FuncionarioRepository repository = new FuncionarioRepository();
		repository.salvar(funcionario);

		System.out.println("\nFuncion�rio cadastrado com sucesso!");

		sc.close();
	}

}
