/**
 */
package comicBooks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comicBooks.Series#getSeriesName <em>Series Name</em>}</li>
 *   <li>{@link comicBooks.Series#getBooksInSeries <em>Books In Series</em>}</li>
 * </ul>
 * </p>
 *
 * @see comicBooks.ComicBooksPackage#getSeries()
 * @model
 * @generated
 */
public interface Series extends EObject {
	/**
	 * Returns the value of the '<em><b>Series Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Name</em>' attribute.
	 * @see #setSeriesName(String)
	 * @see comicBooks.ComicBooksPackage#getSeries_SeriesName()
	 * @model
	 * @generated
	 */
	String getSeriesName();

	/**
	 * Sets the value of the '{@link comicBooks.Series#getSeriesName <em>Series Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Name</em>' attribute.
	 * @see #getSeriesName()
	 * @generated
	 */
	void setSeriesName(String value);

	/**
	 * Returns the value of the '<em><b>Books In Series</b></em>' reference list.
	 * The list contents are of type {@link comicBooks.Book}.
	 * It is bidirectional and its opposite is '{@link comicBooks.Book#getSeriesPartOf <em>Series Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Books In Series</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Books In Series</em>' reference list.
	 * @see comicBooks.ComicBooksPackage#getSeries_BooksInSeries()
	 * @see comicBooks.Book#getSeriesPartOf
	 * @model opposite="seriesPartOf"
	 * @generated
	 */
	EList<Book> getBooksInSeries();

} // Series
