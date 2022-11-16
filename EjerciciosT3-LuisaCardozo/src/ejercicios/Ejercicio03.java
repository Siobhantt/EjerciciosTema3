package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
/*Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por ejemplo para n=4 debe dibujar lo siguiente:
   *
  **
 ***
****
*/
	public static void main(String[] args) {
		//declaramos las variables
		
		int numUser;
		
		//iniciamos el scanner
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero que será la base del triangulo: ");
		numUser= lee.nextInt();
		
		for (int i=1; i<=numUser; i++) {
		
			for(int j=i; j<numUser; j++) {
				
				System.out.print(" ");
		}
			for(int k=i; k>0; k--) {
				System.out.print("* ");
			}
			System.out.println("");
	}
	
		//cerramos el scanner
		lee.close();
	
	}
}

