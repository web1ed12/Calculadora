import java.util.Scanner;
public class calculadora {
	
	public static void main(String[] args) {
		double num1, num2, resultado;
		int eleccion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce primer numero");
		num1 = teclado.nextDouble();
		System.out.println("Introduce segundo numero");
		num2 = teclado.nextDouble();
		System.out.println("1(suma), 2(resta), 3(multiplicacion), 4(division)");
		eleccion = teclado.nextInt();
		switch (eleccion) {
		case 1: 
			System.out.println("Producto: " + (num1 + num2));
			break;
		case 3:
			System.out.println("Producto: " + num1 * num2);
			break;
		case 4:
			System.out.println("Division: " + num1 / num2);
			break;

		default:
			break;
		}

	}

}
