

public class MainClass {
 
    public static void main(String[] args) {
      
        
        BracketOnRepetation Rand = new BracketOnRepetation();
        int cn=0;
      
        Rand.randomInit();
        
        System.out.println("Random numbers :");
        Rand.show();
        
        System.out.println("After braketing on repetation :");
        Rand.printRepitation();
        
        System.out.println("Bracketing on maximum apearance :");
        Rand.braketMax();
        
        Restroom RS =  new Restroom();
        
       /// System.out.print("fffffffff");
        
        RS.scan();
        RS.solve();
    }
}
