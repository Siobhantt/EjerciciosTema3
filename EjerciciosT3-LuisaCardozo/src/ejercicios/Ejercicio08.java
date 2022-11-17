package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
/*Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.
*/
	public static void main(String[] args) {
		  int limite;
	        int numUser;
	        int contadorF=0;
	        int contadorVuelta=0;
	        Scanner lee = new Scanner(System.in);

	        System.out.println("Introduce un numero: ");
	        /*Solicitamos un numero al ussuario y guardamos el numero introducido en la variable limite	*/
	        numUser= lee.nextInt();
	        limite=numUser;

	        /*Mientras el numero introducido sea distinto a 0 entonces entramos en el bucle*/
	        while (numUser!=0){

	        	//Cada vez que entremos le añadimos al contador una vuelta
	            contadorVuelta++;
	           
	            /*Y hacemos una condicion donde si el numero introducido es menor a limite entonces
	             * Lo contamos como fallo y le hacemos saber al usuario que ha errado*/
	            if(numUser<limite){
	                System.out.println("Has fallado!");
	                contadorF++;
	            }
	            /*Volvemos a establecer que el limite es el numero que introdujo el usuario*/
	            limite=numUser;
	            //Imprimimos de nuevo la solicitud
	            System.out.println("Introduce un numero: ");
	            numUser= lee.nextInt();
	        }
	        /*Al final imprimimos las veces que ha jugado el usuario y las veces que ha fallado*/
	        System.out.println("Las veces jugadas han sido " + contadorVuelta);
	        System.out.println("Las veces que ha fallado han sido " + contadorF);
	
	//cerramos el scanner
	        lee.close();
	}

}
