/**
 */
package comicBooks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comicBooks.Editor#getName <em>Name</em>}</li>
 *   <li>{@link comicBooks.Editor#getBooksEditorFor <em>Books Editor For</em>}</li>
 * </ul>
 * </p>
 *
 * @see comicBooks.ComicBooksPackage#getEditor()
 * @model
 * @generated
 */
public interface Editor extends EObject {
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
	 * @see comicBooks.ComicBooksPackage#getEditor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link comicBooks.Editor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Books Editor For</b></em>' reference list.
	 * The list contents are of type {@link comicBooks.Book}.
	 * It is bidirectional and its opposite is '{@link comicBooks.Book#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books Editor For</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books Editor For</em>' reference list.
	 * @see comicBooks.ComicBooksPackage#getEditor_BooksEditorFor()
	 * @see comicBooks.Book#getEditors
	 * @model opposite="editors"
	 * @generated
	 */
	EList<Book> getBooksEditorFor();

} // Editor
