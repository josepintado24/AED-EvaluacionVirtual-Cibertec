package arreglos;

public class Arreglo {
	
	/*atributos privados int  n 
	 * (arreglo lineal) y contador indice.
	 */
	private int []n;
	private int indice;
	
	/*constructor que reserva en n diez espacios 
	 * e inicializa el indice en cero.
	 */
	public Arreglo(){
		n=new int [10];
		indice=0;
	}
	
	/*método tamaño que retorna la cantidad de
	 * números ingresados hasta ese momento.
	 */
	public int tamano(){
		return indice;
	}
	
	/*método obtener que recibe la posición y 
	 * retorna el número registrado en dicha posición.
	 */
	public int obtener(int posicion){
		return n[posicion];
	}

	/*método privado ampliarArreglo que 
	 * extiende el arreglo en diez espacios más.
	 */
	private void ampliarArreglo(){
		int auxiliar[]=n;//guardar en auxiliar
		n=new int[indice +10];//ampliar el arreglo
		for(int i=0;i<this.tamano();i++){//devolver los valores a n
			n[i]=auxiliar[i];
		}
	}	
	
	/*método privado adicionar que recibe un número 
	 * y lo registra en la posición que corresponde.
	 */
	private void adicionar(int numero){
		if(indice==n.length){
			ampliarArreglo();
		}
		n[indice]=numero;
		indice++;
	}
	
	/*método privado buscar que recibe un número 
	 * y retorna la posición. Si no lo encuentra retorna -1.
	 */
	private int buscar(int numero){
		for(int i=0;i<this.tamano();i++){
			if(n[i]==numero){
				return i;
			}
		}
		return -1;
	}
	
	/*- método privado intercambiar que recibe 
	 * dos posiciones e intercambia sus contenidos.
	 */
	private void intercambiar(int posicion1,int posicion2){
		int aux=n[posicion1];//sacarlo a una auxiliar
		n[posicion1]=n[posicion2];
		n[posicion2]=aux;
	}

	
	/*método buscarAdicionar que recibe un número, 
	 * lo busca y si no está registrado lo adiciona.
	 */
	public void buscarAdicionar(int numero){
		 int posicion=buscar(numero);
		 if(posicion==-1){
			 adicionar(numero);
		 }
	}
	
	/*Recibe un número, lo busca, 
	 * y si está registrado lo elimina
	 */
	public void buscarEliminar(int numero){
		int posicion=buscar(numero);
		if(posicion!=-1){
			eliminar(posicion);
		}
		
	}
	
	private void eliminar(int posicion){
		for(int i=posicion;i<indice-1;i++){
			n[i]=n[i+1];
		}
		indice--;
	}
	/*Recibe un número, lo busca, y si 
	 * está registrado lo intercambia con el último número del arreglo
	 */

	public void buscarIntercambiar(int numero){
		int posicion=buscar(numero);
		if(posicion!=-1){
			intercambiar(posicion,tamano()-1);
		}
	}

	
}
