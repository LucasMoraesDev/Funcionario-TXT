package repositories;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	public void salvar(Funcionario funcionario) {
		try (FileWriter fw = new FileWriter("/workspace/funcionario_txt/texto.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println("\nId: " + funcionario.getId() + "\nNome: " + funcionario.getNome() + "\nCpf: "
					+ funcionario.getCpf() + "\nMatricula: " + funcionario.getMatricula() + "\nSalario: "
					+ funcionario.getSalario());
		} catch (IOException e) {
			System.out.println("Erro ao gravar arquivo: " + e.getMessage());
		}
	}

}
