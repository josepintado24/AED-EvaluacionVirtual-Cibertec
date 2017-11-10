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
	public int obtner(int posicion){
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
	
	/* método primeroAlFinal que 
	 * traslada el primer número al final.
	 */
	public void primeroAlFinal(){
		for(int i=0;i<tamano()-1;i++){
			intercambiar(i,i+1);
		}
	}
	
	/*método buscarRezagar que busca
	 *  un número y si está registrado lo traslada al final.
	 */
	public void buscarRezagar(int numero){
		int posicion=buscar(numero);
		if(posicion !=-1){
			for(int i=posicion;i<this.tamano()-1;i++){
				intercambiar(i,i+1);
			}
		}
	}
	
	/*método ultimoAlInicio que traslada el
	 * último número al inicio.
	 */
	public void ultimoAlInicio(){
		for(int i=tamano()-1;i>0;i--){
			intercambiar(i,i-1);
		}
	}
	
	/*método buscarPriorizar que busca un
	 * número y si está registrado lo traslada al inicio.
	 */
	public void buscarPriorizar(int numero){
		int posicion=buscar(numero);
		if(posicion!=-1){//valido si esta registrado
			for(int i=posicion;i>0;i--){//recorro desde la posicion al inicio
				intercambiar(i,i-1);//intercambio
			}
		}
	}
	
	/*método invertirArreglo que
	 * invierte el contenido del arreglo
	 */
	
	public void invertirArreglo(){
		int i=0,j=tamano()-1;
		while(i<j){
			intercambiar(i,j);
			i++;
			j--;
		}
	}
	
	public void ordenarArreglo() {
	    for (int i=0; i<indice-1; i++)
	        for (int j=i+1; j<indice; j++)
	            if (n[i] > n[j])
	                intercambiar(i, j);
	}

}

