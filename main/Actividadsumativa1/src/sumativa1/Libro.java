package sumativa1;
import java.util.Scanner;
//Escribir un programa en Java que modele la clase libro. La clase debe incluir los métodos crear
//dos objetos y para imprimir por pantalla los valores de los atributos.
//Por Juan Fernandez. Para Universidad Bicentenaria de Aragua
public class Libro {
	private String titulo;
	private String autor;
	private String genero;
	private String editorial;

	public Libro(String titulo,String autor,String genero,String editorial) {
		this.titulo=titulo;
		this.autor=autor;
		this.genero=genero;
		this.editorial=editorial;
		
	}
	public void Settitulo(String titulo) {
		this.titulo=titulo;
	}
	public String Gettitulo() {
		return titulo;
	}
	public void Setautor(String autor) {
		this.autor=autor;
	}
	public String Getautor() {
		return autor;
	}
	public void Setgenero(String genero) {
		this.genero=genero;
	}
	public String Getgenero() {
		return genero;
	}
	public void Seteditorial(String editorial) {
		this.editorial=editorial;
	}
	public String Getteditorial() {
		return editorial;
	}
	
	
	public static Libro crearobj() {
		Scanner read= new Scanner (System.in);
		System.out.println("Ingrese el titulo del libro");
		String titulo=read.nextLine();
		System.out.println("Ingrese el autor del libro");
		String autor=read.nextLine();
		System.out.println("Ingrese el o los generos del libro");
		String genero=read.nextLine();
		System.out.println("Ingrese la editorial del libro");
		String editorial = read.nextLine();
		return new Libro(titulo,autor,genero,editorial);
		
	}
	void imprimir() {
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("Genero: "+genero);
		System.out.println("Editorial: "+editorial);
	}
	
	public static void main(String args[]) {
		Libro l1 = Libro.crearobj();
		
		Libro l2= Libro.crearobj();
		
		l1.imprimir();
		System.out.println();
		l2.imprimir();
		
	}
}
