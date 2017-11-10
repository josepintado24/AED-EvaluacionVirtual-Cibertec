package clases;

public class Asistente {
	/*Diseñe la clase Asistente con los atributos privados: codigo (int), nombre (String), dni (int) y sueldo en soles (double).*/
	private int codigo, dni;
	private String nombre;
	double sueldoSoles;
	//Una variable privada de clase que cuente la cantidad de objetos tipo Asistente creados.
	private static int cantidad;
	//Una variable privada de clase que acumule los sueldos.
	private static double sumaSueldo;
	//Un bloque de inicialización static para dar valores a las variables privadas de clase.
	static{
		cantidad=0;
		sumaSueldo=0;
	}
	//Un constructor que inicialice a los atributos privados (haga uso de la referencia this), cuente la cantidad de objetos creados y sume los sueldos en soles de los asistentes.
	public Asistente(int codigo, int dni, String nombre, double sueldoSoles) {
		
		this.codigo = codigo;
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoSoles = sueldoSoles;
		cantidad ++;
		sumaSueldo=sumaSueldo+sueldoSoles;
	}
	//Métodos de acceso público set para todos los atributos privados. Haga uso de la referencia this.
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setSueldoSoles(double sueldoSoles) {
		this.sueldoSoles = sueldoSoles;
	}
	//Métodos de acceso público get para todos los atributos privados.
	public int getCodigo() {
		return codigo;
	}
	public int getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public double getSueldoSoles() {
		return sueldoSoles;
	}
	//Métodos públicos de clase set/get para las variables privadas de clase.
	public static int getCantidad() {
		return cantidad;
	}
	public static void setCantidad(int cantidad) {
	Asistente.cantidad = cantidad;
	}
	public static double getSumaSueldo() {
		return sumaSueldo;
	}
	public static void setSumaSueldo(double sumaSueldo) {
		Asistente.sumaSueldo = sumaSueldo;
	}
	//Un método que retorne un texto indicando si el sueldo es “mayor a 1500”, “menor a 1500” o “igual a 1500”.
	public String sueldoMayor(){
		String mensaje="";
		if (getSueldoSoles()<1500){
			mensaje="menor a 1500";
		}
		else {
		if (getSueldoSoles()>1500){
			mensaje="mayor a 1500";
		}
		else
			mensaje="igual a 1500";
		}
		return mensaje;
		}
}
