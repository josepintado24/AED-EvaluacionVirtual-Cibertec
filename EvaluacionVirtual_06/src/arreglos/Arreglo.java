package arreglos;

public class Arreglo {
	private int n[];
	private int indice;
	
	public Arreglo(){
		n=new int [10];
		indice =0;
	}
	
	public int tamano(){
		return indice;
	}
	public int obtener(int pos){
		return n[pos];
		
	}
	public void adicionar(int num){
		if (indice ==n.length){
			ampliarArreglo();
			
		}
		n[indice]=num;
		indice++;
	}
	
	private  void ampliarArreglo(){
		int auxi[]=n;
		n=new int [indice+5];
		for (int i=0;i<tamano();i++){
			n[i]=auxi[i];
		}
	}
	public void eliminarTodo() {
	    indice = 0;
	}
	public void eliminarAlFinal() {
	    indice --;
	}
	
}
