import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Fifth {
	
	public static <T> String toString(Stream<T> stream, int n) {
		
	}
	
	public void print(){
		
		try {
			
			Stream<String> words = Files.lines(Paths.get("input.txt"));
			
			
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
