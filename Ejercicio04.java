/*FUNCIONA PERFECTAMENTE*/
package ExamenAlonsoVine;

import java.util.Scanner;

public class Ejercicio04
{
	static Scanner entry = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Introcuzca el primer valor A:");
		double a = entry.nextDouble();
		System.out.println("Introcuzca el segundo valor B:");
		double b = entry.nextDouble();
		System.out.println("Introcuzca el tercer valor C:");
		double c = entry.nextDouble();
		System.out.println("Los valores son: " + a + "\t" + b + "\t" + c);
		ecuacion(a,b,c);

	}//end main
	public static void ecuacion(double a, double b, double c)
	{
		double answer = 0;
		if (a == 0 && b == 0)
		{
			System.out.println("Si a y b son 0, no es una ecuacion.");
		}
		else if(a == 0 && b != 0)
		{
			
			System.out.println("Es una ecuacion de grado 1");
			answer = -c / b;
			System.out.println(answer);
		}
		else
		{
			double dis = b * b - 4 * a * c;
			if(dis >= 0)
			{
				double re = (2*a) - (b-2*b);
				double im = Math.sqrt(Math.abs(dis))/(2 * a);
				double raiz1 = re + im;
				System.out.println("La raiz uno es " + raiz1);
				double raiz2 = re - im;
				System.out.println("La raiz dos es " + raiz2);
			}
			else
			{
				System.out.println("Su discriminante es menor que 0");
				System.out.println("No poseee solucion");
			}
		}//end else
		
	}//end ecuaciones

}//end class
