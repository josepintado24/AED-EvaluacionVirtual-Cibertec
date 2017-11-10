package arreglos;

public class ArregloNotas {
	private int nota[];
	private int indice;
	/*Un Constructor sin parámetros que reserve 10 espacios en nota e inicialice con 0 al indice.*/
	public ArregloNotas(){
		nota =new int [10];
		indice=0;
	}	
	/*Un método tamaño que retorne la cantidad de datos ingresados hasta ese momento.*/
	public int tamano(){
		return indice;
	}
	/*Un método obtener que reciba una posición y retorne la nota registrada en dicha posición.*/
	public int obtener(int pos){
		return nota[pos];
	}
	/*Un método privado ampliarArreglo que extienda el arreglo en diez espacios más.*/
	private  void ampliarArreglo(){
		int auxi[]=nota;
		nota=new int [indice+10];
		for (int i=0;i<tamano();i++){
			nota[i]=auxi[i];
		}
	}
	/*Un método adicionar que reciba una edad y la registre en la posición que corresponda.
	 *  Verifique primero si el arreglo está lleno para invocar al método ampliarArreglo..*/
	public void adicionar(int edad){
		if (tamano()==nota.length){
			ampliarArreglo();
		}
		nota[indice]=edad;
		indice++;
	}
	
	/*Un método eliminarAlFinal que elimina lógicamente la última edad del arreglo.*/
	public void eliminarAlFinal(){
		indice--;
	}
	
	/*Un método eliminarTodo que elimina lógicamente todas las edades.*/
	public void eliminarTodo(){
		indice=0;
	}
	
	/*Un método buscarUltimaNotaDesaprobatoria que retorne la posición de la última nota menor que 13.
	 *  En caso no exista retorne -1.*/
	public int  buscarUltimaNotaDesaprobatoria(){
		for (int i=tamano()-1;i>=0;i--){
			if (nota[i]<13){
				return i;				
			}
		}
		return -1;
	}
	/*Un método decrementarUltimaNotaDesaprobatoria que disminuya la última nota menor que 13 en dos puntos.
	 *En caso que al disminuir resulte una nota negativa, fije la nota en cero.*/
	public int decrementarUltimaNotaDesaprobatoria(){
		if (nota[buscarUltimaNotaDesaprobatoria()]<2){
			return 0;
		}
		return nota[buscarUltimaNotaDesaprobatoria()]-2;
	}
	
	/*Un método remplazarUltimaNotaDesaprobatoria que cambie la última nota desaprobatoria por la última nota del arreglo.*/
	public int remplazarUltimaNotaDesaprobatoria(){
		return nota[buscarUltimaNotaDesaprobatoria()]=nota[tamano()-1];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
