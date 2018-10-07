import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class FourthAllDisticnt {
	
	public void distinct(){
		
		Set<String> distinct = new HashSet<String>();
		
		try {
			
			Stream<String> words = Files.lines(Paths.get("input.txt"));
			
			words.forEach(st -> {
				if(st.length()<=4)distinct.add(st);
			});
			
//		    words
//			.filter(st -> st.contains("the"))
//			.forEach(st -> System.out.println(st));
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		TreeSet myTreeSet = new TreeSet();
		myTreeSet.addAll(distinct);
		System.out.println(myTreeSet); 
		
		//System.out.println(distinct);
	}

}
