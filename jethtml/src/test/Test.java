package test;
import comicbook.*;

public class Test {
	
	public static void main(String[] args) {
	 Index index = new Index();
	 String result = index.generate(null);
	 System.out.println(result);
	 
	 Artists artists = new Artists();
	 String resultTwo = artists.generate(null);
	 System.out.println(resultTwo);
	}
}
