package cofre;

public class Real extends Moeda {

	public Real(double valor) {
		
		super(valor);
		
	}

	@Override
	public void info() {
		
		System.out.println("Real: " + String.format("%.2f", valor));
		
	}

	@Override
	public double converter() {	
		
		return valor;
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
