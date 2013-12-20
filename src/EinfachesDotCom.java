
public class EinfachesDotCom
{

int [] zellorte;
int anzahlTreffer;

public void setZellorte(int [] zellorte){
	this.zellorte = zellorte;
}
	public String prüfDich( String stringTipp){
		int tipp = Integer.parseInt(stringTipp);
		String ergebnis = "Vorbei";
		
		for(int zelle:zellorte){
			if (tipp==zelle){
				ergebnis ="Treffer";
				anzahlTreffer++;
				break;
			}
			}
		if (anzahlTreffer == zellorte.length){
			ergebnis = "Versenkt";
		}
		System.out.println(ergebnis);
		return ergebnis;
	}
}
