package ArrayUtil;

import java.util.Scanner;

class ArrayUtill {


	
	public static void sortArray(int[] array, boolean ascending){
		
	}
	
	public static int pozicijaNiza(int broj, int[] array){
		int pozicija = -1;
		for (int i = 0; i < array.length; i++){
			
			
			if (array[i] == broj){
				  pozicija = i;
				if (array[i] != broj){
				}
			}
		}
		return pozicija;
	}
	
	
	
	
	
	public static void sortAscendig(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void sortDescending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	
	
	
	public static int[] ispisKolone(int[][] matrica) {
		int broj = 1;
		int[] kolona = new int[matrica[0].length];
		for (int i = 0; i <= matrica[0][broj]; i++) {
			kolona[i] = matrica[i][broj];
		}
		return kolona;
	}

	public static int[] pomjeriDesno(int[] niz1) {
		int[] nizD = new int[niz1.length];
		for (int i = 1; i < niz1.length; i++) {

			nizD[i] = niz1[i - 1];

		}
		return nizD;
	}

	public static int[] pomjeriLijevo(int[] niz1) {
		int[] nizL = new int[niz1.length];
		for (int i = 0; i < niz1.length - 1; i++) {
			nizL[i] = niz1[i + 1];
		}
		return nizL;
	}

	public static int[] copyArray(int[] niz1, int[] niz2) { // dodjeli
															// vrijednost jednog
															// nia drugom nizu
		if (niz1.length > niz2.length) {

			int[] niz3 = new int[niz1.length];

			for (int j = 0; j < niz3.length; j++) {
				niz3[j] = niz1[j];

			}
			return niz3;
		}
		if (niz2.length >= niz1.length) {
			for (int i = 0; i < niz1.length; i++) {
				niz2[i] = niz1[i];
			}
		}

		return niz2;
	}

	public static int[] getArray(int size, int defaultValue) {

		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = defaultValue;
		}

		return array;

	}

	static Scanner in = new Scanner(System.in);

	/**
	 * F-ja sluzi za prntanje niza
	 * 
	 * @param array
	 */

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int[] getUserArray(int size) {

		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("unesi brojeve: ");
			array[i] = in.nextInt();
		}

		return array;

	}
}
