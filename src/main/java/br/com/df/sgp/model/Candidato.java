package br.com.df.sgp.model;

public class Candidato {


	private int id;
	private String nome;
	private String siglaPartido;

	public Candidato() {}
	
	public Candidato( String nome, String siglaPartido) {
		super();
		this.nome = nome;
		this.siglaPartido = siglaPartido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSiglaPartido() {
		return siglaPartido;
	}
	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	@Override
	public String toString() {
		return String.format("%s[id=%d]", getClass().getSimpleName(), getId());
	}
	
}
