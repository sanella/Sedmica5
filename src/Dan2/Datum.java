package Dan2;

import javax.print.attribute.standard.MediaSize.Other;

public class Datum {

	private int dan;
	private int mjesec;
	private int godina;

	public Datum() { // konstruktor
		dan = 1;
		mjesec = 1;
		godina = 1900;
	}

	public Datum(Datum other) {
		this.dan = other.dan;
		this.mjesec = other.mjesec;
		this.godina = other.godina;

	}

	public boolean equals(Datum other){
		if(this.dan == other.dan && this.mjesec == other.mjesec && this.godina==other.godina){
			return true;
		}else{
			return false;
			
		}
	}
	
	public int compare(Datum other) {
		if (this.godina > other.godina) {
			return -1;
		}
		if (this.godina < other.godina) {
			return 1;

		}
		if (this.godina == other.godina) {
			if (this.mjesec > other.mjesec) {
				return 1;
			}
			if (this.mjesec < other.mjesec) {
				return -1;
			}

			if (this.mjesec == other.mjesec) {
				if (this.dan > other.dan) {
					return -1;
				}
				if (this.dan < other.dan) {
					return 1;
				}
				if (this.dan == other.dan) {
					return 0;
				}

			}

		}
		return 0;
	}

	public Datum(int dan, int mjesec, int godina) { // konstruktor
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;

	}

	public String toString() {
		String datumKaoString = "";

		datumKaoString = dan + "." + mjesec + "." + godina; // mogla sam i
															// pretvarati kao
															// string ali radi i
															// ovako

		return datumKaoString;
	}

	/**
	 * Vraca vrojednost varijable dan
	 * 
	 * @return dan
	 */
	public int getDan() {
		return dan;
	}

	/**
	 * Vraca vrijednost varijable mjesec
	 * 
	 * @return mjesec
	 */
	public int getMjesec() {
		return mjesec;
	}

	/**
	 * vraca vrijednost varijable godina
	 * 
	 * @return godina
	 */

	public int getGodina() {
		return godina;
	}

	/**
	 * postavlja vrijednost varijable Dan
	 * 
	 * @param noviDan
	 *            nova vrijednost IllegalArgumentException ako dan nije u
	 *            zadanom intervalu
	 */
	public void setDan(int dan) { // void jer nista ne vraca on mijenja // ii
									// moze boolean
		if (dan < 0 || dan > 31) {
			throw new IllegalArgumentException("Dan nije u validnom intervalu");
		} else {
			this.dan = dan;
		}
	}

	/**
	 * postavlja vrijednost varijable mjesec
	 * 
	 * @param noviMjesec
	 *            nova vrijednost IllegalArgumentException ako varijabla nije u
	 *            zadanom intervalu
	 */
	public void setMjesec(int mjesec) { // void jer nista ne vraca on mijenja //
										// ii moze boolean
		if (mjesec < 1 || mjesec > 12) {
			throw new IllegalArgumentException(
					"Mjesec nije u validnom intervalu");
		} else {
			this.mjesec = mjesec;
		}
	}

	/**
	 * postavja vrijednost varijable godina
	 * 
	 * @param noviGodina
	 *            nova vrijednost IllegalArgumentException ako varijabla nije u
	 *            zadanom intervalu
	 */

	public void setGodina(int godina) { // void jer nista ne vraca on mijenja //
										// ii moze boolean
		if (godina < 1900 || godina > 3014) {
			throw new IllegalArgumentException(
					"Godina nije u validnom intervalu");
		} else {
			this.godina = godina; // ctrl klik i pokaze na koju varijablu se
									// odnosi. This. pokazuje na koju varijablu
									// mislimo
		}
	}

}
