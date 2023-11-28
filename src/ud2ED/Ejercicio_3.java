package ud2ED;

//Ejercicio 3. Utilizar puntos de interrupción para detener la ejecución en varios puntos y
//examinar el valor de las variables en cada punto. Hacer una tabla.
public class Ejercicio_3 {

	public static void main(String[] args) {
		int n = 10;
		int a = 0, b = 1;
		System.out.print(a + ", " + b);
		for (int i = 2; i < n; i++) {
			int temp = a + b;
			System.out.print(", " + temp);
			a = b;
			b = temp;
		}	
	}

}
