/*NO FUNCIONA*/
package ExamenAlonsoVine;

import java.util.Scanner;

public class Ejercicio02 {
	public int answer;

	public static void main(String[] args) {
		int numero = pedirNumero();
		boolean primo = calcularPrimo(numero);
		mostrarResultados(numero, primo);

	}// end main
/////////////////////////////////////
	private static int pedirNumero() {
		Scanner entry = new Scanner(System.in);
		System.out.println("Introduce un valor, a ver si es primo: ");
		return entry.nextInt();
	}
/////////////////////////////////////////////////////
	private static boolean calcularPrimo(int numero) {
		boolean primo = true;

		for (int div = 2; div < numero; div++) {
			if (numero % div == 0) {
				primo = false;
			}
		}
		return primo;
	}
////////////////////////////////////////////////////////////////////
	public static void mostrarResultados(int numero, boolean primo) {
		if (primo) {
			System.out.println("ES PRIMO");
		}
		if (!primo) {
			System.out.println("NO ES PRIMO");
		}

	}//end mostrarResultados

} //end main
