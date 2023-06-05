package sumativa1;
//Escribir un programa en Java que calcule la media aritmética de 5 números enteros
//Por Juan Fernandez.Para Universidad Bicentenaria de Aragua
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        float [] numeros = new float [5];
        float suma=0;
        float media;

        for(int i=0;i<5;i++)
        {
            System.out.println((i+1)+"- Ingrese un numero entero");
            numeros[i] = read.nextFloat();
            suma=numeros[i]+suma;


        }
        media=suma/5;
        System.out.println("La media aritmetica es: "+media);

	}

}
