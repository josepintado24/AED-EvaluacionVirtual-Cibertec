package clases;

public class Factura {
	//ATRIBUTOS
	private String ruc, empresa;
	private int unidades;
	private double unitario;
	
	private static int cantidad;
	private static double sumaImporteFacturado;
	public static final String constante;
	
	static{
		cantidad=0;
		sumaImporteFacturado=0;
		constante="SUNAT";
	}
	//CONSTRUCTORES
	public Factura(String ruc, String empresa, int unidades, double unitario) {
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.unitario = unitario;
		sumaImporteFacturado=sumaImporteFacturado+(importeFacturado());
		cantidad=cantidad+1;
	}
	public Factura (String ruc, String empresa){
		this(ruc,empresa,10,50.0);
	}
	public Factura (){
		this("11111111111","MN-Global SRL");
	}
	
	//METODOS GET AND SET
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getUnitario() {
		return unitario;
	}
	public void setUnitario(double unitario) {
		this.unitario = unitario;
	}
	
	
	public static int getCantidad() {
		return cantidad;
	}
	public static void setCantidad(int cantidad) {
		Factura.cantidad = cantidad;
	}
	public static double getSumaImporteFacturado() {
		return sumaImporteFacturado;
	}
	public static void setSumaImporteFacturado(double sumaImporteFacturado) {
		Factura.sumaImporteFacturado = sumaImporteFacturado;
	}
	public static String getNombre() {
		return constante;
	}
	
	public double importeFacturado() {
		return this.getUnitario()*this.getUnidades();
	}
	

}
