/**
 */
package comicBooks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comicBooks.Artist#getName <em>Name</em>}</li>
 *   <li>{@link comicBooks.Artist#getBooksArtistFor <em>Books Artist For</em>}</li>
 *   <li>{@link comicBooks.Artist#getBooksCoverArtistFor <em>Books Cover Artist For</em>}</li>
 * </ul>
 * </p>
 *
 * @see comicBooks.ComicBooksPackage#getArtist()
 * @model
 * @generated
 */
public interface Artist extends EObject {
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
	 * @see comicBooks.ComicBooksPackage#getArtist_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link comicBooks.Artist#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books Artist For</b></em>' reference list.
	 * The list contents are of type {@link comicBooks.Book}.
	 * It is bidirectional and its opposite is '{@link comicBooks.Book#getArtists <em>Artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books Artist For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books Artist For</em>' reference list.
	 * @see comicBooks.ComicBooksPackage#getArtist_BooksArtistFor()
	 * @see comicBooks.Book#getArtists
	 * @model opposite="artists"
	 * @generated
	 */
	EList<Book> getBooksArtistFor();

	/**
	 * Returns the value of the '<em><b>Books Cover Artist For</b></em>' reference list.
	 * The list contents are of type {@link comicBooks.Book}.
	 * It is bidirectional and its opposite is '{@link comicBooks.Book#getCoverArtist <em>Cover Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books Cover Artist For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books Cover Artist For</em>' reference list.
	 * @see comicBooks.ComicBooksPackage#getArtist_BooksCoverArtistFor()
	 * @see comicBooks.Book#getCoverArtist
	 * @model opposite="coverArtist"
	 * @generated
	 */
	EList<Book> getBooksCoverArtistFor();

} // Artist
