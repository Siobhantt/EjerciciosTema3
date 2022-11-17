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
		
		/*Solicitamos la base del triangulo*/
		System.out.println("Por favor introduzca un numero que será la base del triangulo: ");
		numUser= lee.nextInt();
		
		/*En este for el inicio se establece en 1
		 * mientras i sea menor o igual al numero introducido se entrará en el bucle
		 * este for se encargará de los saltos de linea*/
		for (int i=1; i<=numUser; i++) {
		
			/*En este for se van a imprimir los espacios, entonces mientras j sea menor al numero introducido se van a imprimir tantos espacios correspondan hasta un numero menos al numero introducido */
			for(int j=i; j<numUser; j++) {
				
				System.out.print(" ");
		}
			for(int k=i; k>0; k--) {/*En este caso se irá diminuyendo la k y en cada vuelta que disminuya imprimirá un asterisco*/
				System.out.print("* ");
			}
			System.out.println("");
	}
	
		//cerramos el scanner
		lee.close();
	
	}
}

