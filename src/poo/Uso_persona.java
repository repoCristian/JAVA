package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		Persona[] personas = new Persona[2];
		personas[0] = new Empleado2("a",50000,10,20,2024);
		personas[1] = new Alumno("b","informática");
		
		for(Persona p: personas) {
			System.out.println(p.dameNombre()+" "+p.dameDescripcion());
		}
	}
}

abstract class Persona{
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String dameNombre() {
		return nombre;
	}

	public abstract String dameDescripcion();
	
}


class Empleado2 extends Persona{
	public Empleado2(String nombre,double sueldo,int anio,int mes, int dia) {
		super(nombre);
		this.sueldo = sueldo;
		id=idSiguiente;
		idSiguiente++;
		GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
		altaContrato = calendario.getTime();
	}
	
	private static int idSiguiente=1;
	private int id;
	private double sueldo;
	private Date altaContrato;

	public String dameDescripcion() {
		return  "tiene un id: " + id + " recibe un sueldo de: " +sueldo;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public void aumentoSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}

}


class Alumno extends Persona {
	private String carrera;
	
	public Alumno(String nom,String carrera) {
		super(nom);
		this.carrera= carrera;
	}
	
	public String dameDescripcion() {
		return "esta registrado en: " +carrera;
	}
}
