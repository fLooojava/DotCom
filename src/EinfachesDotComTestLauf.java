public class EinfachesDotComTestLauf {
	
	public static void main (String[] args){
		int anzahlTipps = 0;
		
		SpielHelfer helfer = new SpielHelfer();
		EinfachesDotCom dasDotCom = new EinfachesDotCom();
		
		int zufallsZahl = (int) (Math.random()*5);
		int [] orte = {zufallsZahl, zufallsZahl+1,zufallsZahl+2};
		// class EinfachesDotCom
		dasDotCom.setZellorte(orte);
		boolean lebt = true;
		
		while(lebt == true){
			
			// class SpielHelfer
			String tipp = helfer.getBenutzereingabe("Geben Sie eine Zahl ein");
			
			// class EinfachesDotCom
			String ergebnis = dasDotCom.prüfDich(tipp);
			anzahlTipps++;
			if(ergebnis.equals("Versenkt!")){
				lebt = false;
				System.out.println("Sie haben "+ anzahlTipps+"Versuche benötigt!");
			}
	
		}

		
	}
}