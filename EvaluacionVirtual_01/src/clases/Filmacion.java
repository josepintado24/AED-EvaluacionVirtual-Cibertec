package clases;

public class Filmacion {
	public int codigo;
	public String titulo;
	public int minutosFilmacion;
	public  double precioSoles;
	
	 double dolar=3.38;
	
	public double cambioDolares(){
		return precioSoles/dolar;
	}
	
	
}
