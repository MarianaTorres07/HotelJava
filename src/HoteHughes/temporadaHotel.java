package HoteHughes;

import java.util.Scanner;

public class temporadaHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Requerimiento: Temporada (dinámica)
				System.out.println("Temporada");
				System.out.println("Escriba el numero del mes que les gustaría visitarnos para ver si son temporada alta o baja.");
				Scanner solicitudTemporada = new Scanner(System.in);
				int mes = solicitudTemporada.nextInt();
				
				if(mes >=1 && mes <=3) {
					System.out.println("Es temportada baja. Descuentos especiales disponibles."); // Aquí irían las acciones adicionales para la temporada baja.
				}else if (mes >= 4 && mes <=9) {
					System.out.println("Es temporada alta. Tarifas regulares aplican.");
				}else if(mes >= 10 && mes <=12) {
					System.out.println("Es temporada baja. Descuentos especiales disponibles.");
					
				}else {
					System.out.println("El mes proporcionado no es válido");
				}
				
				
				solicitudTemporada.close(); //cierre del scanner

	}

}
