package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
/*Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N
 * , uno en cada línea, repitiendo cada número tantas veces como su valor. 
 * 
 * */
	public static void main(String[] args) {
		
		//Bloque de variables
		int numUser=0;

		//Iniciamos el scanner
        Scanner lee =new Scanner(System.in);

        //Imprimimos la solicitud
        System.out.println("Introduce un numero :");
        numUser=lee.nextInt();

        /*En este for establecemos que el inicio es 1 y 
         * que mientras se cumpla la condicion de i menor al numero usuario se entre al bucle*/
        
        for (int i = 1; i <=numUser ; i++) {/*Se va incrementando en 1*/
        	/*Una vez cumplida la condicion de arriba se entra en el bloque,
        	 *  donde al estar otro for verificará la condicion y en caso de que esta sea true*/
            
        	for (int j=0; j<i; j++){
            	
                System.out.print(i); /*Entra y ejecuta este bloque de codigo que en este caso es imprimir i
                Esto lo hará mientras se cumpla la condicion de que j sea menor a i, cuando deje de cumplirse...*/
            }
            System.out.println();/*Ejcutará este blque de codigo que es parte del primer for, en este caso es un salto de linea*/
        }
        
        //cerramos el scanner
        lee.close();
	}

}
