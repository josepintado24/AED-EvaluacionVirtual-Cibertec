package clases;

public class Computadora {
	private int codigo;
	private String marca, color;
	private double precioDolar;
	
	public Computadora(int codigo,String marca,String color,double precioDolar){
		this.codigo=codigo;
		this.marca=marca;
		this.color=color;
		this.precioDolar=precioDolar;
	}
	//Métodos de acceso público set/get para todos los atributos privados
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioDolar() {
		return precioDolar;
	}

	public void setPrecioDolar(double precioDolar) {
		this.precioDolar = precioDolar;
	}
	//Un método que retorne el precio de la computadora en soles (1 dólar = 3.25 soles)
	public double precioSoles(double precioDolar){
		return precioDolar*3.25;
	}
	// Un método que retorne el precio de la computadora en euros (1 euro = 1.20 dólares).
	public double precioEuros(double precioDolar){
		return precioDolar/1.20;
	}
	
	
}
