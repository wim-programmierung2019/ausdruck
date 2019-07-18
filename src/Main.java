public class Main {
    

    private static int x = 2;
    private static int y = 5;
    
    private static int a = 3;
    private static int b = 7;
    private static int c = 11;
    
    private static int year = 2019;
    
    /**
     * Operatorpraezedenz
     */
    public static void main(String[] args){
        
        int z = ++x * y--;
        System.out.println(z);
        
        int result = a-++c-++b;
        //System.out.println(result);
              
        boolean schaltjahr = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        //System.out.println(schaltjahr);	
        
        //System.out.println(1 + 2 + "abc");
        //System.out.println("abc" + 1 + 2);
    }
    
}
