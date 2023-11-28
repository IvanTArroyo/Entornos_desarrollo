package ud2ED;

/*Ejercicio 6. Seguimiento de una variable en un bucle. Utilicen el depurador para seguir el
valor de una variable a medida que el bucle se ejecuta. Hacer una tabla como se crea
conveniente.*/
public class Ejercicio_6 {

	public static void main(String[] args) {
		int n = 100;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i % 2 == 0) {
				sum *= 2;
			}
			System.out.println("Valor de 'i': " + i);
			System.out.println("Valor de 'sum': " + sum);
		}
		System.out.println("La suma de los números del 1 al " + n + " es: " + sum);
	}

}
