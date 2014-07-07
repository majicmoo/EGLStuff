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
	 
	 Editors editors = new Editors();
	 String resultThree = editors.generate(null);
	 System.out.println(resultThree);
	 
	 Writers writers = new Writers();
	 String resultFour = writers.generate(null);
	 System.out.println(resultFour);
	 
	 Publishers publishers = new Publishers();
	 String resultFive = publishers.generate(null);
	 System.out.println(resultFive);
	 
	 Series series= new Series();
	 String resultSix = series.generate(null);
	 System.out.println(resultSix);
	 
	 Books books= new Books();
	 String resultSeven = books.generate(null);
	 System.out.println(resultSeven);
	}
}
