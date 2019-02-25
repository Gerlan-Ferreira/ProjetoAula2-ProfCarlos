package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Moto extends Veiculo{
	
	private int codigo;
	private int cc;
	
	public static ArrayList moto = new ArrayList();
	
	public Moto() {
		
	}

	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Moto(int cc) {
		this.cc = cc;
	}


	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
	}


	@Override
	public String toString() {
		return "Codigo: " + codigo + "\nCilindradas: " + cc + "\nMarca: " + getMarca() + "\nAno: " + getAno()
				+ "\nCor: " + getCor() + "\nModelo: " + getModelo();
	}
	
	
	public void CadastrarMoto() {
		
		Scanner teclado = new Scanner(System.in);
		
		int c = 0; //contador para gerar o codigo da pessoa
		int opcao;
		do {
			
			System.out.println("--------------------------------");
    		System.out.println("\t Cadastro de Moto(s)");
			System.out.println("--------------------------------");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Voltar");
			opcao = teclado.nextInt();
				
			switch (opcao) {
				
				case 1:
					Moto moto1 = new Moto();
					c++;
					moto1.setCodigo(c);
					
					System.out.println("Marca: ");
					moto1.setMarca(teclado.next());
					teclado.nextLine();
					
					System.out.println("Ano: ");
					moto1.setAno(teclado.nextInt());
					
					System.out.println("Cor: ");
					moto1.setCor(teclado.next());
					teclado.nextLine();
					
					System.out.println("Modelo: ");
					moto1.setModelo(teclado.nextLine());
					
					System.out.println("Cilindradas: ");
					moto1.setCc(teclado.nextInt());
				
					moto.add(moto1);
				
					System.out.println("Carro cadastrado com sucesso.");
					
					break;
					
				case 2:
					if (moto.isEmpty()) {
						
						System.out.println("Nenhuma moto foi cadastrada!!!");
						
					}else {
						
						for (int i = 0; i < moto.size(); i++) {
							System.out.println("-------------------------");
							System.out.println("\tMoto: ");
							System.out.println(moto.get(i).toString());
							System.out.println("-------------------------");
						}
					}
					break;
			}
		}while(opcao!=3);
	}

	
	
}
