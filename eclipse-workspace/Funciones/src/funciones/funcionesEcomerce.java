package funciones;

import java.util.ArrayList; //imporatcion de librerias para hacer funcionar a los array y listas
import java.util.List;

public class funcionesEcomerce {

	static class Producto { // Se agrega la static class para representar un producto
		String nombre; // se definen los objetos
		double precio;

		Producto(String nombre, double precio) {

			this.nombre = nombre; // se inicializan los objetos
			this.precio = precio;
		}
	}

	static class CarritoCompra {
		List<Producto> productos = new ArrayList<>();

		void agregarProducto(Producto barbie) {
			productos.add(barbie);

		}

		double calcularTotal() {
			double total = 0;
			for (Producto barbie : productos) {
				total += barbie.precio;
			}
			return total;
		}
	}

	public static void main(String[] args) { // Debajo del main metemos la info

		Producto muñeca1 = new Producto("Chlesea", 98.70);
		Producto muñeca2 = new Producto("Skipper", 85.40);

		CarritoCompra carrito = new CarritoCompra();

		carrito.agregarProducto(muñeca1);
		carrito.agregarProducto(muñeca2);

		double totalCarrito = carrito.calcularTotal();

		System.out.println("Total del carrito: $" + totalCarrito);
	}

}
