//	Aldo Beltran 4/6
package liveCoding3;

import java.util.*;

public class MangosNaranjas {

	public static void main(String[] args) {
		class Frutas {
			private int mangos;
			private int naranjas;

			public Frutas(int mangos, int naranjas) {
				this.mangos = mangos;
				this.naranjas = naranjas;

			}

			private int calcularCajas() {
				int temp;
				int a = this.mangos;
				int b = this.naranjas;
				while (b != 0) {
					temp = b;
					b = a % b;
					a = temp;
				}

				return a;
			}

			public void imprimir() {
				int cajas = calcularCajas();
				int mangosCajita = mangos / cajas;
				int naranjasCajita = naranjas / cajas;

				System.out.println("El número de cajas es: " + cajas + " El número de mangos en una caja es: "
						+ naranjasCajita + " El número de naranjas en una caja es: " + mangosCajita);

			}

		}

		Scanner scanner = new Scanner(System.in);

		System.out.println("introduzca su numero de Mangos");
		int mangos = scanner.nextInt();
		System.out.println("introduzca su numero de Naranjas");
		int naranjas = scanner.nextInt();

		Frutas frutas = new Frutas(mangos, naranjas);

		frutas.imprimir();

		scanner.close();
	}

}