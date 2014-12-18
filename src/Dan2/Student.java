package Dan2;

public class Student {

	private String ime;
	private String prezime;
	private static int brojStudenata = 0;
	private int brIndexa;
	private Datum datumRodenja;

	public String getIme() { //GET
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getBrojStudenata() {
		return brojStudenata;
	}

	public int getBrIndexa() {
		return brIndexa;
	}

	public void setIme(String ime) { //SET
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public void setDatumRodenja(Datum datumRodenja){
		this.datumRodenja = datumRodenja;
	}


	public void setBrIndex(int brIndexa) {
		this.brIndexa = brIndexa;
	}

	public Student(String ime, String prezime, int brIndexa, Datum datumRodenja) { // KONSTRUKTOR
		this.ime = ime;
		this.prezime = prezime;
		this.brIndexa = brIndexa;
		this.datumRodenja = new Datum(datumRodenja);
		this.brojStudenata ++;
	}
	
	
	
	
	
}
