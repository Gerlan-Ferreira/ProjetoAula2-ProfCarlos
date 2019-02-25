package visao;
import java.util.Scanner;

import modelo.Carro;
import modelo.Fisica;
import modelo.Juridica;
import modelo.Moto;
import modelo.Trator;
import modelo.Veiculo;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Fisica pessoa_fisica = new Fisica();
		
		Juridica pessoa_juridica = new Juridica();
		
		Veiculo veiculo = new Veiculo();
		
		Carro carro = new Carro();
		
		Moto moto = new Moto();
		
		Trator trator = new Trator();
		
		Scanner tec = new Scanner(System.in);
		
		int opcao;
		int opcao2;
		int opcao3;
		
		do {
			System.out.println("--------------------------------");
			System.out.println("\t Seja bem-vindo!!!");
			System.out.println("--------------------------------");
		    System.out.println("1 - Cadastrar Pessoa");
		    System.out.println("2 - Cadastrar Veículo");
		    System.out.println("3 - Locação de Veículo");
		    System.out.println("4 - Sair");
		    System.out.println("--------------------------------");
		    System.out.println("Escolha uma das opções acima: ");
		    System.out.println("--------------------------------");
		    opcao = tec.nextInt();
		    
		    switch (opcao) {
		    
		    case 1:
		    	do {
		    		System.out.println("---------------------------");
		    		System.out.println("1 - Pessoa Física");
		    		System.out.println("2 - Pessoa Jurídica");
		    		System.out.println("3 - Voltar");
		    		System.out.println("---------------------------");
		    		System.out.println("Escolha uma das opções acima: ");
		    		opcao2 = tec.nextInt();
		    		
		    		switch(opcao2) {
		    		case 1: 
		    			
		    			pessoa_fisica.CadastrarPessoaFisica();
		    			
		    			break;
		    		case 2:
		    			
		    			pessoa_juridica.CadastrarPessoaJuridica();
		    			
		    			break;
		    		}
		    
		    		
		    	}while(opcao2 != 3);
		    		
		    	break;
		    case 2: 
		    	do {
		    	System.out.println("---------------------------");
	    		System.out.println("1 - Carro");
	    		System.out.println("2 - Moto");
	    		System.out.println("3 - Trator");
	    		System.out.println("4 - Voltar");
	    		System.out.println("---------------------------");
	    		System.out.println("Escolha uma das opções acima: ");
	    		opcao3 = tec.nextInt();
	    		switch(opcao3) {
	    		
	    		case 1: 
	    			
	    			carro.CadastrarCarro();
	    			
	    			break;
	    		case 2: 
	    			
	    			moto.CadastrarMoto();
	    			
	    			break;
	    		
	    		case 3: 
	    			
	    			trator.CadastrarTrator();
	    			
	    			break;
	    			}
		    	}while(opcao3 != 4);
		    	
		    	break;
		    case 3: 
		    	
		    	veiculo.LocacaoVeiculo();
		    	
		    	break;
		    }
		}while (opcao !=4);
	}
}
