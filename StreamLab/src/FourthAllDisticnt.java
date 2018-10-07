import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class FourthAllDisticnt {
	
	public void distinct(){
		
		Set<String> distinct = new HashSet<String>();
		
		try {
			
			Stream<String> words = Files.lines(Paths.get("input.txt"));
			
			words.forEach(st -> {
				distinct.add(st);
			});
			
//		    words
//			.filter(st -> st.contains("the"))
//			.forEach(st -> System.out.println(st));
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(distinct);
	}

}
