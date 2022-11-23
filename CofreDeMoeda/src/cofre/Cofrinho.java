package cofre;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public ArrayList<Moeda> getListaMoedas() {
		
		return listaMoedas;
		
	}

	public void adicionar(Moeda valor) {
		
		listaMoedas.add(valor);
		
	}
	
	public void remover(Moeda valor) {
		
		listaMoedas.remove(valor);
		
	}

	public void listagemMoedas() {
		
		for (Moeda valor : listaMoedas) {
			valor.info();
			
		}

	}
	
	//Soma as moedas e converté-las em real
	public void totalConvertido() {

		double total = 0;
		for (Moeda valor : listaMoedas) {
			
			total += valor.converter();
			
		}

		System.out.println("Valor total: R$ " + String.format("%.2f", total));
	}
	
}