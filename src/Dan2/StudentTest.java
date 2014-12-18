package Dan2;

import java.util.Scanner;

public class StudentTest {

	public static void bubbleSort(Student[] niz) {
		for (int i = 0; i < niz.length - 1; i++) {
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i].getBrIndexa() > niz[j].getBrIndexa()) {
					Student temp = niz[j];
					niz[j] = niz[i];
					niz[i] = temp;
				}
			}
		}
	}
	
	public static Student[] napraviNiz(int velicina) {
		Student[] niz = new Student[velicina];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = new Student(null, null, i, null);

			niz[i].setIme("Sanela"); 
			niz[i].setPrezime("prezime");
			niz[i].setBrIndex((int) (1+Math.random()*100));
			Datum datumRodenja = new Datum(12,2,1986);
			niz[i].setDatumRodenja(datumRodenja);
			
		
			
			
		}
		return niz;
	}

	public static void ispis(Student s1) {
		System.out.printf("Ime: %10s \nPrezime: %6s \n"
				+ "Index: %d \nBrStud: %7d", s1.getIme(), s1.getPrezime(), s1.getBrIndexa(),
				s1.getBrojStudenata());
		System.out.println();
		System.out.println();

	}

	public static void ispisiNiz(Student[] niz) {
		for (int i = 0; i < niz.length; i++) {
			ispis(niz[i]);
		}
	}

	public static void main(String[] args) {

		Student[] ss = napraviNiz(3);
		ispisiNiz(ss);
		bubbleSort(ss);
		ispisiNiz(ss);
		
		
		System.out.println("------------------------");
		
//Student s1 = new Student("Sanela", "Grcic", 1);
//Student s2 = new Student("Ella", "San", 2);

		//ispis(s1);
		//ispis(s2);

	}

}
