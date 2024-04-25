package poo;

public class Carro {
	private int largo;
	private int ancho;
	private int ruedas;
	private int cilindraje;
	private int pesoPlataforma;
	
	private String color;
	private String tipo = "";
	private int pesoTotal;
	private boolean asientosCuero,climatizador;
	
	public Carro() {
		largo = 20;
		ancho = 10;
		ruedas = 4;
		cilindraje = 2000;
		pesoPlataforma = 1000;
	}
	
	public void estableceColor(String nuevo_color) {
		color = nuevo_color;
	}
	
	public String dameColor() {
		return color;
	}
	
	public String dame_datos_plataforma() {
		return "el largo del coche es " + largo + "mt " +"el ancho de " + ancho + " la cantidad de ruedas es " +ruedas +
				"posee un cilindraje de " + cilindraje + "el peso de la plataforma es " + pesoPlataforma;
	}
	
	public void configuraAsientos(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("s")) {
			this.asientosCuero = true;
		}else {
			this.asientosCuero = false;
		}
	}
	
	public String dameTipoAsiento() {
		if(asientosCuero==true) {
			return "el carro tiene asientos de cuero";
		}else {
			return "el carro tiene asientos sin cuero";
		}
	}
	
	public void estableceClimatizador(String tieneClimatizador) {//SETTER CLIMATIZADOR
		if(tieneClimatizador.equalsIgnoreCase("s")) {
			climatizador = true;
		}else {
			climatizador = false;
		}
	}

	public String dimeClimatizador() {//GETTER CLIMATIZADOR
		if(climatizador == true) {
			return "EL CARRO TIENE AIRE"; 
		}else {
			return "EL CARRO NO TIENE AIRE";
		}
	}
	
	public String damePeso() {//SETTER Y GETTER
		int pesoCarroceria=500;
		pesoTotal =pesoCarroceria+pesoPlataforma;
		if(climatizador==true) {
			pesoTotal += 50;
		}
		if(asientosCuero==true) {
			pesoTotal += 100;
		}
		 return "el peso total del vehiculo es: " + pesoTotal;
	}
	
	public int damePrecio() {
		int precioBase = 10000;
		if(climatizador==true) {
			precioBase += 1500;
		}
		if(asientosCuero==true) {
			precioBase += 1000;
		}
		return precioBase;
	}
	
	public void estableceTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String dameTipo() {
		return tipo;
	}
}
