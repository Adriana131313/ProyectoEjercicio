import java.util.Scanner;

public class Mayorymenorarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingresa el tamaño del arrays, por favor: ");
        int n = teclado.nextInt(); // aqui almacenamos datos que se accede por teclado
        int array [] = new int [n];
        
        for (int i = 0; i < array.length; i++) {// que tenga una variable 0 y las interaciones que luego se van a repetir , se va incrmentando en +1
        	System.out.print("Ingrese dato "+(i+1)+": ");
        	array [i] = teclado.nextInt();
        	
        }
        
        int mayor, menor;
        mayor = menor = array [0];
        //aqui inicalizamos dos variables para luego suar un for y ais intentar determinar el dato mayor y menor 
        
        for (int i = 0; i < array.length; i++) {
        	if(array [i] > mayor) {
        		mayor = array[i];	
        	}
        	if (array[i]<menor) {
        		menor = array[i];		
        	}
        }
        // luego de la llave q se cierra el for es donde se escribe el mensaje 
         System.out.println("El valor mayor es: "+mayor);
         System.out.println("El valor menor es: "+menor);
	}

}
