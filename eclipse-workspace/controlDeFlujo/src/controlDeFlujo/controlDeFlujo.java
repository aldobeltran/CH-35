package controlDeFlujo;
import java.util.Scanner;

public class controlDeFlujo {

	public static void main(String[] args) {
		
		//Recuerda que para que algo se ejecute, siiempre debe de ir en el metodo principal
		
		
				//Primero defino una variable del tipo String donde se almacena un dato
				 // Dejo en null y despues agrego fecha 
				// Variable declarada e inicializada, en null a proposito, para tener un "espacio" de memoria ya asignado, y solo reemplazarlo con un nuevo dato
				
				//If else :Para validar si podemos viajar en cierta fecha
				
		String viaje = null;
				
		if (viaje != null) { //variable vacia
					System.out.println("Ya no tenemos fechas disponibles, una disculpa.");
					
				} else {
					System.out.println("Puede reservar su viaje");
				}
		
/////////Validacion de contraseña
				Scanner scanner = new Scanner(System.in);//System In mete informacion de fuera a la funcion

		        // Solicitar la primera contraseña
		        System.out.print("Ingrese la contraseña: ");
		        String contraseña1 = scanner.nextLine();

		        // Solicitar la segunda contraseña
		        System.out.print("Ingrese la contraseña nuevamente: ");
		        String contraseña2 = scanner.nextLine();

		        // Verificar si las contraseñas coinciden
		        if (contraseña1.equals(contraseña2)) {
		            System.out.println("Las contraseñas coinciden. Acceso permitido.");
		        } else {
		            System.out.println("Las contraseñas no coinciden. Acceso denegado.");
		        }

		        // Cerrar el scanner
		        	
////////////Switch: para seleccionar comida de dulceria en el cine

		  //declara variable
		        Scanner scannerUno = new Scanner(System.in);
		      //crear un menu
				System.out.println("Bienvenido a la dulcería, que desea ordenar?");
				System.out.println("1. Palomitas");
				System.out.println("2. Refresco");
				System.out.println("3. Nachos");
				System.out.println("4. HotDogs");
				System.out.println("5. Pagar");
				//System.out.println("No contamos con eso en nuestro menu, por favor seleccione un opción valida (1-5).");
				
				int menu = scannerUno.nextInt();
				switch(menu) {
				case 1:
					System.out.println("Usted ha agregado palomitas.");
					break;
				case 2:
					System.out.println("Usted ha agregado refresco a su combo");
					break;
				case 3:
					System.out.println("Usted ha agregado nachos a su combo");
					break;
				case 4:
					System.out.println("Usted ha agregado hotdog a su combo");
					break;
				case 5:
					System.out.println("Usted ha seleccionado pagar su combo");
					break;
				default:
					System.out.println("Por el momento no contamos con esa opcion en nuestro menu, lo invitamos a seleccionar una opcion valida");
					break;
				
				}//switch
				scanner.close(); 
	} //Main

} //Class
