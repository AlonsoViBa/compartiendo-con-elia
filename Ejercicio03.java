/*FUNCIONA PERFECTAMENTE*/
package ExamenAlonsoVine;

import java.util.Scanner;

public class Ejercicio03
{
	public static void main(String[] args)
	{
		Scanner entry = new Scanner(System.in);
		System.out.println("Introduce la altura del triangulo: ");
		int altura = entry.nextInt();
		
		for(int fila = 1; fila <= altura; fila++)
		{
			for(int columna = 1; columna <= fila;columna++)
			{
				System.out.print("0");
			}
			System.out.println();
		}
		for (int fila = 1; fila < altura; fila++)
		{
			for(int columna = fila; columna < altura; columna++)
			{
				System.out.print("p");
			}
			System.out.println();
		}

	}//end main

}
