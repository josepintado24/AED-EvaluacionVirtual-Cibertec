package clases;

public class Empleado {
	/*Diseñe la clase Empleado en el paquete semana_03 con los atributos privados: codigo (int), nombre
	(String), categoria (int) y número de celular (int).*/
	private int codigo,categoria,numcelular;
	private String nombre;
	//Una variable privada de clase que cuente la cantidad de objetos tipo Empleado creados (int)
	private static int cantidadObj;
	//Una variable privada de clase que acumule la suma de los sueldos netos (double).
	private static double sumaSueldoNeto;
	// Una constante pública de clase para un factor de descuento (double)
	public static double descuento;
	//Un bloque de inicialización static para asignarle a la constante el valor 0.15 e inicializar con cero las variables privadas de clase.
	static{
		cantidadObj=0;
		sumaSueldoNeto=0;
		descuento=0.15;
	}
	/*Un constructor que inicialice a todos los atributos, cuente la cantidad de objetos creados y
	acumule los sueldos netos. Haga uso de la referencia this*/
	public Empleado(int codigo, int categoria, int numcelular, String nombre) {
		this.codigo = codigo;
		this.categoria = categoria;
		this.numcelular = numcelular;
		this.nombre = nombre;
		cantidadObj=cantidadObj+1;
		sumaSueldoNeto=sumaSueldoNeto;;
	}
	/*Un constructor con dos parámetros que inicialice sólo los atributos codigo y nombre,
	invocando al primer constructor usando la referencia this, enviando con el valor 2 la categoría
	y con 999999999 el número de celular.*/
	public Empleado(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	
	
	
	
	
}
