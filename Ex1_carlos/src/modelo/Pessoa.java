package modelo;

import java.util.ArrayList;

public class Pessoa extends Endereco{
	
	private String nome;
	private String email;
	private int idade;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nE-mail=" + email + "\nIdade=" + idade;
	}

	
	
	
	
	

}
