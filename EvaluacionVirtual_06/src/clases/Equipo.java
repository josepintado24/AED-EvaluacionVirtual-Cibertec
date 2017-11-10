package clases;

public class Equipo {
	/*privados: código (int), marca (String), precio unitario (double) y unidades (int);
	 *  un constructor que inicialice los atributos privados,
	 *  los métodos de acceso público set/get y el método aPagar (precio * unidades).*/
	private int codigo;
	private String marca;
	private double precioUnitario;
	private int unidades;
	public Equipo(int codigo, String marca, double precioUnitario, int unidades) {
		this.codigo = codigo;
		this.marca = marca;
		this.precioUnitario = precioUnitario;
		this.unidades = unidades;
	}
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
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public double aPagar(){
		return (precioUnitario * unidades);
	}
	

}
