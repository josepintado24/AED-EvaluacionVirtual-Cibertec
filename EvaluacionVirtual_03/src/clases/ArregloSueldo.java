package clases;

public class ArregloSueldo {
	private double sueldo[]={2400.5, 1500.2, 800.4, 1000.3, 4700.1, 600.0, 3300.8, 2600.6, 5100.9, 2000.7};
	
	public ArregloSueldo(){
	}
	
	public int tamano(){
		return sueldo.length;
	}
	
	public double obtener(int pos){
		return sueldo[pos];
	}
	
	public double sueldoPromedio(){
		double sumaSueldo=0;
		for (int a=0;a<tamano();a++){
			sumaSueldo=sumaSueldo+obtener(a);
			}
		return sumaSueldo/tamano();
	}
	
	public double sueldoMayor(){
		double mayor=sueldo[0];
		for(int a=0;a<tamano();a++){
			if (mayor<obtener(a)){
				mayor=obtener(a);
			}
		}
			return mayor;
		}
		
	public double sueldoMenor(){
		double menor=sueldo[0];
		for(int a=0;a<tamano();a++){
			if (menor>obtener(a)){
				menor=obtener(a);
			}
		}
			return menor;
		}
	public int cantMayoresSueldoPromedio(){
		int cont=0;
			for(int a=0;a<tamano();a++){
				if (sueldoPromedio()<=obtener(a)){
					cont++;
				}
			}
		return cont;
	}
	
	public int cantMenoresSueldoPromedio(){
		int cont=0;
		for(int a=0;a<tamano();a++){
			if (sueldoPromedio()>=obtener(a)){
				cont++;
			}
		}
		return cont;
	}
	public int buscarPrimerSueldoMayorAlMinimo(){
		for(int a=0;a<tamano();a++){
			if (sueldo[a]>850.0){
				return a;
			}
		}
		return -1;
	}
	public int buscarUltimoSueldoMenorAlMinimo(){
		for(int a=tamano()-1;a>=0;a--){
			if (sueldo[a]<850.0){
				return a;
			}
		} 
		return -1;
	}
}