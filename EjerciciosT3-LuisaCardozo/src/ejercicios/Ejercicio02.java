package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
/*Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.
*/
	public static void main(String[] args) {
	//declaramos las variables
		int numUser;
		boolean esPrimo = true;
		int contadorP =0;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca el numero que quiere verificar: ");
		numUser= lee.nextInt();
		
		
		for(int i=2; i<numUser; i++) {
			//Tengo que comprobar si num es primo
			
			/*Para comprobar que un numero no es primo empiezo a contar desde 2 hasta el numero 
			 * y voy comprobando si cada uno de esos numeros es divisor del numero
			 * entonces seria num%2==0, num%3==0*/
			
			/*En este caso el inicio que es divisor será 2
			 * mientras el divisor sea menor que numero entrará en el bucle y al final de bucle se incrementa i en 1
			 * */
			for(int j=2; j<i; j++) {
				/*Si, el resto de dividir numero entre i es igual a 0 entonces  No es primo*/
				if (i% j == 0) {
					
					esPrimo = false;
					break;
				}
			}
				if (esPrimo) {/*Si es primo al contador de primos se le añadirá 1*/
					contadorP++;
	}
			}
		
		/*Imprimimos la cantidad de numeros primos que hay en el numero introducido*/
		System.out.println("En " + numUser + " hay " + contadorP);
		
		//cerramos el scanner
		lee.close();
		
	}

}
