package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
/*Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
Hora
Minutos
Segundos
Cantidad de segundos a incrementar
La aplicación debe mostrar la nueva hora.
 Por ejemplo, si el usuario introduce hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos,
  el resultado a mostrar es 14:00:01.
*/
	public static void main(String[] args) {
		//Declaramos las variables
		
		int horas, minutos, segundos, incremento;
		
		//iniciamos el scanner
		Scanner lee = new Scanner(System.in);
		
		//Imprimimos la solicitud
		System.out.println("Por favor introduzca las horas: ");
		horas = lee.nextInt();
		
		System.out.println("Por favor introduzca los minutos: ");
		minutos = lee.nextInt();
		
		System.out.println("Por favor introduzca las segundos: ");
		segundos = lee.nextInt();
		
		System.out.println("Introduzca los segundos que desea incrementar: ");
		incremento = lee.nextInt();
			
		/*I es igual a incremento , mientras i sea mayor a 0 iremos  hacia atrás*/
		
		for (int i=incremento; i>0; i--) {
			
			//Lo que se va disminuyendo se lo sumamos a segundos
			segundos++;
			
			/*Si segundos es mayor a 59 entonces se le incrementa 1 a minutos y se iguala segundos a 0*/
			if(segundos>59) {
			minutos++; 
			segundos=0;
			}
			/*Si minutos es mayor a 59 entoces se incrementa 1 a horas, y se iguala minutos a 0*/
			
			if(minutos>59) {
				horas++;
				minutos=0;
			}
			
			/*Si horas es mayor a 23 entonces se iguala a 0*/
			if(horas>23) {
				horas=0;
			}
			
		}
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
	
		//cerramos el scanner
		lee.close();
	}
		
		
	}



