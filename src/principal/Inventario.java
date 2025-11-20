package principal;

import modelo.Producto;

public class Inventario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto[] inventario = new Producto[10];

		inventario[8] = new Producto("Manzana", 6, 23);
		inventario[6] = new Producto("Pera", 5, 4);
		inventario[4] = new Producto("Naranja", 3, 35);

		double total = 0;

		for (int i = 0; i < inventario.length; i++)// EJERCICIO 1
		{
			if (inventario[i] != null && inventario[i].getStock() % 2 != 0) // si el objeto existe y es impar.
			{
				total += inventario[i].getPrecio();
			}
		}

		System.out.println("El total es " + total);

		double masCaro = 0;

		for (int i = 0; i < inventario.length; i++)// EJERCICIO 2

		{
			if (inventario[i] != null && inventario[i].getStock() > 5)// si esta vacio
			{
				if (inventario[i].getPrecio() > masCaro)
					masCaro = inventario[i].getPrecio();

			}
		}
		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] != null) {
				if (masCaro == inventario[i].getPrecio()) {
					System.out.println("El mas caro es " + inventario[i].toString());
				}
			}

		}

		Producto aux;// EJERCICIO 3
		for (int i = 0; i < inventario.length; i++) {
			for (int j = i + 1; j < inventario.length - 1; j++) {
				if (inventario[i] == null) {// el < cambiar para hacer ascendente
					aux = inventario[i];
					inventario[i] = inventario[j];
					inventario[j] = aux;
				}
			}
		}
		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] != null)
				System.out.println(inventario[i].toString());
			else {
				System.out.println("----------------");
			}
		}
		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] != null) {
				if (masCaro == inventario[i].getPrecio()) {
					System.out.println("El mas caro es " + inventario[i].toString());
				}
			}

		}

		Producto max = new Producto(" ", 0.0, 0);
		Producto min = new Producto(" ", 100000, 0);
		int max1 = 0, min1 = 0; //posicion.
		for (int i = 0; i < inventario.length; i++) {// EJERCICIO 2
			if (inventario[i] != null) {// si esta vacio

				if (inventario[i].getPrecio() > max.getPrecio()) {
					max = inventario[i];
					max1=i;

				}
			}

		}
		
		for (int i = 0; i < inventario.length; i++) {// EJERCICIO 2
			if (inventario[i] != null) {// si esta vacio

				if (inventario[i].getPrecio() > min.getPrecio()) {
					min = inventario[i];
					min1=i;

				}
			}

		}
		inventario[min1]=max;
		inventario[max1]=min;
		

	}// main

}// class
