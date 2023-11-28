package ud2ED;

/*Ejercicio 8. Identificar y corregir el error en la función (en el caso de haberla). Hacer una
tabla.*/
public class Ejercicio_8 {

	public static void main(String[] args) {
		boolean result = isPrime(1);
		System.out.println("¿Es primo? " + result);
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false; 
			}
		}
		return true;
	}

}
