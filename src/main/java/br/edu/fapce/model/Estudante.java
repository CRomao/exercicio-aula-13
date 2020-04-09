package br.edu.fapce.model;

public class Estudante {
	
	private String nome;
	private String curso;
	private String disciplina;
	
	public Estudante(String nome, String curso, String disciplina) {
		this.nome = nome;
		this.curso = curso;
		this.disciplina = disciplina;
	}

	
	@Override
	public String toString() {
		return "Aluno - Nome: " + this.nome + ", disciplina: " + this.disciplina + ", curso: " + this.curso;
	}
}
