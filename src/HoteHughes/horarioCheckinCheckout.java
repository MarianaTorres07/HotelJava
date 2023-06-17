package HoteHughes;

import java.util.Scanner;

public class horarioCheckinCheckout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3. Requerimiento: CheckIn - CheckOut
		
		System.out.println("Ingrese el horario de check-in(HH:mm): ");
		Scanner check = new Scanner(System.in);
		
		String checkIn = check.nextLine();
		
		System.out.println("Ingrese el horario de check-out(HH:mm): ");
		String checkOut = check.nextLine();
		
		//Para mostrar el horario ingresado
		System.out.println("Horario de Check-In: " + checkIn);
		System.out.println("Horario de Check-Out: " + checkOut);
		
		check.close(); //cierre del scanner

	}

}
