package Dan3;

public class DatumTest {
	
	public static void main(String[] args) {
		
		
		Datum prviDatum = new Datum(10, 12, 2014);
		Datum drugiDatu = new Datum(prviDatum);
		
		prviDatum.setDan(15);
		
		if (prviDatum.equals(drugiDatu) == true){
			System.out.println("isti");
			} else{
				System.out.println("nisu jednaki");
			}
		
		prviDatum.compare(drugiDatu);
		System.out.println(prviDatum.compare(drugiDatu));
		
		System.out.println(prviDatum.toString());
		System.out.println(drugiDatu.toString());
		System.out.println("-------------------");
		
		System.out.println(prviDatum.getDan());
		int a = prviDatum.getDan();
		
		System.out.println("a:" + a); // ovo je prednsot getera
		System.out.println(prviDatum.getDan()); // ispis getera
		System.out.println(prviDatum.getMjesec());
		System.out.println(prviDatum.getGodina());// ispisi getera
		System.out.println("-------------------");
		
		prviDatum.setDan(21);
		System.out.println(prviDatum.getDan());
		
		prviDatum.setMjesec(12);
		System.out.println(prviDatum.getMjesec());
		
		prviDatum.setGodina(2015);
		System.out.println(prviDatum.getGodina());
		
	if (prviDatum.equals(drugiDatu) == true){
	System.out.println("isti");
	} else{
		System.out.println("nisu jednaki");
	}
		
		
		
	}

}
