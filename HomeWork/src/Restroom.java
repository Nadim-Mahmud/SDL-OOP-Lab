
import java.util.*;

public class Restroom {
	
	public int people,space,i,j,k,cn,mx=1000,n;
	public boolean [] place = new boolean[mx];
	
	public void scan() {
		
		Scanner sc = new Scanner(System.in);
		
		people = sc.nextInt();
		space = sc.nextInt();
		
		sc.close();
	}
	
	public void addNewPerson() {
		
		int start = 0;
		int end = 0;
		int mxx=0;
		int tmp=1;
		
		for(i=1;i<=space;i++) {
		
			if(cn==0&&place[i]==false) {
				
				tmp  = i;
			}
			
			if(place[i]==false) {
				
				cn = cn + 1;
			}
			
			if((place[i]==true||i+1==space)){
				
				if((cn>mxx&&(place[i+1]==true||i+1==space))) {
					
					start = tmp;
					end = i;
					mxx = cn;
				}
				cn = 0;
			}
		}
		
		if(mxx==1) {
			
			place[start] = true;
			return;
		}
		if(mxx==0) {
			
			System.out.println("No available space");
			return ;
		}
		place[(start+end)/2] = true;
	}
	
	public void solve() {
		//scan();
		System.out.println("YES");
		
		for(i=1;i<=people;i++) {
			
			addNewPerson();
			System.out.println("YES");
		}
		
		for(i=1;i<=space;i++) {
			
			if(place[i]==true) {
				
				System.out.print('X');
			}
			else {
				
				System.out.print("-");
			}
		}
	}
}
