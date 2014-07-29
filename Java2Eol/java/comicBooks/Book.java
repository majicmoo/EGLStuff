/**
 */
package comicBooks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comicBooks.Book#getName <em>Name</em>}</li>
 *   <li>{@link comicBooks.Book#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link comicBooks.Book#getArtists <em>Artists</em>}</li>
 *   <li>{@link comicBooks.Book#getEditors <em>Editors</em>}</li>
 *   <li>{@link comicBooks.Book#getWriters <em>Writers</em>}</li>
 *   <li>{@link comicBooks.Book#getCoverArtist <em>Cover Artist</em>}</li>
 *   <li>{@link comicBooks.Book#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link comicBooks.Book#getSeriesPartOf <em>Series Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see comicBooks.ComicBooksPackage#getBook()
 * @model
 * @generated
 */
public interface Book extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see comicBooks.ComicBooksPackage#getBook_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link comicBooks.Book#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Publication Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Date</em>' attribute.
	 * @see #setPublicationDate(String)
	 * @see comicBooks.ComicBooksPackage#getBook_PublicationDate()
	 * @model
	 * @generated
	 */
	String getPublicationDate();

	/**
	 * Sets the value of the '{@link comicBooks.Book#getPublicationDate <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Date</em>' attribute.
	 * @see #getPublicationDate()
	 * @generated
	 */
	void setPublicationDate(String value);

	/**
	 * Returns the value of the '<em><b>Artists</b></em>' reference list.
	 * The list contents are of type {@link comicBooks.Artist}.
	 * It is bidirectional and its opposite is '{@link comicBooks.Artist#getBooksArtistFor <em>Books Artist For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' reference list.
	 * @see comicBooks.ComicBooksPackage#getBook_Artists()
	 * @see comicBooks.Artist#getBooksArtistFor
	 * @model opposite="booksArtistFor" required="true"
	 * @generated
	 */
	EList<Artist> getArtists();

	/**
	 * Returns the value of the '<em><b>Editors</b></em>' reference list.
	 * The list contents are of type {@link comicBooks.Editor}.
	 * It is bidirectional and its opposite is '{@link comicBooks.Editor#getBooksEditorFor <em>Books Editor For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' reference list.
	 * @see comicBooks.ComicBooksPackage#getBook_Editors()
	 * @see comicBooks.Editor#getBooksEditorFor
	 * @model opposite="booksEditorFor" required="true"
	 * @generated
	 */
	EList<Editor> getEditors();

	/**
	 * Returns the value of the '<em><b>Writers</b></em>' reference list.
	 * The list contents are of type {@link comicBooks.Writer}.
	 * It is bidirectional and its opposite is '{@link comicBooks.Writer#getBooksWriterFor <em>Books Writer For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writers</em>' reference list.
	 * @see comicBooks.ComicBooksPackage#getBook_Writers()
	 * @see comicBooks.Writer#getBooksWriterFor
	 * @model opposite="booksWriterFor" required="true"
	 * @generated
	 */
	EList<Writer> getWriters();

	/**
	 * Returns the value of the '<em><b>Cover Artist</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link comicBooks.Artist#getBooksCoverArtistFor <em>Books Cover Artist For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cover Artist</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cover Artist</em>' reference.
	 * @see #setCoverArtist(Artist)
	 * @see comicBooks.ComicBooksPackage#getBook_CoverArtist()
	 * @see comicBooks.Artist#getBooksCoverArtistFor
	 * @model opposite="booksCoverArtistFor" required="true"
	 * @generated
	 */
	Artist getCoverArtist();

	/**
	 * Sets the value of the '{@link comicBooks.Book#getCoverArtist <em>Cover Artist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cover Artist</em>' reference.
	 * @see #getCoverArtist()
	 * @generated
	 */
	void setCoverArtist(Artist value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link comicBooks.Publisher#getBooksPublished <em>Books Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(Publisher)
	 * @see comicBooks.ComicBooksPackage#getBook_Publisher()
	 * @see comicBooks.Publisher#getBooksPublished
	 * @model opposite="booksPublished" required="true"
	 * @generated
	 */
	Publisher getPublisher();

	/**
	 * Sets the value of the '{@link comicBooks.Book#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Publisher value);

	/**
	 * Returns the value of the '<em><b>Series Part Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link comicBooks.Series#getBooksInSeries <em>Books In Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series Part Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Part Of</em>' reference.
	 * @see #setSeriesPartOf(Series)
	 * @see comicBooks.ComicBooksPackage#getBook_SeriesPartOf()
	 * @see comicBooks.Series#getBooksInSeries
	 * @model opposite="booksInSeries" required="true"
	 * @generated
	 */
	Series getSeriesPartOf();

	/**
	 * Sets the value of the '{@link comicBooks.Book#getSeriesPartOf <em>Series Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Part Of</em>' reference.
	 * @see #getSeriesPartOf()
	 * @generated
	 */
	void setSeriesPartOf(Series value);

} // Book
