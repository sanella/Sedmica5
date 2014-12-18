package Student;

import Dan2.Datum;

public class Student {

	private String imeIPrezime;
	private Datum datumRodenja;
	private Datum datumUpisa;
	private double gpa;
	private int brIndexa;

	private static int brojStudenata = 0;

	public Student(String imeIPrezime, Datum datumRodjenja, Datum datumUpisa) { // konstruktor
		this.imeIPrezime = imeIPrezime;
		this.datumRodenja = datumRodenja;
		this.datumUpisa = datumUpisa;
		this.gpa = 0;
		brojStudenata++;
		this.brIndexa = brojStudenata;
	}

	public Student() {//konstruktor
		this("John Doe", new Datum(), new Datum() ); 
	}

	public Student(Student other) { // konstruktor kopija
			this.imeIPrezime = other.imeIPrezime;
			this.datumRodenja = other.datumRodenja;
			this.datumUpisa = other.datumUpisa;
			this.gpa = other.gpa;
			brojStudenata++;
			this.brIndexa = brojStudenata;
		}
		
	

}
