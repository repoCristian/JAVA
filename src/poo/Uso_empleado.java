package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
		
		Jefe jefe1 = new Jefe("jefe",50,19,5,25);
		Empleado[] empleados = new Empleado[3];
		empleados[0]= new Empleado("david",200,1990,12,20);
		empleados[1] = new Empleado("two",200,1980,2,22);
		empleados[2] = jefe1;
		jefe1.estableceIncentivo(200);
		System.out.print("empleado: "+ empleados[0].dameNombre()+" ganaba: " + empleados[0].dameSueldo()+" ");
		empleados[0].aumentoSueldo(10);
		System.out.println("luego de un aumento del 10% gana: " + empleados[0].dameSueldo());

		//lleno de info
		for(int i=0;i<2;i++) {
			System.out.println("nombre: "+empleados[i].dameNombre() +
					" sueldo " + empleados[i].dameSueldo());
		}
		
		for(Empleado e: empleados) {
			System.out.println("el sueldo del empleado "+e.dameNombre()+ " antes de aumento es: " + e.dameSueldo());
			e.aumentoSueldo(10);
			System.out.println("el sueldo del empleado "+e.dameNombre()+ " despues de aumento es: " + e.dameSueldo());
		}
	}
}

class Empleado{
	public Empleado(String nombre,double sueldo,int anio,int mes, int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nombre) {
		this(nombre,2000,2024,12,20);
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;

	public String dameNombre() {
		return nombre;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public void aumentoSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}

}

/*
	public Empleado(String nom,double sue, int anio,int mes, int dia) {
		this.nom  = nom;
		this.sue  = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
		altaContrato = calendario.getTime();
	}
	
	private String 	nom;
	private double 	sue;
	private Date 	altaContrato;

	public String dameNombre() {//GETTER
		return nom;
	}
	
	public double dameSueldo() {//GETTER
		return sue;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sue*porcentaje/100;
		sue += aumento;
	}*/


class Jefe extends Empleado{
	private double incentivo;
	
	public Jefe(String nombre,double sueldo,int anio,int mes, int dia) {
		super(nombre,sueldo,anio,mes,dia);
	}
	
	public void estableceIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double dameSueldo() {
		double sueldoJefe;
		sueldoJefe = super.dameSueldo(); 
		return sueldoJefe + incentivo;
	}
}