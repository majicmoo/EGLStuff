/**
 */
package comicBooks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see comicBooks.ComicBooksFactory
 * @model kind="package"
 * @generated
 */
public interface ComicBooksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comicBooks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "comicBooks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "comicBooks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComicBooksPackage eINSTANCE = comicBooks.impl.ComicBooksPackageImpl.init();

	/**
	 * The meta object id for the '{@link comicBooks.impl.ComicBookCollectionImpl <em>Comic Book Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comicBooks.impl.ComicBookCollectionImpl
	 * @see comicBooks.impl.ComicBooksPackageImpl#getComicBookCollection()
	 * @generated
	 */
	int COMIC_BOOK_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Books</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIC_BOOK_COLLECTION__BOOKS = 0;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIC_BOOK_COLLECTION__ARTISTS = 1;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIC_BOOK_COLLECTION__EDITORS = 2;

	/**
	 * The feature id for the '<em><b>Writers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIC_BOOK_COLLECTION__WRITERS = 3;

	/**
	 * The feature id for the '<em><b>Publishing Companies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIC_BOOK_COLLECTION__PUBLISHING_COMPANIES = 4;

	/**
	 * The feature id for the '<em><b>Series</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIC_BOOK_COLLECTION__SERIES = 5;

	/**
	 * The number of structural features of the '<em>Comic Book Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIC_BOOK_COLLECTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Comic Book Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMIC_BOOK_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comicBooks.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comicBooks.impl.PublisherImpl
	 * @see comicBooks.impl.ComicBooksPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 1;

	/**
	 * The feature id for the '<em><b>Publishers Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PUBLISHERS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Books Published</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__BOOKS_PUBLISHED = 1;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comicBooks.impl.SeriesImpl <em>Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comicBooks.impl.SeriesImpl
	 * @see comicBooks.impl.ComicBooksPackageImpl#getSeries()
	 * @generated
	 */
	int SERIES = 2;

	/**
	 * The feature id for the '<em><b>Series Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES__SERIES_NAME = 0;

	/**
	 * The feature id for the '<em><b>Books In Series</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES__BOOKS_IN_SERIES = 1;

	/**
	 * The number of structural features of the '<em>Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comicBooks.impl.BookImpl <em>Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comicBooks.impl.BookImpl
	 * @see comicBooks.impl.ComicBooksPackageImpl#getBook()
	 * @generated
	 */
	int BOOK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PUBLICATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__ARTISTS = 2;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__EDITORS = 3;

	/**
	 * The feature id for the '<em><b>Writers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__WRITERS = 4;

	/**
	 * The feature id for the '<em><b>Cover Artist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__COVER_ARTIST = 5;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__PUBLISHER = 6;

	/**
	 * The feature id for the '<em><b>Series Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK__SERIES_PART_OF = 7;

	/**
	 * The number of structural features of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comicBooks.impl.ArtistImpl <em>Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comicBooks.impl.ArtistImpl
	 * @see comicBooks.impl.ComicBooksPackageImpl#getArtist()
	 * @generated
	 */
	int ARTIST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Books Artist For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__BOOKS_ARTIST_FOR = 1;

	/**
	 * The feature id for the '<em><b>Books Cover Artist For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__BOOKS_COVER_ARTIST_FOR = 2;

	/**
	 * The number of structural features of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comicBooks.impl.EditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comicBooks.impl.EditorImpl
	 * @see comicBooks.impl.ComicBooksPackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Books Editor For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__BOOKS_EDITOR_FOR = 1;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link comicBooks.impl.WriterImpl <em>Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comicBooks.impl.WriterImpl
	 * @see comicBooks.impl.ComicBooksPackageImpl#getWriter()
	 * @generated
	 */
	int WRITER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Books Writer For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER__BOOKS_WRITER_FOR = 1;

	/**
	 * The number of structural features of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link comicBooks.ComicBookCollection <em>Comic Book Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comic Book Collection</em>'.
	 * @see comicBooks.ComicBookCollection
	 * @generated
	 */
	EClass getComicBookCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link comicBooks.ComicBookCollection#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Books</em>'.
	 * @see comicBooks.ComicBookCollection#getBooks()
	 * @see #getComicBookCollection()
	 * @generated
	 */
	EReference getComicBookCollection_Books();

	/**
	 * Returns the meta object for the containment reference list '{@link comicBooks.ComicBookCollection#getArtists <em>Artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artists</em>'.
	 * @see comicBooks.ComicBookCollection#getArtists()
	 * @see #getComicBookCollection()
	 * @generated
	 */
	EReference getComicBookCollection_Artists();

	/**
	 * Returns the meta object for the containment reference list '{@link comicBooks.ComicBookCollection#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editors</em>'.
	 * @see comicBooks.ComicBookCollection#getEditors()
	 * @see #getComicBookCollection()
	 * @generated
	 */
	EReference getComicBookCollection_Editors();

	/**
	 * Returns the meta object for the containment reference list '{@link comicBooks.ComicBookCollection#getWriters <em>Writers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Writers</em>'.
	 * @see comicBooks.ComicBookCollection#getWriters()
	 * @see #getComicBookCollection()
	 * @generated
	 */
	EReference getComicBookCollection_Writers();

	/**
	 * Returns the meta object for the containment reference list '{@link comicBooks.ComicBookCollection#getPublishingCompanies <em>Publishing Companies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publishing Companies</em>'.
	 * @see comicBooks.ComicBookCollection#getPublishingCompanies()
	 * @see #getComicBookCollection()
	 * @generated
	 */
	EReference getComicBookCollection_PublishingCompanies();

	/**
	 * Returns the meta object for the containment reference list '{@link comicBooks.ComicBookCollection#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series</em>'.
	 * @see comicBooks.ComicBookCollection#getSeries()
	 * @see #getComicBookCollection()
	 * @generated
	 */
	EReference getComicBookCollection_Series();

	/**
	 * Returns the meta object for class '{@link comicBooks.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see comicBooks.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link comicBooks.Publisher#getPublishersName <em>Publishers Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publishers Name</em>'.
	 * @see comicBooks.Publisher#getPublishersName()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_PublishersName();

	/**
	 * Returns the meta object for the reference list '{@link comicBooks.Publisher#getBooksPublished <em>Books Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books Published</em>'.
	 * @see comicBooks.Publisher#getBooksPublished()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_BooksPublished();

	/**
	 * Returns the meta object for class '{@link comicBooks.Series <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Series</em>'.
	 * @see comicBooks.Series
	 * @generated
	 */
	EClass getSeries();

	/**
	 * Returns the meta object for the attribute '{@link comicBooks.Series#getSeriesName <em>Series Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Name</em>'.
	 * @see comicBooks.Series#getSeriesName()
	 * @see #getSeries()
	 * @generated
	 */
	EAttribute getSeries_SeriesName();

	/**
	 * Returns the meta object for the reference list '{@link comicBooks.Series#getBooksInSeries <em>Books In Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books In Series</em>'.
	 * @see comicBooks.Series#getBooksInSeries()
	 * @see #getSeries()
	 * @generated
	 */
	EReference getSeries_BooksInSeries();

	/**
	 * Returns the meta object for class '{@link comicBooks.Book <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book</em>'.
	 * @see comicBooks.Book
	 * @generated
	 */
	EClass getBook();

	/**
	 * Returns the meta object for the attribute '{@link comicBooks.Book#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see comicBooks.Book#getName()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_Name();

	/**
	 * Returns the meta object for the attribute '{@link comicBooks.Book#getPublicationDate <em>Publication Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Date</em>'.
	 * @see comicBooks.Book#getPublicationDate()
	 * @see #getBook()
	 * @generated
	 */
	EAttribute getBook_PublicationDate();

	/**
	 * Returns the meta object for the reference list '{@link comicBooks.Book#getArtists <em>Artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artists</em>'.
	 * @see comicBooks.Book#getArtists()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Artists();

	/**
	 * Returns the meta object for the reference list '{@link comicBooks.Book#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editors</em>'.
	 * @see comicBooks.Book#getEditors()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Editors();

	/**
	 * Returns the meta object for the reference list '{@link comicBooks.Book#getWriters <em>Writers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writers</em>'.
	 * @see comicBooks.Book#getWriters()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Writers();

	/**
	 * Returns the meta object for the reference '{@link comicBooks.Book#getCoverArtist <em>Cover Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cover Artist</em>'.
	 * @see comicBooks.Book#getCoverArtist()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_CoverArtist();

	/**
	 * Returns the meta object for the reference '{@link comicBooks.Book#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publisher</em>'.
	 * @see comicBooks.Book#getPublisher()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_Publisher();

	/**
	 * Returns the meta object for the reference '{@link comicBooks.Book#getSeriesPartOf <em>Series Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Series Part Of</em>'.
	 * @see comicBooks.Book#getSeriesPartOf()
	 * @see #getBook()
	 * @generated
	 */
	EReference getBook_SeriesPartOf();

	/**
	 * Returns the meta object for class '{@link comicBooks.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artist</em>'.
	 * @see comicBooks.Artist
	 * @generated
	 */
	EClass getArtist();

	/**
	 * Returns the meta object for the attribute '{@link comicBooks.Artist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see comicBooks.Artist#getName()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Name();

	/**
	 * Returns the meta object for the reference list '{@link comicBooks.Artist#getBooksArtistFor <em>Books Artist For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books Artist For</em>'.
	 * @see comicBooks.Artist#getBooksArtistFor()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_BooksArtistFor();

	/**
	 * Returns the meta object for the reference list '{@link comicBooks.Artist#getBooksCoverArtistFor <em>Books Cover Artist For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books Cover Artist For</em>'.
	 * @see comicBooks.Artist#getBooksCoverArtistFor()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_BooksCoverArtistFor();

	/**
	 * Returns the meta object for class '{@link comicBooks.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see comicBooks.Editor
	 * @generated
	 */
	EClass getEditor();

	/**
	 * Returns the meta object for the attribute '{@link comicBooks.Editor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see comicBooks.Editor#getName()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_Name();

	/**
	 * Returns the meta object for the reference list '{@link comicBooks.Editor#getBooksEditorFor <em>Books Editor For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books Editor For</em>'.
	 * @see comicBooks.Editor#getBooksEditorFor()
	 * @see #getEditor()
	 * @generated
	 */
	EReference getEditor_BooksEditorFor();

	/**
	 * Returns the meta object for class '{@link comicBooks.Writer <em>Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writer</em>'.
	 * @see comicBooks.Writer
	 * @generated
	 */
	EClass getWriter();

	/**
	 * Returns the meta object for the attribute '{@link comicBooks.Writer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see comicBooks.Writer#getName()
	 * @see #getWriter()
	 * @generated
	 */
	EAttribute getWriter_Name();

	/**
	 * Returns the meta object for the reference list '{@link comicBooks.Writer#getBooksWriterFor <em>Books Writer For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Books Writer For</em>'.
	 * @see comicBooks.Writer#getBooksWriterFor()
	 * @see #getWriter()
	 * @generated
	 */
	EReference getWriter_BooksWriterFor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComicBooksFactory getComicBooksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link comicBooks.impl.ComicBookCollectionImpl <em>Comic Book Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comicBooks.impl.ComicBookCollectionImpl
		 * @see comicBooks.impl.ComicBooksPackageImpl#getComicBookCollection()
		 * @generated
		 */
		EClass COMIC_BOOK_COLLECTION = eINSTANCE.getComicBookCollection();

		/**
		 * The meta object literal for the '<em><b>Books</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMIC_BOOK_COLLECTION__BOOKS = eINSTANCE.getComicBookCollection_Books();

		/**
		 * The meta object literal for the '<em><b>Artists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMIC_BOOK_COLLECTION__ARTISTS = eINSTANCE.getComicBookCollection_Artists();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMIC_BOOK_COLLECTION__EDITORS = eINSTANCE.getComicBookCollection_Editors();

		/**
		 * The meta object literal for the '<em><b>Writers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMIC_BOOK_COLLECTION__WRITERS = eINSTANCE.getComicBookCollection_Writers();

		/**
		 * The meta object literal for the '<em><b>Publishing Companies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMIC_BOOK_COLLECTION__PUBLISHING_COMPANIES = eINSTANCE.getComicBookCollection_PublishingCompanies();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMIC_BOOK_COLLECTION__SERIES = eINSTANCE.getComicBookCollection_Series();

		/**
		 * The meta object literal for the '{@link comicBooks.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comicBooks.impl.PublisherImpl
		 * @see comicBooks.impl.ComicBooksPackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Publishers Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__PUBLISHERS_NAME = eINSTANCE.getPublisher_PublishersName();

		/**
		 * The meta object literal for the '<em><b>Books Published</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__BOOKS_PUBLISHED = eINSTANCE.getPublisher_BooksPublished();

		/**
		 * The meta object literal for the '{@link comicBooks.impl.SeriesImpl <em>Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comicBooks.impl.SeriesImpl
		 * @see comicBooks.impl.ComicBooksPackageImpl#getSeries()
		 * @generated
		 */
		EClass SERIES = eINSTANCE.getSeries();

		/**
		 * The meta object literal for the '<em><b>Series Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERIES__SERIES_NAME = eINSTANCE.getSeries_SeriesName();

		/**
		 * The meta object literal for the '<em><b>Books In Series</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIES__BOOKS_IN_SERIES = eINSTANCE.getSeries_BooksInSeries();

		/**
		 * The meta object literal for the '{@link comicBooks.impl.BookImpl <em>Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comicBooks.impl.BookImpl
		 * @see comicBooks.impl.ComicBooksPackageImpl#getBook()
		 * @generated
		 */
		EClass BOOK = eINSTANCE.getBook();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__NAME = eINSTANCE.getBook_Name();

		/**
		 * The meta object literal for the '<em><b>Publication Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK__PUBLICATION_DATE = eINSTANCE.getBook_PublicationDate();

		/**
		 * The meta object literal for the '<em><b>Artists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__ARTISTS = eINSTANCE.getBook_Artists();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__EDITORS = eINSTANCE.getBook_Editors();

		/**
		 * The meta object literal for the '<em><b>Writers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__WRITERS = eINSTANCE.getBook_Writers();

		/**
		 * The meta object literal for the '<em><b>Cover Artist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__COVER_ARTIST = eINSTANCE.getBook_CoverArtist();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__PUBLISHER = eINSTANCE.getBook_Publisher();

		/**
		 * The meta object literal for the '<em><b>Series Part Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK__SERIES_PART_OF = eINSTANCE.getBook_SeriesPartOf();

		/**
		 * The meta object literal for the '{@link comicBooks.impl.ArtistImpl <em>Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comicBooks.impl.ArtistImpl
		 * @see comicBooks.impl.ComicBooksPackageImpl#getArtist()
		 * @generated
		 */
		EClass ARTIST = eINSTANCE.getArtist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__NAME = eINSTANCE.getArtist_Name();

		/**
		 * The meta object literal for the '<em><b>Books Artist For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__BOOKS_ARTIST_FOR = eINSTANCE.getArtist_BooksArtistFor();

		/**
		 * The meta object literal for the '<em><b>Books Cover Artist For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__BOOKS_COVER_ARTIST_FOR = eINSTANCE.getArtist_BooksCoverArtistFor();

		/**
		 * The meta object literal for the '{@link comicBooks.impl.EditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comicBooks.impl.EditorImpl
		 * @see comicBooks.impl.ComicBooksPackageImpl#getEditor()
		 * @generated
		 */
		EClass EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__NAME = eINSTANCE.getEditor_Name();

		/**
		 * The meta object literal for the '<em><b>Books Editor For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR__BOOKS_EDITOR_FOR = eINSTANCE.getEditor_BooksEditorFor();

		/**
		 * The meta object literal for the '{@link comicBooks.impl.WriterImpl <em>Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comicBooks.impl.WriterImpl
		 * @see comicBooks.impl.ComicBooksPackageImpl#getWriter()
		 * @generated
		 */
		EClass WRITER = eINSTANCE.getWriter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITER__NAME = eINSTANCE.getWriter_Name();

		/**
		 * The meta object literal for the '<em><b>Books Writer For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITER__BOOKS_WRITER_FOR = eINSTANCE.getWriter_BooksWriterFor();

	}

} //ComicBooksPackage
