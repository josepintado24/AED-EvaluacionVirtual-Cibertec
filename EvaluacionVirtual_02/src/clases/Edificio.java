package clases;

public class Edificio {
	private int codigo, numDepartamentos, cantidadPisos;
	private double precioDolaresDepartamento;
	
	public Edificio(int codigo, int numDepartamentos, int cantidadPisos, double precioDolaresDepartamento){
		this.codigo=codigo ;
		this.numDepartamentos=numDepartamentos;
		this.cantidadPisos=cantidadPisos;
		this.precioDolaresDepartamento=precioDolaresDepartamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumDepartamentos() {
		return numDepartamentos;
	}

	public void setNumDepartamentos(int numDepartamentos) {
		this.numDepartamentos = numDepartamentos;
	}

	public int getCantidadPisos() {
		return cantidadPisos;
	}

	public void setCantidadPisos(int cantidadPisos) {
		this.cantidadPisos = cantidadPisos;
	}

	public double getPrecioDolares() {
		return precioDolaresDepartamento;
	}

	public void setPrecioDolares(double precioDolares) {
		this.precioDolaresDepartamento = precioDolares;
	}
	public double precioDolaresOperador(int cantDepartamentos){
		return precioDolaresDepartamento*cantDepartamentos;
	}
	
	

}
