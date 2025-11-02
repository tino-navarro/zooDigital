package br.edu.atitus.tino_markus.zoo_digital.app;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import br.edu.atitus.tino_markus.zoo_digital.animais.Animal;
import br.edu.atitus.tino_markus.zoo_digital.animais.*;
import br.edu.atitus.tino_markus.zoo_digital.comportamentos.*;

public class ZooDigitalApp {
	private static List<Animal> listaAnimais = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		
		do {
			exibirMenu();
			try {
				System.out.println("Escolha uma opção: ");
				opcao = Integer.parseInt(scan.nextLine());
				processarOpcao(opcao, scan);
				
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Digite um número.");
			}
			
		} while (opcao != 0);
		
		System.out.println("Programa encerrado.");
		scan.close();
	}
		
		private static void exibirMenu() {
			System.out.println("""
				=== Zoo Digital ===
				1 - Cadastrar Animal
				2 - Listar Todos Animais
				3 - Listar Animais Corredores
		  4 - Listar Animais Nadadores
		  5 - Listar Animais Voadores
		  6 - Listar Animais Predadores
		  7 - Listar Animais Rastejantes
		  8 - Exibir Total de Animais
		  0 - Sair
				""");
		}
		private static void processarOpcao(int opcao, Scanner scan) {
			switch (opcao) {
			case 1: 
				cadastrarAnimal(scan);
				break;
			
			case 2: 
				listarTodos();
				break;
			
			case 3: 
				listarCorredores();
				break;
				
			case 4: 
				listarNadadores();
				break;
			
			case 5: 
				listarVoadores();
				break;
			
			case 6: 
				listarPredadores();
				break;
				
			case 7: 
				listarRastejantes();
				break;
				
			case 8: 
				totalAnimais();
				break;	
			
			case 0: 
				break;	
			default:
				System.out.println("Opção Inválida!");
		}
	}
		
		
		
		private static void cadastrarAnimal(Scanner scan) {
			
			System.out.println("\n=== CADASTRAR ANIMAL ===");
			System.out.println("""
					\nTipos de animais disponíveis:
					\nBaiacu | Cachorro | Canário | Carpa
					\nCobra | Crocodilo | Ema | Golfinho
					\nLagarto | Lambari | Macaco | Onça Pintada
					\nPato | Pinguim | Tartaruga | Traira
					""");
			System.out.println("Escolha o tipo de animal:");
		    String tipo = scan.nextLine().trim().toLowerCase();
		    
		    System.out.println("Digite o nome do animal: ");
		    String nome = scan.nextLine();
		    
		    
		    System.out.println("Digite a espécie do animal");
		    String especie = scan.nextLine();
		    
		    System.out.println("Digite a idade do animal: (Somente números)");
		    int idade;
		 
		    try {
				idade = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Idade inválida. Cadastrando com idade 0.");
				idade = 0;
			}
		    
		    
		    String tipoAgua = "";
		    if (tipo.equals("baiacu") || tipo.equals("carpa") || tipo.equals("lambari") || tipo.equals("traira")) {
		        System.out.print("Digite o tipo de água (doce/salgada): ");
		        tipoAgua = scan.nextLine();
		    }
		    
		    
		    String corPenas = "";
		    if (tipo.equals("canario") || tipo.equals("ema") || tipo.equals("pato") || tipo.equals("pinguim")) {
		    	System.out.print("Digite a cor das penas: ");
		    	corPenas = scan.nextLine();
		    }
		    
		    Animal novoAnimal = null;
		    
		    switch (tipo) {
				case "baiacu": novoAnimal = new Baiacu(nome, especie, idade, tipoAgua); break;
	            case "cachorro": novoAnimal = new Cachorro(nome, especie, idade); break;
	            case "canario": novoAnimal = new Canario(nome, especie, idade, corPenas); break;
	            case "carpa": novoAnimal = new Carpa(nome, especie, idade, tipoAgua); break;
	            case "cobra": novoAnimal = new Cobra(nome, especie, idade); break;
	            case "crocodilo": novoAnimal = new Crocodilo(nome, especie, idade); break;
	            case "ema": novoAnimal = new Ema(nome, especie, idade, corPenas); break;
	            case "golfinho": novoAnimal = new Golfinho(nome, especie, idade); break;
	            case "lagarto": novoAnimal = new Lagarto(nome, especie, idade); break;
	            case "lambari": novoAnimal = new Lambari(nome, especie, idade, tipoAgua); break;
	            case "macaco": novoAnimal = new Macaco(nome, especie, idade); break;
	            case "onça pintada": novoAnimal = new OncaPintada(nome, especie, idade); break;
	            case "pato": novoAnimal = new Pato(nome, especie, idade, corPenas); break;
	            case "pinguim": novoAnimal = new Pinguim(nome, especie, idade, corPenas); break;
	            case "tartaruga": novoAnimal = new Tartaruga(nome, especie, idade); break;
	            case "traira": novoAnimal = new Traira(nome, especie, idade, tipoAgua); break;
	            default:
	                System.out.println("Tipo de animal desconhecido!");
	                break;
		    }
		    
		    if (novoAnimal != null) {
		        listaAnimais.add(novoAnimal);
		        System.out.println(novoAnimal.getNome() + " '" + novoAnimal.getEspecie() + "' cadastrado com sucesso!");
		    }
		}
		    
		    private static void listarTodos() {
		        System.out.println("\n=== Lista de Todos os Animais ===");
		        
		        if (listaAnimais.isEmpty()) {
		            System.out.println("Nenhum animal cadastrado ainda.");
		            return; 
		        }
		        for (Animal animal : listaAnimais) {
		            System.out.println(animal.getId() + " " + animal.getNome() + ", (" + animal.getEspecie() + "), " + animal.getIdade() + " anos + ");
		            animal.emitirSom();
		            animal.comer();
		            
		        }
		    }
		        
		    private static void listarCorredores() {
		    	System.out.println("\n=== Animais Corredores ===");
		    	
		            for (Animal animal : listaAnimais) {
		                if (animal instanceof Corredor corredor) {
		                    System.out.println("Nome: " + animal.getNome() + " - " + " Espécie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
		                    corredor.correr();
		                }
		         }            
		    }
		    
           private static void listarNadadores() {
        	   System.out.println("\n=== Animais Nadadores ===");
        	   
        	
        	   
        	   		for (Animal animal : listaAnimais) {
        	   			if (animal instanceof Nadador nadador) {
        	   				System.out.println("Nome: " + animal.getNome() + " - " + " Espécie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
        	   				
        	   			if (animal instanceof Peixe) {
           	   	             
            	   	        Peixe peixe = (Peixe) animal;
            	   	        String dadosAnimal = " (Água onde vive: " + peixe.getTipoAgua() + ")";
            	   	        System.out.println(dadosAnimal);
        	   				nadador.nadar();
        	   			}
        	   		}
        	   	}   		
            }
           
           private static void listarVoadores() {
        	   System.out.println("\n=== Animais Voadores ===");
        	   
        	 
        	   		for (Animal animal : listaAnimais) {
        	   			if (animal instanceof Voador voador) {
        	   				System.out.println("Nome: " + animal.getNome() + " - " + " Espécie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
        	   				
        	   			if (animal instanceof Ave) {
        	   	             
        	   	            Ave ave = (Ave) animal;
        	   	            String dadosAnimal = " (Cor das penas: " + ave.getCorPenas() + ")";
        	   	            System.out.println(dadosAnimal);
        	   	           
        	   	            voador.voar();
        	   			}
        	   		}
        	   	}
        	}
           
           private static void listarPredadores() {
        	   System.out.println("\n=== Animais Predadores ===");
        	   
        	   
        	   
        	   		for (Animal animal : listaAnimais) {
        	   			if (animal instanceof Predador predador ) {
        	   				System.out.println("Nome: " + animal.getNome() + " - " + " Espécie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
        	   				predador.cacar();
        	   			}
        	   		}
        	   	}
           
           private static void listarRastejantes() {
        	   System.out.println("\n=== Animais Rastejantes ===");
        	   
         
		        
        	   		for (Animal animal : listaAnimais) {
        	   			if (animal instanceof Rastejante rastejante) {
        	   				System.out.println("Nome: " + animal.getNome() + " - " + " Espécie: " + animal.getEspecie() + " - " + "Idade: " + animal.getIdade());
        	   				rastejante.rasteja();
        	   			}
        	   		}
        	   	}

           private static void totalAnimais() {
        	   
        	   System.out.println("=== Total de animais cadastrados ===");
        	   if (listaAnimais.isEmpty()) {
        		   System.out.println("Nenhum animal cadastrado ainda.");
        		   return; 
        	   }
        	   System.out.println("Animais cadastrados: " + Animal.getContador());
           }
	}
        	   
				
		
			    		
		    		
		

