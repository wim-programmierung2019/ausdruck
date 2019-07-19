import java.util.Scanner;

public class Main {
    
    /**
     * Einstieg in ein Javaprogramm.
     */
    public static void main(String[] args){
        // deklariere eine ganzzahlige Variable "birnen"
        int birnen;
		
		// weise ihr den Wert drei zu
		birnen = 3;

		System.out.println("3 erwartet: " + birnen);
		// addiere fuenf zu dem Wert
		birnen += 5;
	

		System.out.println("8 erwartet: " + birnen);
		// deklariere eine Variable "aepfel" und weise ihr den Wert fuenf zu
		int aepfel = 5;

		System.out.println("5 erwartet: " + aepfel);
		// subtrahiere zwei von dem Wert
		aepfel -= 2;

		System.out.println("3 erwartet: " + aepfel);
		
		if(aepfel>birnen){
		    System.out.println( aepfel + " aepfel sind größer als " + birnen + " birnen");
		}else if(aepfel==birnen) {
		    System.out.println( aepfel + " aepfel sind gleich groß wie " + birnen + " birnen");
		}else if(aepfel<birnen){
		    System.out.println( aepfel + " aepfel sind kleiner als " + birnen + " birnen");
		}
		
		/**Scanner scanner = new Scanner(System.in);
		System.out.println("Wer bist Du?");
		String eingabe = scanner.next();
		System.out.println("Hallo, " + eingabe);*/

    }
    
}
