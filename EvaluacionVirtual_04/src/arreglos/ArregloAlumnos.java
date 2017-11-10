package arreglos;

import java.util.ArrayList;

import clases.Alumno;

public class ArregloAlumnos {

	  private ArrayList<Alumno> alu;
	  
	  public ArregloAlumnos(){
	     alu= new ArrayList<Alumno>();
	     alu.add(new Alumno(1214,"Jose",20,20));
	     alu.add(new Alumno(787,"Luis",20,20));   
	    }
	    
	   public int tamano(){
	       return alu.size();
	    }
	    
	   public Alumno obtener(int i){
	    return alu.get(i);
	    } 
	    
	   public double promedioGeneral(){
	       double suma=0;
	       for (int i=0;i<2;i++){
	           suma=suma+obtener(i).promedioNotas();
	        }
	       
	       return suma/tamano();
	    }

}
