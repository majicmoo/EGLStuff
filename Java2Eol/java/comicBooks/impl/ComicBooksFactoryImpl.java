/**
 */
package comicBooks.impl;

import comicBooks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComicBooksFactoryImpl extends EFactoryImpl implements ComicBooksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComicBooksFactory init() {
		try {
			ComicBooksFactory theComicBooksFactory = (ComicBooksFactory)EPackage.Registry.INSTANCE.getEFactory(ComicBooksPackage.eNS_URI);
			if (theComicBooksFactory != null) {
				return theComicBooksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComicBooksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComicBooksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComicBooksPackage.COMIC_BOOK_COLLECTION: return createComicBookCollection();
			case ComicBooksPackage.PUBLISHER: return createPublisher();
			case ComicBooksPackage.SERIES: return createSeries();
			case ComicBooksPackage.BOOK: return createBook();
			case ComicBooksPackage.ARTIST: return createArtist();
			case ComicBooksPackage.EDITOR: return createEditor();
			case ComicBooksPackage.WRITER: return createWriter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComicBookCollection createComicBookCollection() {
		ComicBookCollectionImpl comicBookCollection = new ComicBookCollectionImpl();
		return comicBookCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Series createSeries() {
		SeriesImpl series = new SeriesImpl();
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book createBook() {
		BookImpl book = new BookImpl();
		return book;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist createArtist() {
		ArtistImpl artist = new ArtistImpl();
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Editor createEditor() {
		EditorImpl editor = new EditorImpl();
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writer createWriter() {
		WriterImpl writer = new WriterImpl();
		return writer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComicBooksPackage getComicBooksPackage() {
		return (ComicBooksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComicBooksPackage getPackage() {
		return ComicBooksPackage.eINSTANCE;
	}

} //ComicBooksFactoryImpl
