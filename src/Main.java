public class Main {
    
    /**
     * Switch
     */
    public static void main(String[] args){
        
        int wochentag = 5;

        switch (wochentag){
            case 1: System.out.println("vormittags");
            case 2: case 3: case 4: case 5:
                System.out.println("geöffnet"); break;
            default: System.out.println("geschlossen");
        }
    }
}
