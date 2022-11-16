package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
/*Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.
*/
	public static void main(String[] args) {
	//declaramos las variables
		int numUser;
		boolean esPrimo = true;
		int contador =0;
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca el numero que quiere verificar: ");
		numUser= lee.nextInt();
		
		
		for(int num=2; num<numUser; num++) {
			//Tengo que comprobar si num es primo
			
			/*Para comprobar que un numero no es primo empeizo a contar desde 2 hasta el numero 
			 * y voy comprobando si cada uno de esos numeros es divisor del numero
			 * entonces seria num%2==0, num%3==0*/
			
			for(int divisor=2; divisor<num; divisor++) {
				if (num% divisor == 0) {
					
					esPrimo = false;
					break;
				}
			}
				if (esPrimo) {
					contador++;
	}
			}
		
		System.out.println("En " + numUser + " hay " + contador);
		
		//cerramos el scanner
		lee.close();
		
	}

}
