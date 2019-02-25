package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Fisica extends Pessoa{
	
	private long cpf;
	private int codigo;
	
	public static ArrayList pessoa_fisica = new ArrayList();
	
	public Fisica() {
		
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Fisica(long cpf) {
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	
	
	@Override
	public String toString() {
		return "Codigo: "+ codigo + "\nCPF: " + cpf + "\nNome: " + getNome() + "\nE-mail: " + getEmail() + "\nIdade: "
				+ getIdade() + "\nRua: " + getRua() + "\nBairro: "
				+ getBairro() + "\nCidade: " + getCidade() + "\nUF: " + getUf();
	}

	public void CadastrarPessoaFisica() {
		
		Scanner teclado = new Scanner(System.in);
		
		int c = 0; //contador para gerar o codigo da pessoa
		int opcao;
		do {
			
			System.out.println("--------------------------------");
    		System.out.println("\t Cadastro de Pessoa Física");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Voltar");
			opcao = teclado.nextInt();
				
			switch (opcao) {
				
				case 1:
					Fisica f = new Fisica();
					c++;
					f.setCodigo(c);
					
					System.out.println("Nome: ");
					f.setNome(teclado.nextLine());
					teclado.nextLine();
					System.out.println("E-mail: ");
					f.setEmail(teclado.nextLine());
					
					System.out.println("Idade: ");
					f.setIdade(teclado.nextInt());
					
					System.out.println("CPF: ");
					f.setCpf(teclado.nextLong());
					
					System.out.println("Rua: ");
					f.setRua(teclado.next());
					
					System.out.println("Bairro: ");
					f.setBairro(teclado.next());
					
					System.out.println("Cidade: ");
					f.setCidade(teclado.next());
				
					System.out.println("UF: ");
					f.setUf(teclado.next());
					teclado.nextLine();
				
					pessoa_fisica.add(f);
				
					System.out.println("Pessoa Física cadastrada com sucesso.");
					
					break;
					
				case 2:
					if (pessoa_fisica.isEmpty()) {
						
						System.out.println("Nenhuma pessoa foi cadastrada!!!");
						
					}else {
						
						for (int i = 0; i < pessoa_fisica.size(); i++) {
							System.out.println("-------------------------");
							System.out.println("\tPessoa Física: ");
							System.out.println(pessoa_fisica.get(i).toString());
							System.out.println("-------------------------");
						}
					}
					break;
			}
		}while(opcao!=3);
	}
	
		
}
