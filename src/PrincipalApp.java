import java.util.*;
public class PrincipalApp {
	
	static Scanner sc = new Scanner (System.in);
	public static void main (String [] args) {
		
		int [] edades = {12, 15, 67, 43};
		
		Edades contarEdades = new Edades(edades);
		
		int contarMenores = contarEdades.contarMenores(edades);
		int contarAdultos = contarEdades.contarMayores(edades);
		int contarJubilados = contarEdades.contarJubilados(edades);
		
		System.out.println("Los menores son:" + contarMenores);
		System.out.println("Los mayores son:" + contarAdultos);
		System.out.println("Los jubilados son:" + contarJubilados);

	}
}
