package clases;

public class Arreglos {
	private int n[]={28,27,22,24,29,20,23};
	public Arreglos(){
		
	}
	public int tamano(){
		return n.length;
	}
	public int obtener(int post){
		return n[post];
	}
	public int sumaNum(){
		int  suma=0;
		for (int i=0; i<this.tamano();i++){
			suma=suma+this.obtener(i);
		}
		return suma;
	}
	public int posPrimerNumeromenorA25(){
		for (int i=0; i<this.tamano();i++){
			if (n[i]<25){
				return i;
			}
		}
		return -1;
	}
	public void generar(){
		for (int i=0; i<this.tamano();i++){
			n[i]=aleatorio(100,999);
		}
	}
	private int aleatorio (int min, int max){
		return (int)((max-min+1)*Math.random())+min;
	}
	
	
}
