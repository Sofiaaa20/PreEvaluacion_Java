

public class SumaArreglos {

	public static void main(String arg[]) {
		
		int [] arreglo1 = {1,2,3,4};
		int [] arreglo2 = {4,2,3,1};
		
		int [] sumaArreglos = new int [arreglo1.length];
		
		for (int i = 0; i < arreglo1.length; i++) {
			sumaArreglos[i] = arreglo1[i] + arreglo2[i];
		}
		
		System.out.println("Suma de arreglos");
			for (int i = 0; i < sumaArreglos.length; i++) {
				System.out.println(sumaArreglos[i]);
			}
		
	}
}
