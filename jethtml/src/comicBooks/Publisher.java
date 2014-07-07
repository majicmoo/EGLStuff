/**
 */
package comicBooks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comicBooks.Publisher#getPublishersName <em>Publishers Name</em>}</li>
 *   <li>{@link comicBooks.Publisher#getBooksPublished <em>Books Published</em>}</li>
 * </ul>
 * </p>
 *
 * @see comicBooks.ComicBooksPackage#getPublisher()
 * @model
 * @generated
 */
public interface Publisher extends EObject {
	/**
	 * Returns the value of the '<em><b>Publishers Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publishers Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishers Name</em>' attribute.
	 * @see #setPublishersName(String)
	 * @see comicBooks.ComicBooksPackage#getPublisher_PublishersName()
	 * @model
	 * @generated
	 */
	String getPublishersName();

	/**
	 * Sets the value of the '{@link comicBooks.Publisher#getPublishersName <em>Publishers Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publishers Name</em>' attribute.
	 * @see #getPublishersName()
	 * @generated
	 */
	void setPublishersName(String value);

	/**
	 * Returns the value of the '<em><b>Books Published</b></em>' reference list.
	 * The list contents are of type {@link comicBooks.Book}.
	 * It is bidirectional and its opposite is '{@link comicBooks.Book#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books Published</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books Published</em>' reference list.
	 * @see comicBooks.ComicBooksPackage#getPublisher_BooksPublished()
	 * @see comicBooks.Book#getPublisher
	 * @model opposite="publisher"
	 * @generated
	 */
	EList<Book> getBooksPublished();

} // Publisher
