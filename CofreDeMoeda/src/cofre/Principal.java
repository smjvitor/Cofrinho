package cofre;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("João Vitor SM");
		
		Scanner teclado = new Scanner(System.in);
		
		Cofrinho cofrinho = new Cofrinho();
		
		Moeda moeda = null;
		
		int menu;

		try {
				System.out.println("-----------MENU-----------");
				System.out.println("1-Adicionar Moedas");
				System.out.println("2-Remover Moedas");
				System.out.println("3-Listar Moedas");
				System.out.println("4-Total das moedas convertidas");
				System.out.println("0-Sair");
				System.out.println("--------------------------");
				
				menu = teclado.nextInt();
				
				do{
				
					switch(menu) {
					
					case 1: // Escolher qual moeda
						
						int opcoes = 0;
						
						do {
	
		    				System.out.println("-------ADICIONAR MOEDAS-------");
							System.out.println("Escolha o tipo de moeda abaixo");
							System.out.println("1-REAL");
							System.out.println("2-DÓLAR");
							System.out.println("3-EURO");
							System.out.println("0-CANCELAR E VOLTAR");
							
							opcoes = teclado.nextInt();
	
							if (opcoes == 1) {
								
								System.out.print("Valor da moeda BRL: ");
								moeda = new Real(teclado.nextDouble());
								cofrinho.adicionar(moeda);
								
							} 
							else if (opcoes == 2) {
	
								System.out.print("Valor da moeda USD: ");
								moeda = new Dolar(teclado.nextDouble());
								cofrinho.adicionar(moeda);
								
							} 
							else if (opcoes == 3) {
	
								System.out.print("Valor da moeda EUR: ");
								moeda = new Euro(teclado.nextDouble());
								cofrinho.adicionar(moeda);
								
							} 
							else if (opcoes == 0) { // "quebra" o código e volta ao menu inicial ser for igual a 0
								
								System.out.println("Voltando ao menu");
								
							}
						}while (opcoes != 0);  //Continua no menu adicionar se for diferente de zero 
						
						break;
						
					case 2:  // Remover moeda
							
						do {
	
							System.out.println("----------REMOVER MOEDAS----------");
							System.out.println("Selecione qual moeda deseja excluir");
							System.out.println("1-REAL");
							System.out.println("2-DÓLAR");
							System.out.println("3-EURO");
							System.out.println("0-CANCELAR E VOLTAR");
						
							opcoes = teclado.nextInt();
	
							if (opcoes == 1) {
								
								System.out.print("Valor da moeda BRL: ");
								moeda = new Real(teclado.nextDouble());
								cofrinho.remover(moeda); 
								
							}
							else if (opcoes == 2) {
								
								System.out.print("Valor da moeda USD: ");
								moeda = new Dolar(teclado.nextDouble());
								cofrinho.remover(moeda);
	
							}
							else if (opcoes == 3) {	
								
								System.out.print("Valor da moeda EUR: ");
								moeda = new Euro(teclado.nextDouble());
								cofrinho.remover(moeda);
								
							}
							else if (opcoes == 0) {  // "quebra" o código e volta ao menu inicial ser for igual a 0
								
								System.out.println("Voltando ao menu");
								break;
							}

						}while (opcoes != 0); // Continua no menu remover se for diferente de zero 
						
						break;
	
					
					case 3:    // Exibir lista
						
						System.out.println("-----MOEDAS NO COFRINHO-----");
						cofrinho.listagemMoedas();
						break;
	
					
					case 4:   // Somar e converter todas as moedas em brl
						
						System.out.println("---TOTAL SOMADO NO COFRINHO EM REAL(R$)---");
						cofrinho.totalConvertido();
						break;
	
					default:
						
						System.out.println("Opção inválida");
						
					}
					
					System.out.println("-----------MENU-----------");
					System.out.println("1-Adicionar Moedas");
					System.out.println("2-Remover Moedas");
					System.out.println("3-Listar Moedas");
					System.out.println("4-Total moeda convertida");
					System.out.println("0-Sair");
					System.out.println("--------------------------");
					menu = teclado.nextInt();
					
				}while(menu != 0); // Enquanto o número for diferente de 0 no menu inicial o programa vai continuar

		    }
		
		// ERROS
		catch(InputMismatchException erro){ // Erro de digitação e o programa é encerrado
			
				System.out.println("ERRO");
				System.out.println("Use uma opção válida e utilize apenas ','(não use '.' ou outros) ");
				System.out.println("Programa Encerrado!");
				
		}

	}

}