package clases;

public class Obrero {
	private int codigo, hTrabajada;
	private String nombres;
	private double hTarifa;
	
	public Obrero(int codigo, int hTrabajada, String nombres, double hTarifa) {
		this.codigo = codigo;
		this.hTrabajada = hTrabajada;
		this.nombres = nombres;
		this.hTarifa = hTarifa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int gethTrabajada() {
		return hTrabajada;
	}

	public void sethTrabajada(int hTrabajada) {
		this.hTrabajada = hTrabajada;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public double gethTarifa() {
		return hTarifa;
	}

	public void sethTarifa(double hTarifa) {
		this.hTarifa = hTarifa;
	}
	//Un método que retorne el sueldo bruto (horas*tarifa).
	public double sueldoBruto(){
		return hTrabajada*hTarifa;
	}
	//Un método que retorne el descuento por AFP (10% del sueldo bruto)
	public double descuentoAFP(){
		return sueldoBruto()*0.10;
	}
	//Un método que retorne el descuento por EPS (5% del sueldo bruto).
	public double descuentoEPS(){
		return sueldoBruto()*0.05;
	}
	//Un método que retorne el sueldo neto (sueldoBruto – descuentoAFP – descuentoEPS).
	public double sueldoNeto(){
		return sueldoBruto()-(descuentoEPS()+descuentoAFP());
	}
}
