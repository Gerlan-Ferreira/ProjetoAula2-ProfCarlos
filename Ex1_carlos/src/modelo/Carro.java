package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Carro extends Veiculo{
	
	private int codigo;
	private String tipo;
	public static ArrayList carro = new ArrayList();
	
	public Carro() {
		
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public Carro(String tipo) {
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

	public void CadastrarCarro() {
		
		Scanner teclado = new Scanner(System.in);
		
		int c = 0; //contador para gerar o codigo da pessoa
		int opcao;
		do {
			
			System.out.println("--------------------------------");
    		System.out.println("\t Cadastro de Carro(s)");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Voltar");
			opcao = teclado.nextInt();
				
			switch (opcao) {
				
				case 1:
					Carro carro1 = new Carro();
					c++;
					carro1.setCodigo(c);
					
					System.out.println("Marca: ");
					carro1.setMarca(teclado.next());
					teclado.nextLine();
					System.out.println("Ano: ");
					carro1.setAno(teclado.nextInt());
					
					System.out.println("Cor: ");
					carro1.setCor(teclado.next());
					teclado.nextLine();
					System.out.println("Modelo: ");
					carro1.setModelo(teclado.nextLine());
					
					System.out.println("Tipo -> Luxo, Popular ou Utilitário: ");
					carro1.setTipo(teclado.nextLine());
				
					carro.add(carro1);
				
					System.out.println("Carro cadastrado com sucesso.");
					
					break;
					
				case 2:
					if (carro.isEmpty()) {
						
						System.out.println("Nenhum carro foi cadastrado!!!");
						
					}else {
						
						for (int i = 0; i < carro.size(); i++) {
							System.out.println("-------------------------");
							System.out.println("\tCarro: ");
							System.out.println(carro.get(i).toString());
							System.out.println("-------------------------");
						}
					}
					break;
			}
		}while(opcao!=3);
		
	}
	
}
