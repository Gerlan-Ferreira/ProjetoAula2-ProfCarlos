package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Trator extends Veiculo{
	
	private int codigo;
	private String tipo;
	
	public static ArrayList trator = new ArrayList();
	
	public Trator() {
		
	}

	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Trator(String tipo) {
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Codigo: " + codigo + "\nTipo: " + tipo + "\nMarca: " + getMarca() + "\nAno: " + getAno()
				+ "\nCor: " + getCor() + "\nModelo: " + getModelo();
	}
	
	public void CadastrarTrator() {
		
		Scanner teclado = new Scanner(System.in);
		
		int c = 0; //contador para gerar o codigo da pessoa
		int opcao;
		do {
			
			System.out.println("--------------------------------");
    		System.out.println("\t Cadastro de Trator(es)");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Voltar");
			opcao = teclado.nextInt();
				
			switch (opcao) {
				
				case 1:
					Trator trator1 = new Trator();
					c++;
					trator1.setCodigo(c);
					
					System.out.println("Marca: ");
					trator1.setMarca(teclado.next());
					teclado.nextLine();
					System.out.println("Ano: ");
					trator1.setAno(teclado.nextInt());
					
					System.out.println("Cor: ");
					trator1.setCor(teclado.next());
					teclado.nextLine();
					System.out.println("Modelo: ");
					trator1.setModelo(teclado.nextLine());
					
					System.out.println("Tipo -> Esteira, Escavadeira ou RetroEscavadeira: ");
					trator1.setTipo(teclado.nextLine());
				
					trator.add(trator1);
				
					System.out.println("Carro cadastrado com sucesso.");
					
					break;
					
				case 2:
					if (trator.isEmpty()) {
						
						System.out.println("Nenhum trator foi cadastrado!!!");
						
					}else {
						
						for (int i = 0; i < trator.size(); i++) {
							System.out.println("-------------------------");
							System.out.println("\tTrator: ");
							System.out.println(trator.get(i).toString());
							System.out.println("-------------------------");
						}
					}
					break;
			}
		}while(opcao!=3);
	}
}
