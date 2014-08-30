import comicbook.*;

import java.io.File;

import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.models.IModel;

import comicBooks.ComicBooksPackage;

public class JetTest{

	public static void main(String[] args) throws Exception {
		Artists2 artists2 = new Artists2();
		
		File modelFile = new File("./tmp/comicBooks.model");
		IModel model = EmfModelFactory.getInstance().loadEmfModel("OurModel", modelFile, ComicBooksPackage.eINSTANCE);

		
		for (Object component : model.getAllOfKind("Artist")) {
			System.out.println(artists2.generate(component));
		}
	}
}
