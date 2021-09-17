import java.util.Scanner;
import java.util.StringTokenizer;

public class comprobarPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra;
		Scanner entrada=new Scanner(System.in);
		// ahora intento definir la clase
		
		// las variables que voy añadiando van reflejando las variables que quiero guardar
		StringTokenizer cuenta; 
		int palabras=1;
		
		System.out.println("introduzca la palabras que deseas contar y leer");
		palabra=entrada.nextLine();
		cuenta=new StringTokenizer(palabra);
		System.out.println("la frase de la palabra radar es: "+cuenta.countTokens());
		
		for (int c=0;c<palabra.length();c++) {
		 if (palabra.charAt(c)==' ') {palabras++;}
		 // aqui se estan contando los espacios
			 
		 }
         System.out.println("El numero que tiene la palabras que introduces tiene: "+palabras);
	}

}
