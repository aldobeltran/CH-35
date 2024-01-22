package tiposDeDatosYVariables;


public class EjercicioDatos {

	public static void main(String[] args) {
		
		System.out.println("Hola again");
		
		/*comentario multilinea**/
		//comentario de una lines
		// acomodar texto, con alt+shitf+y
		
		byte edad;
		
		edad = 25;
		
		//Tipos de datos enteros:
		
		
		
		byte edad1 = 15; // Byte sirve para representar un numero entero 8bits (-128 al 127)
		
		System.out.println("Edad del participante "+edad);
		
		short usuariosNuevos = 2000; // Short sirve para representar un numero entero 16 bits (-23768 al 32767)
		
		System.out.println("usuarios nuevos " +usuariosNuevos);
		
		int usuariosTotales = 8752; // Sirve para representar un numero entero 32 bits (-2147483648 al 2147483647)
		
		System.out.println("usuarios totales " + usuariosTotales);
		
		long usuariosPrem = 900000; //Long srive para representar un numero entero de 64 bits ( -9,223,372,036,854,775,808 al 9,223,372,036,854,775,807)
		
		System.out.println("usuariosPrem " + usuariosPrem);
		
		
		//Tipos de datos con numero decimales 
		
		float altura = 1.61f;//Sirve para representar un valor numerico con numeros decimales, cuyo valor es de 23 bits, puede tener 8 caracteres despues del punto decimal y que tiene que llevar una f al final
				
		System.out.println("Altura del usuarix "+altura);
				
		double peso = 68.500 ;//Sirve para representar valores numericos con decimales, cuyo valor es de 64 bits y puede tener hasta quince caracteres despues del punto decimal
		
		String nombreUsuario = "Aldo"; //String a diferencia de js es una clase para tener
		
		System.out.println("usuario " +nombreUsuario);
		
		char seccion = 'f';
		
		System.out.println("seccion " + seccion);
		
		boolean clienteFrecuente = true;
		System.out.println("Es un cliente frecuente " +clienteFrecuente);
		
		//conversion de tipos
		
		//casteo a entero
		
		int pesoCambio = (int) peso;
		
		//Casteo entero
	
		long pesoCambio1 = (long) peso;
		
		System.out.println("double " +peso);
		System.out.println("int " +pesoCambio);
		System.out.println("long " +pesoCambio1);
		
		/*
		 * operadore aritmeticos
		 * suma +
		 * resta -
		 * multiplicacion *
		 * division /
		 * residuo %
		 * */
		
		/*
		 * operadores de comparacion
		 * igualdad ==
		 * compara si es diferente !=
		 * mayor que >
		 * menor que <
		 * mayor o igual que >=
		 * menor o igual que <=		 * */
		
		
		//Ejercicio de boletos
		
		String costoBoleto = "500";//Es una clase para tener cadenas de texto
		String zonaBoleto = "52";
		System.out.println("Usuarix "+costoBoleto);
		System.out.println("Zona a la que pertenece "+zonaBoleto);
		
		int nombreCambio = Integer.parseInt(costoBoleto);
		double zonaCambio = Double.parseDouble(zonaBoleto);
		System.out.println("zona segun su boleto" + (nombreCambio *zonaCambio));
		
		
		
		//Ejercicio cine
		
		double precioEntrada = 75.5;
		double precioPalomitas = 89.7;
		double precioBebida = 35.5;
		int capacidadTotal = 500;
		
		int personasDentro = 542;
		
		if(personasDentro > capacidadTotal) {
			System.out.println("Aforo lleno");
		}
		
		double totalEntrada =  personasDentro * precioEntrada;
		double totalPalomitas = personasDentro * precioPalomitas;
		double totalBebidas = personasDentro * precioBebida;
		
		System.out.println("total de personas " + personasDentro);
		System.out.println("total de entradas " + totalEntrada);
		System.out.println("total de palomitas " + totalPalomitas);
		System.out.println("total de bebidad " + totalBebidas);
		
	
	}

}
