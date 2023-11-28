package ud2ED;

//Ejercicio 1. Identificar el error lógico (en caso de que haya) y 
//corregirlo para que el bucle funcione correctamente.
// Hacer una tabla.

public class Ejercicio1 {
	
	public static void main(String[] args) {
		//n ->5,
		//i ->1,2,3,4,5
		//sum ->0,1,3,6,10,15
		//pantalla ->La suma de los números del 1 al 5 es: 15
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}
}