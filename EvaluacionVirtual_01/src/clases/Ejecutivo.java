package clases;

public class Ejecutivo {
	public int codigo,horasTrabajadas;
	public String nombre;
	public double tarifaHorara;
	public double suledoBruto(){
	return tarifaHorara*horasTrabajadas;
	}
	public double descuentoAFP(){
	return suledoBruto()*0.10;
	}
	public double descuentoEPS(){
	return suledoBruto()*0.05;
	}
	public double sueldoNeto(){
	return suledoBruto()-( descuentoAFP() + descuentoEPS());
	}
}
