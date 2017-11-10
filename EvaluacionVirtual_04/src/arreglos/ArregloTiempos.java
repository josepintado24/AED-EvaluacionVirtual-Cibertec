package arreglos;

public class ArregloTiempos {
		/*Diseñe la clase ArregloTiempos en el paquete virtual_04 con el atributo privado
		* tiempo (int) de tipo arreglo lineal y el atributo privado �-ndice (int).*/
		private int tiempo [];
		private int indice;
		/*Un Constructor sin parámetros que reserve 10 espacios en tiempo e inicialice con 0 al �-ndice*/
		public ArregloTiempos(){
			tiempo=new int [10];
			indice=0;
		}
		/*Un método tamaño que retorne la cantidad de tiempos en segundos ingresados hasta ese momento.*/
		public int tamano(){
			return indice;
		}
		/*Un método obtener que reciba una posición y retorne el tiempo registrado en dicha posición.*/
		public int obtener(int pos){
			return tiempo[pos];
		}
		/*Un método privado ampliarArreglo que extienda el arreglo en diez espacios más.*/
		private void ampliarArreglo(){
			int aux[]= tiempo;
			tiempo=new int [tamano()+10];
			for (int i=0;i<tamano();i++){
				tiempo[i]=aux[i];
		}
		}
		/*Un método adicionar que reciba un tiempo y lo registre en la posición que corresponda.
		Verifique primero si el arreglo está lleno para invocar al método ampliarArreglo.*/
		public void adicionar (int tiempoS){
			if (tamano()==tiempo.length){
				ampliarArreglo();
		}
			tiempo[indice]=tiempoS;
			indice=indice+1;
		}
		/*Un método incrementarTiempos que aumente todos los tiempos en 15 segundos.*/
		public void incrementarTiempos(){
			for (int i=0;i<tamano();i++){
				tiempo[i]=tiempo[i]+15;
			}
		}
	}