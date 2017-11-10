package clases;

public class Alumno {
	private int codigo, nota1,nota2;
	private String nombre;
	private static int cantidad;
	static{
		cantidad=0;
	}
	
	public Alumno(int codigo, int mota1, int nota2, String nombre) {
		this.codigo = codigo;
		this.nota1 = mota1;
		this.nota2 = nota2;
		this.nombre = nombre;
		cantidad=cantidad+1;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getnota1() {
		return nota1;
	}

	public void setMota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Alumno.cantidad = cantidad;
	}
	
	
}
