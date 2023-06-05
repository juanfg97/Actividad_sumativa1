package sumativa1;
import java.util.Scanner;
//Escribir un programa que lea un numero entero y  a continuacion, visualice la tabla de multiplicar
//Por Juan Fernandez.Para Universidad Bicentenaria de Aragua
public class Ejercicio2
{
 public static void main(String[] args)
 {
     int numero;
     int producto;
     Scanner in = new Scanner(System.in);
     System.out.println("Ingrese un numero entero");
     numero= in.nextInt();
     for (int i=0;i<10;i++)
     {
         producto=numero*i;
         System.out.println(numero+"*"+i+"="+producto);
     }
 }
}
			
	

	


