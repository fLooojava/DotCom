public class EinfachesDotComTestLauf {
	
	public static void main (String[] args){
		EinfachesDotCom dotCom = new EinfachesDotCom();
		int[] orte = {2,3,4}; // coords. vom Schiff
		dotCom.setZellorte(orte);
		
		String tipp ="2";
		String ergebnis = dotCom.prüfDich(tipp);

		
	}
}