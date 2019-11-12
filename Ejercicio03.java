/*FUNCIONA PERFECTAMENTE*/
package ExamenAlonsoVine;

public class Ejercicio03
{
	public static void main(String[] args)
	{
		int altura = 3;
		
		for(int fila = 1; fila <= altura; fila++)
		{
			for(int columna = 1; columna <= fila;columna++)
			{
				System.out.print("P");
			}
			System.out.println();
		}
		
		
		
		for (int fila = 1; fila < altura; fila++)
		{
			for(int columna = fila; columna < altura; columna++)
			{
				System.out.print("P");
			}
			System.out.println();
		}

	}//end main

}
