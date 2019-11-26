/*Este trabajo es el que tenemos que modificar en grupo
 * @Alonso vi�e modificacion 14 - nov - 19*/
package Examen;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numSecreto = (int)(Math.random()*100+1);
		System.out.println(numSecreto);
		boolean seguir = true;
		do {
			System.out.println("Introduzca un valor entre 1 y 100 o -1 para salir: ");
			int num = entrada.nextInt();
			while(num != -1 && (num < 1 || num > 100)) {
				System.out.println("Introduzca un valor entre 1 y 100 o -1 para salir: ");
				num = entrada.nextInt();
			}
			if (num == -1) {
				seguir = false;
				System.out.println("Se ha rendido");
			}
			else {
				if(num == numSecreto) {
					System.out.println("Ha adivinado el numero");
					seguir = false;
				}
				else if(num < numSecreto) {
					System.out.println("Menor");
				}
				else {
					System.out.println("Mayor");
				}
			}
		}while(seguir);
	}
}


/*cambio Elia*/