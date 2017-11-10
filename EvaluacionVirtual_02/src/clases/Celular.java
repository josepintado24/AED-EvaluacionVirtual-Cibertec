package clases;

public class Celular {
	private int numero, segundosConsumidos;
	private String usuario;
	private double precioSegundo;
	
	public Celular(int numero, String usuario, int segundosConsumidos, double precioConsumidos){
		this.numero=numero;
		this.segundosConsumidos=segundosConsumidos;
		this.usuario=usuario;
		this.precioSegundo=precioConsumidos;
	}
		
	
	
		public void setNumero(int numero){
			this.numero=numero;
		}
		public int getNumero(){
			return numero;
		}
		
		
		public void setSegundosConsumidos(int SegundosConsumidos){
			this.segundosConsumidos=SegundosConsumidos;
		}
		public int getSegundosConsumidos() {
			return segundosConsumidos;
		}
		
		
		
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}



		public double getPrecioSegundo() {
			return precioSegundo;
		}
		public void setPrecioSegundo(double precioSegundo) {
			this.precioSegundo = precioSegundo;
		}



		
		



		public double Consumo(){
			return segundosConsumidos*precioSegundo;
		}
		public double IGV(){
			return Consumo()*0.18;
		}
		public double Total(){
			return Consumo()+IGV();
		}
	
	
}
