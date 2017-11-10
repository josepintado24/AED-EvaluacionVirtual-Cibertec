package clases;

public class Numeros {
	public int numero1,numero2, numero3;
	
	public int numeroMayor(){
		int mayor=0;
		if ((numero1>numero2) && (numero1>numero3) ){
			mayor =numero1;
		}
		if ((numero2>numero1) && (numero2>numero3) ){
			mayor =numero2;
		}
		if ((numero3>numero1) && (numero3>numero2) ){
			mayor =numero3;
		}
		return mayor;
	}
	public int numeroMenor(){
		int menor=0;
		if ((numero1<numero2) && (numero1<numero3) ){
			menor =numero1;
		}
		if ((numero2<numero1) && (numero2<numero3) ){
			menor =numero2;
		}
		if ((numero3<numero1) && (numero3<numero2) ){
			menor =numero3;
		}
		return menor;
	}
	public int numeroMedio(){
		int numMedio=0;
		if ((numero1<numeroMayor()) && (numero1>numeroMenor())){
			numMedio=numero1;
		}
		if ((numero2<numeroMayor()) && (numero2>numeroMenor())){
			numMedio=numero2;
		}
		if ((numero3<numeroMayor()) && (numero3>numeroMenor())){
			numMedio=numero3;
		}
		return numMedio;
	}
}
