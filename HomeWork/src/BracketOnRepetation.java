//Nadim Mahmud
import java.util.Random;
 
public class BracketOnRepetation {
    
    public int ln = 30;
    public int j;
    public int cn=0;
    public int x;
    public int y;
    public int a;
    public int b;
    
    public int []ara = new int[ln+5];
    
    public void randomInit() {
        
        for(int i = 0; i<ln; i++) {
            
            Random rand = new Random();
            ara[i] = rand.nextInt(5);
        }
    }
    
    public void show() {
        
        for(int i=0;i<ln;i++) {
            
            if(i!=0) System.out.print(' ');
            System.out.print(ara[i]);
        }
        System.out.println();
    }
    
    public void printRepitation() {
    	 
    	for(int i = 0; i<ln; i++) {
             
             if(i!=0) {
             	System.out.print(' ');
             }
             
             if((cn==0&&i!=ln-1)) {
             	
                 if((ara[i]==ara[i+1]&&cn==0)) {
                     System.out.print("( ");
                     cn = 1;
                 }
             }
             
             System.out.print(ara[i]);
             
             if((cn==1&&ln-1!=i)) {
                 if((ara[i]!=ara[i+1]&&cn==1)) {
                     System.out.print(" )");
                     cn = 0;
                 }
             }
             
         }
         if(cn==1) System.out.print(" )");
         System.out.println();
    } 
    
    public void braketMax() {
    	
    	cn = 0;
    	int mx = 0;
    	a = 0;
    	
    	for(int i = 0;i<ln;i++ ) {
    		
    		cn = cn + 1;	
    		if(cn>mx) {
    			if((ara[i]!=ara[i+1]||i+1==ln)) {
	    			x = a;
	    			y = i;
	    			mx = cn;
    			}
    		}
    		if(ara[i]!=ara[i+1]) {
    			a = i + 1;
    			cn = 0;
    		}
    	}
    	
    	for(int i=0;i<ln;i++) {
    		
    		if(i==x) {
    			System.out.print("( ");
    		}
    		
    		System.out.print(ara[i]+" ");
    		
    		if(i==y) {
    			System.out.print(") ");
    		}
    	}
    }  
}
