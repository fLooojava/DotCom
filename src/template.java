
public class PhrasOMat
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] wortListeEins = {"verlässliche","erfolgsorientierte",
				"webbasierte","allumfassende",
				"clevere","kundenorientierte",
				"pfadkritische","dynamische",
				"konkurrenzfähige","verteilte",
				"zielgerichtete"};
		String[] wortListeZwei = {"gepowerte","haftende",
				"Mehrwert-","zentrierte",
				"geclusterte","proaktive",
				"Out-of-the-Box-","positionierte",
				"vernetzte","fokussierte",
				"kraftvolle","geordnete",
				"geteilte","kooperative",
				"beschleunigte","Multi-Tier-",
				"Enterprise-","B2B-",
				"Frontend-"};
		String[] wortListeDrei = {"Schicht","Endstufe",
				"Lösung","Architektur",
				"Kernkompetenz","Strategie",
				"Kooperation","Ausrichtung",
				"Räumlichkeit","Vision",
				"Dimension","Mission"};
		
		int einsLänge = wortListeEins.length;
		int zweiLänge = wortListeZwei.length;
		int dreiLänge = wortListeDrei.length;
		
		int rand1 = (int) (Math.random()*einsLänge);
		int rand2 = (int) (Math.random()*zweiLänge);
		int rand3 = (int) (Math.random()*dreiLänge);
		
		String phrase = wortListeEins[rand1] + " " 
						+ wortListeZwei[rand2] +" "
						+ wortListeDrei[rand3];
		System.out.println("Was wir brauchen, ist eine " + phrase+".");
		
		double x = Math.random();
		System.out.println(einsLänge);
		int y = (int) (x*einsLänge);
		System.out.println(x);
		System.out.println(y);
		// TODO Auto-generated method stub

	}

}
