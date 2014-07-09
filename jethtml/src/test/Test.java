package test;
import comicbook.*;

import java.io.File;

import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.models.IModel;

import comicBooks.ComicBooksPackage;



public class Test{

	public static void main(String[] args) throws Exception {
		Index index = new Index();
		Artists artists = new Artists();
		Artists2 artists2 = new Artists2();
		Books books = new Books();
		Books2 books2 = new Books2();
		Editors editors = new Editors();
		Editors2 editors2 = new Editors2();
		Publishers publishers = new Publishers();
		Publisher2 publishers2 = new Publisher2();
		Seriesa series = new Seriesa();
		Series2a series2a = new Series2a();
		Writers writers = new Writers();
		Writers2 writers2 = new Writers2();
		
		File modelFile = new File("C:\\tempProjectStorage\\jethtml\\model\\comicBooks.model");
		IModel model = EmfModelFactory.getInstance().loadEmfModel("OurModel", modelFile, ComicBooksPackage.eINSTANCE);

		for (Object component : model.getAllOfKind("ComicBookCollection")) {
			System.out.println(index.generate(null));
			System.out.println(artists.generate(component));
			System.out.println(books.generate(component));
			System.out.println(editors.generate(component));
			System.out.println(publishers.generate(component));
			System.out.println(series.generate(component));
			System.out.println(writers.generate(component));
		}
		
		for (Object component : model.getAllOfKind("Artist")) {
			System.out.println(artists2.generate(component));
		}
		
		for (Object component : model.getAllOfKind("Book")) {
			System.out.println(books2.generate(component));
		}
		
		for (Object component : model.getAllOfKind("Editor")) {
			System.out.println(editors2.generate(component));
		}
		
		for (Object component : model.getAllOfKind("Publisher")) {
			System.out.println(publishers2.generate(component));
		}
		
		for (Object component : model.getAllOfKind("Series")) {
			System.out.println(series2a.generate(component));
		}
		
		for (Object component : model.getAllOfKind("Writer")) {
			System.out.println(writers2.generate(component));
		}
	}
}
