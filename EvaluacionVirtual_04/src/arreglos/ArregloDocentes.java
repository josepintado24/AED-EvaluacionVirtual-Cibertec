package arreglos;
import java.util.ArrayList;

import clases.Docente;
public class ArregloDocentes {
	private ArrayList<Docente> doc;

	
	/*Un constructor que cree el ArrayList y adicione las DirMem de ocho objetos Docente.*/
	public ArregloDocentes() {
		 doc=new  ArrayList<Docente>();
		 doc.add( new Docente(123,1,"Jose",20));
		 doc.add( new Docente(123,1,"Jose",20));
		 doc.add( new Docente(123,1,"Jose",20));
		 doc.add( new Docente(123,1,"Jose",20));
		 doc.add( new Docente(123,1,"Jose",20));
		 doc.add( new Docente(123,1,"Jose",20));
		 doc.add( new Docente(123,1,"Jose",20));	 
	}
	
/*- Método tamaño que retorne la cantidad de objetos Docente registrados hasta ese momento.*/
	
	public int tamano(){
		return doc.size();
	}
/*- Método obtener que reciba una posición y retorne la DirMem del objeto Docente respectivo.*/
	public Docente obtener(int dato){
		return doc.get(dato);
	}
	
	/*Retorne el sueldo promedio.*/
	public double sueldoPromedio(){
		double  sumaSueldo=0;
		for (int i=0;i<tamano();i++){
			sumaSueldo=sumaSueldo+obtener(i).sueldo();
		}
		return sumaSueldo/tamano();
	}
/*- Retorne el sueldo mayor.*/
	public double sueldoMayor(){
		double mayor=obtener(1).sueldo();
		for (int i=0;i<tamano();i++){
			if(mayor<obtener(i).sueldo()){
				mayor=obtener(i).sueldo();
			}
		}
		return mayor;
		
	}
	
/*- Retorne el sueldo menor.*/
	public double sueldoMenor(){
		double menor=obtener(1).sueldo();
		for (int i=0;i<tamano();i++){
			if(menor>obtener(i).sueldo()){
				menor=obtener(i).sueldo();
			}
		}
		return menor;
		
	}
	
/*- Retorne la tarifa mayor.*/
	public double tarifaMayor(){
		double mayor=obtener(1).getTarifa();
		for (int i=0;i<tamano();i++){
			if(mayor<obtener(i).getTarifa()){
				mayor=obtener(i).getTarifa();
			}
		}
		return mayor;
		
	}
	
/*- Retorne la tarifa menor.*/
	public double tarifaMenor(){
		double menor=obtener(1).getTarifa();
		for (int i=0;i<tamano();i++){
			if(menor>obtener(i).getTarifa()){
				menor=obtener(i).getTarifa();
			}
		}
		return menor;
		
	}
	
}
