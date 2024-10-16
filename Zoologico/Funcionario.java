package Zoologico;

public abstract class Funcionario {
	private String nome;
	private int matricula;
	private double salario_base;
	private Local2 sala;
	
	public Funcionario() {
		this.nome = "-";
		this.matricula = 00;
		this.salario_base = 00.00;
		this.sala = new Local2();
	}
	
	public Funcionario(String nome, int matricula, double salario_base, Local2 sala) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario_base = salario_base;
		this.sala = sala;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public double getSalario_base() {
		return salario_base;
	}



	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	
	public Local2 getSala() {
		return sala;
	}

	public void setSala(Local2 sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return nome + " - INFORMAÇÕES:\n" + " MATRÍCULA:" + matricula + "\n SALÁRIO BASE:" + salario_base + "\n" + sala;
	}

	public abstract double calculaSalario();
	

}
