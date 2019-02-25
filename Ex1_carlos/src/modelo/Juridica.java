package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Juridica extends Pessoa{
	
	private int codigo;
	private long cnpj;
	private String nome_fantasia;
	
	public static ArrayList pessoa_juridica = new ArrayList();
	
	public Juridica() {
		
	}

	public Juridica(long cnpj, String nome_fantasia) {
		this.cnpj = cnpj;
		this.nome_fantasia = nome_fantasia;
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	
	
	@Override
	public String toString() {
		return "Codigo: " + codigo + "\nCNPJ: " + cnpj + "\nNome Fantasia: " + nome_fantasia
				+ "\nNome: " + getNome() + "\nEmail: " + getEmail() + "\nIdade: " + getIdade()
				+ "\nRua: " + getRua() + "\nBairro: " + getBairro() + "\nCidade: " + getCidade()
				+ "\nUF: " + getUf();
	}

	public void CadastrarPessoaJuridica() {
		
		Scanner teclado = new Scanner(System.in);
		
		int c = 0; //contador para gerar o codigo da pessoa
		int opcao;
		do {
			
			System.out.println("--------------------------------");
    		System.out.println("\t Cadastro de Pessoa Jurídica");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Voltar");
			opcao = teclado.nextInt();
				
			switch (opcao) {
				
				case 1:
					Juridica j = new Juridica();
					c++;
					j.setCodigo(c);
					
					System.out.println("Nome: ");
					j.setNome(teclado.next());
					teclado.nextLine();
					System.out.println("Nome Fantasia: ");
					j.setNome_fantasia(teclado.nextLine());
					
					System.out.println("E-mail: ");
					j.setEmail(teclado.nextLine());
					
					System.out.println("Idade: ");
					j.setIdade(teclado.nextInt());
					
					System.out.println("CNPJ: ");
					j.setCnpj(teclado.nextLong());
					
					System.out.println("Rua: ");
					j.setRua(teclado.next());
					teclado.nextLine();
					
					System.out.println("Bairro: ");
					j.setBairro(teclado.next());
					
					System.out.println("Cidade: ");
					j.setCidade(teclado.next());
					teclado.nextLine();
				
					System.out.println("UF: ");
					j.setUf(teclado.next());
					teclado.nextLine();
					
					pessoa_juridica.add(j);
				
					System.out.println("Pessoa Jurídica cadastrada com sucesso.");
					
					break;
					
				case 2:
					if (pessoa_juridica.isEmpty()) {
						
						System.out.println("Nenhuma pessoa foi cadastrada!!!");
						
					}else {
						
						for (int i = 0; i < pessoa_juridica.size(); i++) {
							System.out.println("-------------------");
							System.out.println("\t Pessoa Juridica: ");
							System.out.println(pessoa_juridica.get(i).toString());
							System.out.println("-------------------");
						}
					}
					break;
			}
		}while(opcao!=3);
	}
	
	
}
