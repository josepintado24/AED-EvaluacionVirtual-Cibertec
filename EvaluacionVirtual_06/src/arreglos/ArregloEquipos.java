package arreglos;
import java.util.ArrayList;

import clases.Equipo;
public class ArregloEquipos {
	/*Implemente la clase ArregloEquipos con el atributo privado equi 
	 * (ArrayList de tipo Equipo) e implemente:*/
	private ArrayList<Equipo> equi;
	/*Un constructor que cree el ArrayList respectivo*/
	public ArregloEquipos(){
		 equi= new ArrayList<Equipo>();	 
	}
	
	/*Método tamaño que retorne la cantidad de objetos Equipo registrados hasta ese momento.*/
	public int tamano(){
		return equi.size(); 
	}
	/*Método obtener que reciba una posición y retorne la DirMem del objeto Equipo respectivo.*/
	public Equipo obtener(int posi){
		return equi.get(posi);
	}
	/*Método adicionar que reciba la dirección de memoria de un nuevo Equipo y lo adicione al ArrayList.*/
	public void adicionar(Equipo datosEquipo){
		equi.add(datosEquipo);
	}
	
	/*Método eliminarAlFinal que retire del ArrayList la última DirMem.*/
	public void eliminarAlFinal(){
		equi.remove(tamano()-1);
	}
	
	/*Método eliminarTodo que retire del ArrayList todas las DirMem.*/
	public void eliminarTodo(){
		equi.clear();
	}
	
	/*Método buscar que reciba un código y retorne la DirMem del objeto Equipo que lo contiene.
	 * En caso no exista retorne null.*/
	
	public Equipo buscar(int codigoBuscar){
		for(int i=0;i<tamano();i++){
			if (codigoBuscar==obtener(i).getCodigo()){
				return obtener(i);
			}
		}
		return null;
	}
	
	/*Método eliminar que reciba la DirMem de un objeto Equipo y lo retire del ArrayList.*/
	public void eliminar(Equipo eliminar){
		
		equi.remove(eliminar);
	}
	
	
	
	

}
