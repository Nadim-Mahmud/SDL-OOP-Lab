import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ThirdPrintAllLineContainsThe {
	
	public void print(){
	
		try {
			
			Stream<String> words = Files.lines(Paths.get("input.txt"));
			
		    words
			.filter(st -> st.contains("the"))
			.forEach(st -> System.out.println(st));
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
