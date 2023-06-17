package HoteHughes;

import java.util.Scanner;

public class huespedAdicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el numero total de huespuedes que le gustaria en su habitacion");
		//Preguntar la cantidad de huespuedes extra
		Scanner huespuedes = new Scanner(System.in);
		
		int huespuedesAdicionales = huespuedes.nextInt();
		
		int capacidadMaxima = 4;
		
		if(huespuedesAdicionales < capacidadMaxima) {
			System.out.println("Puede agregar un huésped adicional a la habitación. ");
			
		}else {
			System.out.println("La habitación ha alcanzado su capacidad máxima de huéspedes.");
		}
		
		huespuedes.close(); //cierre del scanner

	}

}
