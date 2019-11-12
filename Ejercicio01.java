/*FUNCIONA PERFECTAMENTE
 * 
 * El objetivo es realizar un programa que genere un numero aleatorio entre 1-100.
 * Que pregunte al usuario a ver si lo hacierta 
 * En caso contrario deberá aportar agun tipo de pista, si el numero es menor o mayor
 * teclear -1 para salir*/

package ExamenAlonsoVine;

import java.util.Scanner;

public class Ejercicio01
{

	public static void main(String[] args)
	{
		Scanner entry = new Scanner(System.in);
		boolean exit = false;
		int num;
		int numMax = 100;
		int numSecreto = (int)(Math.random() * 100 + 1);
		//System.out.println(numSecreto);	tienes esto aqui para poder comprobar rapidamente si funciona
		do {
			do {
				System.out.println("Acierte un valor del uno al cien.");
				num = entry.nextInt();
				if (num < -1 || num > numMax) {
					System.out.println("Error numero incorrecto");
				}
			}while(num < -1 || num > numMax);
			
			if (num == numSecreto)
			{
				System.out.println("Enhorabuena, has acertado.");
				exit = true;
			}
			else if (num == -1) {
				System.out.println("Ha saleccionado abandonar.");
				exit = true;
			}
			else if(num > numSecreto) {
				System.out.println("Un numero mas bajo.");
			}
			else if(num < numSecreto) {
				System.out.println("Un numero mas alto.");
			}
			
		}while(!exit);
		System.out.println("Adios");
		System.out.println("El numero es: " + numSecreto);
	}//end main

}

