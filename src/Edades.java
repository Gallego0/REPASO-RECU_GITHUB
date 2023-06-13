
public class Edades {
	
	int [] edades = {12, 15, 67, 43};
	
	
	public Edades(int[] edades) {
		
		this.edades = edades;
	}

	public int contarMenores (int [] edades) {
		
		int contador=0;
		
		for (int num : edades) {
			if (num<18) {
				contador++;
			}
		}
		return contador;
		
	}
	
	public int contarMayores(int [] edades) {
		
		int contador=0;
		
		for (int num : edades) {
			if (num>=18 && num<=65) {
				contador++;
			}
		}
		return contador;
		
	}
	public int contarJubilados (int [] edades) {
	
	int contador=0;
	
	for (int num : edades) {
		if (num>65) {
			contador++;
		}
	}
	return contador;
	
	}
}
