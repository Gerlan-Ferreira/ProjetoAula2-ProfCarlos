package modelo;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	private String uf;
	
	
	public Endereco() {
		
		
	}
	
	public Endereco(String rua, String bairro, String cidade, String uf) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Rua: " + rua + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nUF: " + uf;
	}
	
	
	
	
	
}
