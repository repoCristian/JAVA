package poo;

public class Prueba {

	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Juan");
		Empleados trabajador2 = new Empleados("David");
		Empleados trabajador3 = new Empleados("DOIT");
		
		System.out.println(trabajador1.dameDatos());
		trabajador1.cambiarSeccion("RRHH");
		System.out.println(trabajador1.dameDatos());		
		System.out.println(trabajador2.dameDatos());		
	}

}

class Empleados {
	
	public Empleados(String nombre) {
		this.nombre = nombre;
		seccion = "Administración";
		id = idSiguiente;
		idSiguiente++;
	}
	
	public String dameDatos() {
		return "id: "+ id +" nombre: " + nombre + " sección " + seccion;
	}
	
	public void cambiarSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
	private String nombre;
	private String seccion;
	private static int idSiguiente=1;
	private int id;
}
