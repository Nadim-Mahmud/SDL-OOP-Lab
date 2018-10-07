import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TheInFullFile {
	
public long counter(){
		
		long count=0;
		
		try {
			
			Stream<String> words = Files.lines(Paths.get("input.txt"));
			
		    count = words
				.filter((w) -> w.equals("the"))
				.count();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return count;
	}

}
