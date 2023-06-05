package sumativa1;
//Un vendedor necesita ingresar los productos nuevos de una tienda
//y visualizar la lista final con su disponibilidad. Escribir un programa en Java
//para agregar productos y generar la lista.
//Por Juan Fernandez.Para Universidad Bicentenaria de Aragua
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Producto> productos = new ArrayList<Producto>();
	        String respuesta;

	        do {
	            System.out.print("Ingrese el nombre del producto: ");
	            String nombre = sc.nextLine();

	            System.out.print("Ingrese la cantidad de unidades disponibles: ");
	            int cantidad = Integer.parseInt(sc.nextLine());

	            Producto producto = new Producto(nombre, cantidad);
	            productos.add(producto);

	            System.out.print("¿Desea agregar otro producto? (S/N): ");
	            respuesta = sc.nextLine();
	        } while (respuesta.equalsIgnoreCase("S"));

	        System.out.println("Lista de productos:");

	        for (Producto producto : productos) {
	            System.out.println(producto.getNombre() + " - Disponibilidad: " + producto.getCantidad());
	        }
	    }
}
	class Producto {
	    private String nombre;
	    private int cantidad;

	    public Producto(String nombre, int cantidad) {
	        this.nombre = nombre;
	        this.cantidad = cantidad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }
	}