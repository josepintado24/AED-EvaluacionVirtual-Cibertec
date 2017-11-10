package clases;

public class Alumno {
	// Atributos públicos
	public int codigo, nota1, nota2;
	public String nombre;
	// Operaciones públicas
	public double promedio() {
		return (nota1 + nota2) / 2.0;
	}
	

}
