import java.util.Arrays;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void calcularMedia() {
		
		int n_elemen = 30;
		int numRandom [] = new int[n_elemen];
		for (int i = 0; i < numRandom.length; i++) {
			int n = (int) (Math.random()* 10) + 1;
			numRandom[i] = n;
		}
		
		Arrays.sort(numRandom);
		for (int i = 0; i < numRandom.length; i++) {
			System.out.print(" " + numRandom[i]);
		}
		
		System.out.println(" ");
		double media = 0.0;
		for (int i = 0; i < numRandom.length; i++) {
			media = media + numRandom[i];
		}
		media = media / numRandom.length;
		System.out.println("media= " + media);
		
	}
}

