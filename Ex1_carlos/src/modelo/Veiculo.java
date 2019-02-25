package modelo;
import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {
	
	private String marca;
	private int ano;
	private String cor;
	private String modelo;
	
	private ArrayList loc_veiculo = new ArrayList();
	
	public Veiculo() {
		
	}

	public Veiculo(String marca, int ano, String cor, String modelo) {
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + "\nAno: " + ano + "\nCor: " + cor + "\nModelo: " + modelo;
	}
	
	public void LocacaoVeiculo() {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		int opcao2;
		
		do {
			System.out.println("------------------------------");
			System.out.println("\t Locar Veículo");
			System.out.println("------------------------------");
			System.out.println("Escolha abaixo a que tipo de pessoa você é: ");
			System.out.println("1 - Física");
			System.out.println("2 - Jurídica");
			System.out.println("3 - Voltar");
			opcao = teclado.nextInt();
			
			switch(opcao) {
			case 1:
				if (Fisica.pessoa_fisica.isEmpty()) {
					System.out.println("Não tem como locar veiculo pois na base nao há pessoa fisica cadastrada ainda!");
				}else {
					System.out.println("--------------------------------------------------------");
					System.out.println("Segue abaixo as pessoas fisicas cadastradas no sistema: ");
					System.out.println("--------------------------------------------------------");
					for (int i = 0; i < Fisica.pessoa_fisica.size(); i++) {
						System.out.println("--------------------------");
						System.out.println("\t Pessoas Fisicas: ");
						System.out.println(Fisica.pessoa_fisica.get(i).toString());
						System.out.println("---------------------------");
						
					}
					System.out.println("-----------------------");
					System.out.println("Informe o seu codigo da pessoa para que vc possa locar um veiculo: ");
					int cod = teclado.nextInt();
					System.out.println("-----------------------");
					for (int i = 0; i < Fisica.pessoa_fisica.size(); i++ ) {
						
						Fisica aux = (Fisica) Fisica.pessoa_fisica.get(i);
						
						if (aux.getCodigo() == cod) {
							
							do {
								System.out.println("--------------------");
								System.out.println("1 - Carro");
								System.out.println("2 - Moto");
								System.out.println("3 - Trator");
								System.out.println("4 - Voltar");
								System.out.println("--------------------");
								System.out.println("Escolha uma das opções acima: ");
								opcao2 = teclado.nextInt();
								
								switch(opcao2) {
								case 1: 
									if (Carro.carro.isEmpty()) {
										System.out.println("Não tem como locar veiculo pois na base nao há carro cadastrado ainda!");
									}else {
										System.out.println("--------------------------------------------------------");
										System.out.println("Segue abaixo os carros cadastrados no sistema: ");
										System.out.println("--------------------------------------------------------");
										for (int j = 0; j < Carro.carro.size(); j++) {
											System.out.println("--------------------------");
											System.out.println("\t Carros: ");
											System.out.println(Carro.carro.get(j).toString());
											System.out.println("---------------------------");
											
										}
										System.out.println("-----------------------");
										System.out.println("Informe o codigo do carro que vc deseja locar: ");
										int cod_carro = teclado.nextInt();
										System.out.println("-----------------------");
										for (int k = 0; k < Carro.carro.size(); k++ ) {
											
											Carro aux_carro = (Carro) Carro.carro.get(k);
											
											if (aux_carro.getCodigo() == cod_carro) {
												
												System.out.println("Carro locado com sucesso");
												loc_veiculo.add(aux_carro);
												
											}
										}
									}
									break;
								case 2: 
									if (Moto.moto.isEmpty()) {
										System.out.println("Não tem como locar veiculo pois na base nao há moto cadastrada ainda!");
									}else {
										System.out.println("--------------------------------------------------------");
										System.out.println("Segue abaixo as motos cadastradas no sistema: ");
										System.out.println("--------------------------------------------------------");
										for (int j = 0; j < Moto.moto.size(); j++) {
											System.out.println("--------------------------");
											System.out.println("\t Motos: ");
											System.out.println(Moto.moto.get(j).toString());
											System.out.println("---------------------------");
											
										}
										System.out.println("-----------------------");
										System.out.println("Informe o codigo da moto que vc deseja locar: ");
										int cod_moto = teclado.nextInt();
										System.out.println("-----------------------");
										for (int k = 0; k < Moto.moto.size(); k++ ) {
											
											Moto aux_moto = (Moto) Moto.moto.get(k);
											
											if (aux_moto.getCodigo() == cod_moto) {
												
												System.out.println("Moto locada com sucesso");
												loc_veiculo.add(aux_moto);
												
											}
										}
									}
									break;
								case 3: 
									
									if (Trator.trator.isEmpty()) {
										System.out.println("Não tem como locar veiculo pois na base nao há trator cadastrada ainda!");
									}else {
										System.out.println("--------------------------------------------------------");
										System.out.println("Segue abaixo os tratores cadastradas no sistema: ");
										System.out.println("--------------------------------------------------------");
										for (int j = 0; j < Trator.trator.size(); j++) {
											System.out.println("--------------------------");
											System.out.println("\t Tratores: ");
											System.out.println(Trator.trator.get(j).toString());
											System.out.println("---------------------------");
											
										}
										System.out.println("-----------------------");
										System.out.println("Informe o codigo do trator que vc deseja locar: ");
										int cod_trator = teclado.nextInt();
										System.out.println("-----------------------");
										for (int k = 0; k < Trator.trator.size(); k++ ) {
											
											Trator aux_trator = (Trator) Trator.trator.get(k);
											
											if (aux_trator.getCodigo() == cod_trator) {
												
												System.out.println("Trator locado com sucesso");
												loc_veiculo.add(aux_trator);
												
											}
										}
									}
									break;
								}
								
							}while(opcao2 != 4);
						}
						
					}
				}
				break;
			case 2:
				if (Juridica.pessoa_juridica.isEmpty()) {
					System.out.println("Não tem como locar veiculo pois na base nao há pessoa juridica cadastrada ainda!");
				}else {
					System.out.println("--------------------------------------------------------");
					System.out.println("Segue abaixo as pessoas juridicas cadastradas no sistema: ");
					System.out.println("--------------------------------------------------------");
					for (int i = 0; i < Juridica.pessoa_juridica.size(); i++) {
						System.out.println("--------------------------");
						System.out.println("\t Pessoas Jurídicas: ");
						System.out.println(Juridica.pessoa_juridica.get(i).toString());
						System.out.println("---------------------------");
						
					}
					System.out.println("-----------------------");
					System.out.println("Informe o seu codigo da pessoa para que vc possa locar um veiculo: ");
					int cod = teclado.nextInt();
					System.out.println("-----------------------");
					for (int i = 0; i < Juridica.pessoa_juridica.size(); i++ ) {
						
						Juridica aux = (Juridica) Juridica.pessoa_juridica.get(i);
						
						if (aux.getCodigo() == cod) {
							
							do {
								System.out.println("--------------------");
								System.out.println("1 - Carro");
								System.out.println("2 - Moto");
								System.out.println("3 - Trator");
								System.out.println("4 - Voltar");
								System.out.println("--------------------");
								System.out.println("Escolha uma das opções acima: ");
								opcao2 = teclado.nextInt();
								
								switch(opcao2) {
								case 1: 
									if (Carro.carro.isEmpty()) {
										System.out.println("Não tem como locar veiculo pois na base nao há carro cadastrado ainda!");
									}else {
										System.out.println("--------------------------------------------------------");
										System.out.println("Segue abaixo os carros cadastrados no sistema: ");
										System.out.println("--------------------------------------------------------");
										for (int j = 0; j < Carro.carro.size(); j++) {
											System.out.println("--------------------------");
											System.out.println("\t Carros: ");
											System.out.println(Carro.carro.get(j).toString());
											System.out.println("---------------------------");
											
										}
										System.out.println("-----------------------");
										System.out.println("Informe o codigo do carro que vc deseja locar: ");
										int cod_carro = teclado.nextInt();
										System.out.println("-----------------------");
										for (int k = 0; k < Carro.carro.size(); k++ ) {
											
											Carro aux_carro = (Carro) Carro.carro.get(k);
											
											if (aux_carro.getCodigo() == cod_carro) {
												
												System.out.println("Carro locado com sucesso");
												loc_veiculo.add(aux_carro);
												
											}
										}
									}
									break;
								case 2: 
									if (Moto.moto.isEmpty()) {
										System.out.println("Não tem como locar veiculo pois na base nao há moto cadastrada ainda!");
									}else {
										System.out.println("--------------------------------------------------------");
										System.out.println("Segue abaixo as motos cadastradas no sistema: ");
										System.out.println("--------------------------------------------------------");
										for (int j = 0; j < Moto.moto.size(); j++) {
											System.out.println("--------------------------");
											System.out.println("\t Motos: ");
											System.out.println(Moto.moto.get(j).toString());
											System.out.println("---------------------------");
											
										}
										System.out.println("-----------------------");
										System.out.println("Informe o codigo da moto que vc deseja locar: ");
										int cod_moto = teclado.nextInt();
										System.out.println("-----------------------");
										for (int k = 0; k < Moto.moto.size(); k++ ) {
											
											Moto aux_moto = (Moto) Moto.moto.get(k);
											
											if (aux_moto.getCodigo() == cod_moto) {
												
												System.out.println("Moto locada com sucesso");
												loc_veiculo.add(aux_moto);
												
											}
										}
									}
									break;
								case 3: 
									
									if (Trator.trator.isEmpty()) {
										System.out.println("Não tem como locar veiculo pois na base nao há trator cadastrada ainda!");
									}else {
										System.out.println("--------------------------------------------------------");
										System.out.println("Segue abaixo os tratores cadastradas no sistema: ");
										System.out.println("--------------------------------------------------------");
										for (int j = 0; j < Trator.trator.size(); j++) {
											System.out.println("--------------------------");
											System.out.println("\t Tratores: ");
											System.out.println(Trator.trator.get(j).toString());
											System.out.println("---------------------------");
											
										}
										System.out.println("-----------------------");
										System.out.println("Informe o codigo do trator que vc deseja locar: ");
										int cod_trator = teclado.nextInt();
										System.out.println("-----------------------");
										for (int k = 0; k < Trator.trator.size(); k++ ) {
											
											Trator aux_trator = (Trator) Trator.trator.get(k);
											
											if (aux_trator.getCodigo() == cod_trator) {
												
												System.out.println("Trator locado com sucesso");
												loc_veiculo.add(aux_trator);
												
											}
										}
									}
									break;
								}
								
							}while(opcao2 != 4);
						}
						
					}
				}
				
				break;
			}
			
		}while(opcao != 3);
		
	}
	
}
