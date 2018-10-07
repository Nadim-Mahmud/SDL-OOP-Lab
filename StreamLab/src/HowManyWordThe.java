import java.io.IOException;
import java.nio.file.*;
import java.util.stream.*;

public class HowManyWordThe {
	
	public long counter(){
		
		long count=0;
		
		try {
			
			Stream<String> words = Files.lines(Paths.get("input.txt"));
			
		    count = words
				.filter((w) -> w.contains("the"))
				.count();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return count;
	}

}
