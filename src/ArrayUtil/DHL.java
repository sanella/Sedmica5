package ArrayUtil;

import java.util.Scanner;

public class DHL {

	public static int volumen(int[] dim) {
		int volumen = (dim[0] * dim[1] * dim[2]) / 5000;
		System.out.println("volumen: " + volumen);
		return volumen;

	}

	public static int racunajCijenu(int cijena, int[] dim) {
		int volumen = volumen(dim);
		int cijenaPaketa = 0;
		if (dim[3] > volumen) {
			cijenaPaketa = dim[3] * cijena;

		} else {
			cijenaPaketa = volumen * cijena;

		}
		return cijenaPaketa;
	}

	public static int[] dimenzije() {
		Scanner in = new Scanner(System.in);
		int[] dim = new int[4];
		System.out.println("unesi velicinu paket: ");
		dim[0] = in.nextInt();
		dim[1] = in.nextInt();
		dim[2] = in.nextInt();

		System.out.println("Unesi tezinu paketa");
		dim[3] = in.nextInt();
		return dim;

	}

	public static void main(String[] args) {

		int cijena = 3;
		int[] dim = dimenzije();
		int cijenaA = racunajCijenu(cijena, dim);
		System.out.println("cijen pkaeta je: " + cijenaA);

	}

}
