package clases;

public class Trabajador {
	public int codigo, horasTrabajadas;
	public String nombre;
	public double tarifaHoraria;
	
	public double sueldoBruto(){
		return horasTrabajadas*tarifaHoraria;
	}
	public double descuentosTabla(){
		double descuento=0;
		if (sueldoBruto()<4500){
			descuento=sueldoBruto()*0.12;
		}
		else {
			if (sueldoBruto()<6500){
				descuento=sueldoBruto()*0.14;
			}
			else {
				descuento=sueldoBruto()*0.16;
			}
		}
		return descuento;
	}
	public double sueldoNeto(){
		return sueldoBruto()-descuentosTabla();
	}
}
