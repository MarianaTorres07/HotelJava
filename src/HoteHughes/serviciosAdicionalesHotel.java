package HoteHughes;

import java.util.Scanner;

public class serviciosAdicionalesHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Requerimiento: Servicios Adicionales: 
		System.out.println("Servicios Adicionales");
		System.out.println("Usted solicito Servicios Adicionales? 1.- Sí, escriba true, 2.-No, escriba false");
		//Pedir al usuario elegir una opcion 
		Scanner solicitudServiciosAdicionales = new Scanner(System.in);
		
		boolean ServiciosAdicionales = solicitudServiciosAdicionales.nextBoolean();
		
		if(ServiciosAdicionales) { //Si hay servicios se le hara el cargo de lo que ocupo a su cuenta
			System.out.println("Usted solicito Servicios Adicionales, , se le hara un cargo extra");
		} else { //Se imprime si el usuario no ocupa Servicios Adicionales
			System.out.println("Usted NO solicito Servicios Adicionales");
		}
		
		solicitudServiciosAdicionales.close(); //cierre del scanner
				
		
	}

}
