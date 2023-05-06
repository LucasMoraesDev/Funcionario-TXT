package entities;

public class Funcionario {
	private Integer id;
	private String nome;
	private String cpf;
	private String matricula;
	private Double salario;

	public Funcionario(Integer id, String nome, String cpf, String matricula, Double salario) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario{" + "id=" + id + ", nome='" + nome + '\'' + ", cpf='" + cpf + '\'' + ", matricula='"
				+ matricula + '\'' + ", salario=" + salario + '}';
	}
}
