package poo;

import javax.swing.*;

public class UsoCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.estableceColor(JOptionPane.showInputDialog("ingrese color"));
		System.out.println(carro1.dame_datos_plataforma());
		System.out.println(carro1.dameColor());
		carro1.configuraAsientos(JOptionPane.showInputDialog("tiene asientos"));
		System.out.println(carro1.dameTipoAsiento());
		carro1.estableceClimatizador(JOptionPane.showInputDialog("tiene climatizador"));
		System.out.println(carro1.dimeClimatizador());
		System.out.println(carro1.damePeso());
		System.out.println("el precio del vehiculo es: "+carro1.damePrecio());
		
		Furgoneta miFurgoneta1 = new Furgoneta(2,300);
		miFurgoneta1.estableceTipo("FURGONETA");
		miFurgoneta1.estableceColor(JOptionPane.showInputDialog("ingresa color Furgoneta"));
		System.out.println("mi " + miFurgoneta1.dameTipo()+
				" es de color "+miFurgoneta1.dameColor()+
				" y sus caracteristicas son: " + miFurgoneta1.dame_datos_plataforma()+ miFurgoneta1.datosFurgoneta());
	}

}
