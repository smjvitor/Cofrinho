package cofre;

public abstract class Moeda {

	double valor;

	public Moeda(double valor) {
		
		this.valor = valor;
		
	}

	public abstract void info();
	public abstract double converter();


	@Override
	public boolean equals(Object objeto) {
		
		if (this == objeto)
			return true;
		if (objeto == null)
			return false;
		if (getClass() != objeto.getClass())
			return false;
		
		Moeda other = (Moeda) objeto;
		
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
}
