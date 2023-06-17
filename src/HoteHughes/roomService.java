package HoteHughes;
import java.util.Scanner;

public class roomService {
	public static void main(String[] args) {
		
		//4. Requerimiento: RoomService 
		
		System.out.println("Room service");
		System.out.println("Usted solicito el Room Service? 1.- Si escriba true 2.- No, escriba false"); //Se pregunta si hubo usos de servicios adicionales
		Scanner solicitudRS = new Scanner(System.in);
		
		boolean roomService = solicitudRS.nextBoolean();
		
		if(roomService) { //Si hay servicios se le hara el cargo de lo que ocupo a su cuenta
		System.out.println("Usted solicito Room Service, se le hara un cargo extra");
		}else { //Como no ocupo 
		System.out.println("Usted NO solicito Room Service");

		}
		
		solicitudRS.close(); //cierre del scanner
	}

}
