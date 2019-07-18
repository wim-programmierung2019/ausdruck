public class Main {
    

    private static int i = 1000000000;  // 10^9
    private static long l = 1000000000000000000L; //10^18
    private static float f = 3.3E38f;
  
    /**
     * Fallen der Rechnerarithmetik
     */
    public static void main(String[] args){
        
        i = i*i; System.out.println("i: "+ i);
        l = l*l; System.out.println("l: "+ l);
        f = f*f; 
        
        //System.out.println("f: "+ f);
        //System.out.println("1.0/0.0: "+ (1.0 / 0.0));
        //System.out.println("0.0/0.0: "+ (0.0 / 0.0));
        //System.out.println("1+1.0: "+ (1 + 1.0));
        //System.out.println("1==1.0: "+ (1 == 1.0));
        //System.out.println("1/0: "+ (1 / 0)); 
    }
    
}
