package Dan2;

import java.awt.Dimension;
import java.util.Scanner;

public class DHL {

	public static float volumen(Dimension dim) {
		float volumen = (dim.width * dim.height * dim.leng) / 5000;
		System.out.println("volumen: " + volumen);
		return volumen;

	}

	public static int racunajCijenu(Dimension dim, float cijena) {
		float volumen = volumen(dim);
		float cijenaPaketa = 0;
		if (dim.weight > volumen) {
			cijenaPaketa = dim.weight * cijena;

		} else {
			cijenaPaketa = volumen * cijena;

		}
		return cijenaPaketa;
	}

	public static Dimension getDimension() {
		Dimension dim = new Dimension();
		Scanner in = new Scanner(System.in);
		float dim = new int[4];
		System.out.println("unesi velicinu paket: ");
		dim.width = in.nextFloat();
		dim.height = in.nextFloat();
		dim.length= in.nextFloat();

		System.out.println("Unesi tezinu paketa");
		dim.weight = in.nextFloat();;
		return dim;

	}

	public static void main(String[] args) {
		Dimension dim = getDimension();
		float cijena = 3;
	
		float cijenaA = racunajCijenu(cijena, dim);
		System.out.println("cijen pkaeta je: " + cijenaA);

	}

}
