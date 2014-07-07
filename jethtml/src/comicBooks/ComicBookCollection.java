/**
 */
package comicBooks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comic Book Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comicBooks.ComicBookCollection#getBooks <em>Books</em>}</li>
 *   <li>{@link comicBooks.ComicBookCollection#getArtists <em>Artists</em>}</li>
 *   <li>{@link comicBooks.ComicBookCollection#getEditors <em>Editors</em>}</li>
 *   <li>{@link comicBooks.ComicBookCollection#getWriters <em>Writers</em>}</li>
 *   <li>{@link comicBooks.ComicBookCollection#getPublishingCompanies <em>Publishing Companies</em>}</li>
 *   <li>{@link comicBooks.ComicBookCollection#getSeries <em>Series</em>}</li>
 * </ul>
 * </p>
 *
 * @see comicBooks.ComicBooksPackage#getComicBookCollection()
 * @model
 * @generated
 */
public interface ComicBookCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Books</b></em>' containment reference list.
	 * The list contents are of type {@link comicBooks.Book}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books</em>' containment reference list.
	 * @see comicBooks.ComicBooksPackage#getComicBookCollection_Books()
	 * @model containment="true"
	 * @generated
	 */
	EList<Book> getBooks();

	/**
	 * Returns the value of the '<em><b>Artists</b></em>' containment reference list.
	 * The list contents are of type {@link comicBooks.Artist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' containment reference list.
	 * @see comicBooks.ComicBooksPackage#getComicBookCollection_Artists()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artist> getArtists();

	/**
	 * Returns the value of the '<em><b>Editors</b></em>' containment reference list.
	 * The list contents are of type {@link comicBooks.Editor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' containment reference list.
	 * @see comicBooks.ComicBooksPackage#getComicBookCollection_Editors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Editor> getEditors();

	/**
	 * Returns the value of the '<em><b>Writers</b></em>' containment reference list.
	 * The list contents are of type {@link comicBooks.Writer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writers</em>' containment reference list.
	 * @see comicBooks.ComicBooksPackage#getComicBookCollection_Writers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Writer> getWriters();

	/**
	 * Returns the value of the '<em><b>Publishing Companies</b></em>' containment reference list.
	 * The list contents are of type {@link comicBooks.Publisher}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishing Companies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Companies</em>' containment reference list.
	 * @see comicBooks.ComicBooksPackage#getComicBookCollection_PublishingCompanies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Publisher> getPublishingCompanies();

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link comicBooks.Series}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see comicBooks.ComicBooksPackage#getComicBookCollection_Series()
	 * @model containment="true"
	 * @generated
	 */
	EList<Series> getSeries();

} // ComicBookCollection
