import java.util.Scanner;


public class SpielHelfer
{

	public String getBenutzereingabe(String prompt){
		
		//v0.2
		System.out.println(prompt);
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		String inputstring = Integer.toString(input);
		return inputstring;
		
		//v0.1
		/*String eingabeZeile = null;
		System.out.print(prompt+"");
		try{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			eingabeZeile = is.readLine();
			if(eingabeZeile.length() == 0 ) return null;
		}
			catch (IOException e){
				System.out.println("IOException: "+ e);
		}
		return eingabeZeile;*/
	}

}
