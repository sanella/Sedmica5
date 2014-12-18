package ArrayUtil;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import Dan2.Student;

public class ArrayUtillTest {
	/**
	 * int[] arr - spasim niz koji sam uradila u ArrayUtil
	 * 
	 * @param args
	 *            printArray - pozivam f-ju da mi isprinta
	 */
	
	
	
	public static void main(String[] args) {
	int[][] matrica = {{1,2,3},{3,4,5},{7,8,9}};
		
		int[] niz1 = {1,2,7,4,5};
		int[] niz2 = {4,6,7,8,9,9};
		System.out.println("prvi niz: ");
		ArrayUtill.printArray(niz1);
		System.out.println("drugi niz: ");
		ArrayUtill.printArray(niz2);
		niz2 = ArrayUtill.copyArray(niz1, niz2);
		ArrayUtill.printArray(niz2);

		int[] nizLijevo = ArrayUtill.ispisKolone(matrica);
		System.out.println("kolona matrice: ");
	ArrayUtill.printArray(nizLijevo);
		
	
		
		
		System.out.println("------------------");
		Scanner in = new Scanner(System.in);
		System.out.println("unesi broj ");
		int broj = in.nextInt();
		int poz = ArrayUtill.pozicijaNiza(broj, niz1);
	System.out.println(poz);
	
	System.out.println("------------------");
	
	System.out.println("prvi niz: ");
	ArrayUtill.printArray(niz1);
	
	ArrayUtill.sortAscendig(niz1);
	ArrayUtill.printArray(niz1);
	
	ArrayUtill.sortDescending(niz1);
	ArrayUtill.printArray(niz1);
	
	
	
	}
	
	
	
}
