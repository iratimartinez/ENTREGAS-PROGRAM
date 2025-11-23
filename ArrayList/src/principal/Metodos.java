package principal;

	import java.util.ArrayList;
	import java.util.Arrays;

	public class Metodos {
	    public static void main(String[] args) {
	        // Creamos un ArrayList de ejemplo
	        ArrayList<String> lista = new ArrayList<>();

	        // 1️⃣ add: Añade un elemento al final
	        lista.add("Ana");
	        lista.add("Luis");
	        System.out.println("add: " + lista); // [Ana, Luis]

	        // 2️⃣ addAll: Añade todos los elementos de otra colección
	        ArrayList<String> otraLista = new ArrayList<>(Arrays.asList("Marta", "Pedro"));
	        lista.addAll(otraLista);
	        System.out.println("addAll: " + lista); // [Ana, Luis, Marta, Pedro]

	        // 3️⃣ clear: Elimina todos los elementos
	        ArrayList<String> copiaLista = new ArrayList<>(lista); // para no perder la lista original
	        copiaLista.clear();
	        System.out.println("clear: " + copiaLista); // []

	        // 4️⃣ contains: Comprueba si un elemento está
	        boolean existe = lista.contains("Marta");
	        System.out.println("contains 'Marta': " + existe); // true

	        // 5️⃣ get: Devuelve el elemento de una posición
	        String elemento = lista.get(2);
	        System.out.println("get(2): " + elemento); // Marta

	        // 6️⃣ isEmpty: Verifica si está vacía
	        System.out.println("isEmpty: " + lista.isEmpty()); // false

	        // 7️⃣ remove: Elimina un elemento
	        lista.remove("Luis");
	        System.out.println("remove 'Luis': " + lista); // [Ana, Marta, Pedro]

	        // 8️⃣ size: Devuelve el número de elementos
	        System.out.println("size: " + lista.size()); // 3

	        // 9️⃣ toArray: Devuelve un array con los elementos
	        Object[] array = lista.toArray();
	        System.out.println("toArray: " + Arrays.toString(array)); // [Ana, Marta, Pedro]
	    }
	}
