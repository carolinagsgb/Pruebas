import java.util.*;

public class TestAnimal {
	
	public static void main (String [] args) {

	animal animal1 = new animal ();

	Scanner teclado = new Scanner (System.in);

	System.out.print("Teclee el nombre del animal");

	animal1.setNombre(teclado.nextLine());

	System.out.print ("Teclee la edad del animal: ");
	int edad = teclado.nextInt();

	animal1.setEdad(edad);

	animal1.nace();

	System.out.println("Mi nombre es "+animal1.getNombre()+" y tengo "+ animal1.getEdad()+" años");
	}
}
