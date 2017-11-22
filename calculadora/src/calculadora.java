import java.util.Scanner;
public class calculadora {
	
	public static void main(String[] args) {
		double num1, num2, resultado;
		int eleccion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce primer numero");//aqui introducimos el primer numero
		num1 = teclado.nextDouble();
		System.out.println("Introduce segundo numero");//aqui intruducimos el segundo numero
		num2 = teclado.nextDouble();
		System.out.println("1(suma), 2(resta), 3(multiplicacion), 4(division)");//este es el menu para elegir lo que queremos realizar
		eleccion = teclado.nextInt();
		switch (eleccion) {
		case 1: 
			System.out.println("Suma: " + (num1 + num2));//muestra la suma
			break;
		case 2: 
			System.out.println("Resta: " + (num1 - num2));//muestra la resta
			break;
		case 3:
			System.out.println("Producto: " + num1 * num2);//muestra la multiplicacion
			break;
		case 4:
			System.out.println("Division: " + num1 / num2);//muestra la division
			break;

		default:
			break;
		}

	}

}
