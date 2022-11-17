package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
/*Para dos números dados, a y b, es posible calcular el máximo común divisor (el número más grande que divide a ambos) 
 * mediante un algoritmo ineficiente per sencillo: desde el menor de a y b, ir buscando, de forma decreciente, el primer número que divide a ambos simultáneamente.
 *  Teniendo en cuenta lo que se acaba de explicar, 
 *  realiza un programa que calcule el máximo común divisor de dos números.*/
	public static void main(String[] args) {
		
		//declaramos variables
		int a, b , menor;
		
		Scanner lee = new Scanner(System.in);
		
		/*Imprimimos la solicitudes;
		En a y b guardaremos los numeros que introducirá el usuario*/
		System.out.println("Introduzca el primer numero: ");
		a=lee.nextInt();
		
		System.out.println("Introduzca el segundo numero: ");
		b=lee.nextInt();
		
		/*Para que siempr empiece desde el menor establecemos que si a es mayor a b entonces b es el menor*/
		if (a>b) {
			menor=b;
		}
		//Aqui está establecido el caso contrario, a es menor
		else {
			menor=a;
		}
		
		/*Iniciamos un for donde i es igual al menor(El inicio)
		 * mientras i sea mayor a 0 entrará en el bucle
		 * y se irá disminuyendo hasta 1*/
		for(int i = menor; i>0; i--) {
			
				/*Si el resultado de a dividido entre i es igual a 0 
				 * o si el resultado de b dividido entre i es igual a 0 entonces
				 * el maximo comun divisor es i*/
			
				if (a%i ==0 && b%i == 0 ) {
					System.out.println("El M.C.D de  " + a + " y " + b + " es " + i);
				
					break;
				}
			
			}
			
		//Cerramos el Scanner
		lee.close();
		}
	}


