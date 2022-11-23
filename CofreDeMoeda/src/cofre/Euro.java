package cofre;

public class Euro extends Moeda {

	public Euro(double valor) {
		
		super(valor);
		
	}

	@Override
	public void info() {
		
		System.out.println("Euro: " + String.format("%.2f", valor));
		
	}

	@Override
	public double converter() {
		
		return valor * 5.14;//13 de out.
		
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
