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
	
	/*M�todo tama�o que retorne la cantidad de objetos Equipo registrados hasta ese momento.*/
	public int tamano(){
		return equi.size(); 
	}
	/*M�todo obtener que reciba una posici�n y retorne la DirMem del objeto Equipo respectivo.*/
	public Equipo obtener(int posi){
		return equi.get(posi);
	}
	/*M�todo adicionar que reciba la direcci�n de memoria de un nuevo Equipo y lo adicione al ArrayList.*/
	public void adicionar(Equipo datosEquipo){
		equi.add(datosEquipo);
	}
	
	/*M�todo eliminarAlFinal que retire del ArrayList la �ltima DirMem.*/
	public void eliminarAlFinal(){
		equi.remove(tamano()-1);
	}
	
	/*M�todo eliminarTodo que retire del ArrayList todas las DirMem.*/
	public void eliminarTodo(){
		equi.clear();
	}
	
	/*M�todo buscar que reciba un c�digo y retorne la DirMem del objeto Equipo que lo contiene.
	 * En caso no exista retorne null.*/
	
	public Equipo buscar(int codigoBuscar){
		for(int i=0;i<tamano();i++){
			if (codigoBuscar==obtener(i).getCodigo()){
				return obtener(i);
			}
		}
		return null;
	}
	
	/*M�todo eliminar que reciba la DirMem de un objeto Equipo y lo retire del ArrayList.*/
	public void eliminar(Equipo eliminar){
		
		equi.remove(eliminar);
	}
	
	
	
	

}
