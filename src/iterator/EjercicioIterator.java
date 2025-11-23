package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EjercicioIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alumnos = new ArrayList<String>();//PARTE 1
		alumnos.add("Ana");
		alumnos.add("Luis");
		alumnos.add("Marta");
		alumnos.add("Sol");
		alumnos.add("Pedro");

		Iterator<String> it = alumnos.iterator();

		System.out.println("Nombres en orden:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		it = alumnos.iterator();
		while (it.hasNext()) {
			String valor = it.next();

			if (valor.length() < 4) {
				it.remove();
			}
		}

		System.out.println("\nLista después de eliminar los nombres con menos de 4 letras:");
		for (String alumno : alumnos) {
			System.out.println(alumno);

		}

		ListIterator<String> i = alumnos.listIterator(); //PARTE 2
		 while(i.hasNext()) {
			 String alumno = i.next();
			 
			 if(alumno.toUpperCase().startsWith("P")) {
				 i.set(alumno.toUpperCase());//modifica
			 }
		 
		 
		   if (alumno.toUpperCase().startsWith("M")) {
               i.add("Marcos");  // se inserta después del elemento actual
           }
		 }
		        

       // 3. Imprimir la lista tras las modificaciones
       System.out.println("Lista modificada:");
       System.out.println(alumnos);

       // 4. Recorrer hacia atrás e imprimir
       System.out.println("Recorrido hacia atrás:");
       while (i.hasPrevious()) {
           System.out.println(i.previous());
       }
       
       i = alumnos.listIterator();

       System.out.println("\nRecorrido hacia adelante con índices:");
       // 1. nextIndex()
       while (i.hasNext()) {
           System.out.println("Índice " + i.nextIndex() + " → " + i.next());
       }

       System.out.println("\nRecorrido hacia atrás con índices:");
       // 2. previousIndex()
       while (i.hasPrevious()) {
           System.out.println("Índice " + i.previousIndex() + " ← " + i.previous());
       }
       
}// main

}// class
