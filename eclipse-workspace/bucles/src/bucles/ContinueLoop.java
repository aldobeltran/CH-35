package bucles;

public class ContinueLoop {

	public static void main(String[] args) {
		
		/*
		 * Instrucciones de salto:
		 * continue - interrumple la iteracion del bucle, si entra una condicion especifica y continua con la siguiente.
		 * 
		 * */
		
		
		//Con continue, ejecutando la sentencia condicional, pero cumpliendo la condicion del bucle for
		
		for (int cliente = 1; cliente <= 10; cliente++) {
			if (cliente == 5) {
				System.out.println("visitante " + cliente + " Ganaste!!" );
				continue; // continue hace que el 5 sea diferente sin afectar a los demas
				
			} System.out.println("Eres el visitante numero " + cliente);
			}
		}			
	}


