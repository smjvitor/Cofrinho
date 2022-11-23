package cofre;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		
		super(valor);
		
	}
	
	@Override
	public void info() {
		
		System.out.println("Dólar: " + String.format("%.2f", valor));
		
	}

	@Override
	public double converter() {
		
		return valor * 5.29;//13 de out.
		
	}

	@Override
	public boolean equals(Object objeto) {
		
		if (this == objeto)
			return true;
		if (!super.equals(objeto))
			return false;
		if (getClass() != objeto.getClass())
			return false;
		return true;
		
	}

}