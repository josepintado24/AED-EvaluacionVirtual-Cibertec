package arreglos;

public class ArregloTemperaturas {
	//Propuesto_6_1
	private double temperatura[];
	private int indice;
	/*Un Constructor sin parámetros que reserve 10 espacios en temperatura e inicialice con 0 al indice.*/
	
	public ArregloTemperaturas(){
		temperatura=new double[10] ;
		indice=0;
	}
	
	/*Un método tamaño que retorne la cantidad de datos ingresados hasta ese momento.*/
	public int tamano(){
		return indice;
	}
	
	/*Un método obtener que reciba una posición y retorne la temperatura registrada en*/
	public double obtener (int pos){
		return temperatura[pos];
	}
	
	/*Un método privado ampliarArreglo que extienda el arreglo en diez espacios más.*/
	private void ampliarArreglo(){
		double auxi[]=temperatura;
		temperatura=new double [indice+10];
		for(int i=0;i<tamano();i++){
			temperatura[i]=auxi[i];
		}
		
	}
	/*Un método adicionar que reciba una temperatura y la registre en la posición que corresponda.
	 *  Verifique primero si el arreglo está lleno para invocar al método ampliarArreglo.*/
	public void adicionar(double tempe){
		if (tamano()==temperatura.length){
			ampliarArreglo();
		}
		temperatura[indice]=tempe;
		indice++;
	}
	
	/*Un método eliminarAlFinal que elimina lógicamente la última temperatura del arreglo.*/
	public void eliminarAlFinal(){
		indice--;
	}
	/*Un método eliminarTodo que elimina lógicamente todas las temperaturas.*/
	public void eliminarTodo(){
		indice=0;
	}
	
	/*Un método temperaturaMenor que tetorne la emperatura más baja.*/
	public double temperaturaMenor(){
		double temMenor=temperatura[0];
		for (int i=0;i<tamano()-1;i++){
			if (temMenor>temperatura[i]){
				temMenor=temperatura[i];
			}
		}	
		
		
		return temMenor;
	}
	/*Un método buscarPrimeraTemperaturaNormal que retorne la posición de la primera temperatura
	 *  encontrada en el rango de 36.1°C a 37.2°C.*/
	public int buscarPrimeraTemperaturaNormal(){
		for (int i=0;i<tamano()-1;i++){
			if ((temperatura[i]>=36.1) && (temperatura[i]<=37.2)){
				return i;
			}
		}
		return 0;
	}
	
	/*Un método remplazarPrimeraTemperaturaNormal que cambie la primera temperatura normal por la 
	 *menor temperatura del arreglo. Para el efecto, invoque a los métodos buscarPrimeraTemperaturaNormal y temperaturaMenor.*/
	
	public void remplazarPrimeraTemperaturaNormal(){
		temperatura[buscarPrimeraTemperaturaNormal()]=temperaturaMenor();
	}
	
	/*Un método incrementarTemperaturas que aumente todas las temperaturas en 0.2°C.*/
	
	public void incrementarTemperaturas(){
		for (int i=0;i<tamano()-1;i++){
				double valor=temperatura[i];
				temperatura[i]=valor+0.2;
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
