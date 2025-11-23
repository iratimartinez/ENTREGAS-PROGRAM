package principal;

import modelo.*;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		  
		            Animal x = new Perro(null, 0, null);
		            System.out.println(x instanceof Animal); 
		            System.out.println(x instanceof Perro);  
		            Animal g=new Gato(null, 0);
		            System.out.println(g instanceof Animal); 
		            System.out.println(g instanceof Perro);  
		        
		    

	}

}
