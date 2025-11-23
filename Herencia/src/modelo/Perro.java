package modelo;


	public class Perro extends Animal{

		 private String raza;

		 public Perro(String nombre,int edad, String raza){
		    super(nombre,edad);
		    this.raza=raza;
		}
		  public String sonido() {
		        return "guau";
		    }


		    @Override
		    public String toString() {
		        return super.toString() + ", Raza: " + raza;
		}
		    
		   
	}
	




