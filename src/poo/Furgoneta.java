package poo;

public class Furgoneta extends Carro{
	private int asientosExtras;
	private int capacidadCarga;

	public Furgoneta(int asientosExtra, int capacidadCarga) {
		super();
		this.asientosExtras = asientosExtra;
		this.capacidadCarga = capacidadCarga;
	}
	
	public String datosFurgoneta() {
		return " capacidad de carga es: " + capacidadCarga 
				+ " la cantidad de asientos extra son: " + asientosExtras;
	}
}

