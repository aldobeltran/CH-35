package peradoresLogicos;

public class operadoresLogicos {

	public static void main(String[] args) {
		
		
		/*&& operador And  devuelve true si ambas expresiones son verdaderas 
		 || operador or devuelve true si almenos una de las dos condiciones se cumple
		 ! operador not si la expresion booleana es flase devuelve true y viceversa */
	//&& And
		
		int años = 5;
		boolean esNiño = true;
		boolean costoNiño = años <= 12 && esNiño;
		System.out.println("Eres niño " + costoNiño);
		
	
		
		String cliente = "Cliente123";
		String credenciales = "aldo6a";
		boolean credencialCorrecta = cliente.equals("cliente123")&& credenciales.equals("aldo6a");
		System.out.println ("la credencial es valida " + credencialCorrecta);
		
	//|| Or
		
		double costoPasaje = 380.50;
		int edad = 58;
		boolean credencialInapam=false;
		boolean descuentoAdultoMayor = edad >= 60 || credencialInapam;
		System.out.println("Tiene descuento" + costoPasaje );
		
	
	//! Not
		
		boolean asientosDisponibles = true;
		boolean libres = true;
		boolean asientosConDescuento = !libres;
		System.out.println("Tenemos asientos con descuento" + asientosConDescuento );
	
	/*Ejercicio autobus viaje a Oaxaca*/
		
		/*
		 * costoBoleto = 350
		 * asientosNormales= 62
		 * asientosAdultosMayores= 4
		 * asientosEstudiantes= 6
		 * descuentoInapam= 35%
		 * descuentoEstudiantes= 30%
		 * calcular asientos disponibles
		 * descuentos ganancia, etc
		 * */
		
		
		int precioBoleto = 350;
		int asientostotales = 62;
		int asientosAdultosM= 4;
		int asientosEstudiantes= 6;
		float descuentoAdultosM = .35f;
		float descuentoEstudiantes = .30f;
		int asientosComprados = 63;
				
		if(asientosComprados > asientostotales) {
			System.out.println("Ya no hay boletos");
		}
		
		double totaldeAsientosEspeciales = asientosAdultosM + asientosEstudiantes;
		double totalDeDescuentoAdultosM = precioBoleto * descuentoAdultosM;
		double precioConDescuentoAdultosM = totalDeDescuentoAdultosM - precioBoleto;
		double totalDeDescuentoEstudiantes = precioBoleto * descuentoEstudiantes;
		double precioConDescuentoEstudiantes = totalDeDescuentoEstudiantes - precioBoleto;
		
		System.out.println("Asientos especiales = " + totaldeAsientosEspeciales);
		System.out.println("Descuento para adultos mayores =  " + totalDeDescuentoAdultosM);
		System.out.println("Precio con descuento aplicado para adultos mayores =" + precioConDescuentoAdultosM );
		System.out.println("Descuento para estudiantes =  " + totalDeDescuentoEstudiantes);
		System.out.println("Precio con descuento aplicado para estudiantes =" + precioConDescuentoEstudiantes);
		
		
	}}
