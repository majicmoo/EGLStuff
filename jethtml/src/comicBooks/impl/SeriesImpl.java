/**
 */
package comicBooks.impl;

import comicBooks.Book;
import comicBooks.ComicBooksPackage;
import comicBooks.Series;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comicBooks.impl.SeriesImpl#getSeriesName <em>Series Name</em>}</li>
 *   <li>{@link comicBooks.impl.SeriesImpl#getBooksInSeries <em>Books In Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeriesImpl extends MinimalEObjectImpl.Container implements Series {
	/**
	 * The default value of the '{@link #getSeriesName() <em>Series Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIES_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeriesName() <em>Series Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesName()
	 * @generated
	 * @ordered
	 */
	protected String seriesName = SERIES_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooksInSeries() <em>Books In Series</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooksInSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> booksInSeries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComicBooksPackage.Literals.SERIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeriesName() {
		return seriesName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesName(String newSeriesName) {
		String oldSeriesName = seriesName;
		seriesName = newSeriesName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComicBooksPackage.SERIES__SERIES_NAME, oldSeriesName, seriesName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooksInSeries() {
		if (booksInSeries == null) {
			booksInSeries = new EObjectWithInverseResolvingEList<Book>(Book.class, this, ComicBooksPackage.SERIES__BOOKS_IN_SERIES, ComicBooksPackage.BOOK__SERIES_PART_OF);
		}
		return booksInSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComicBooksPackage.SERIES__BOOKS_IN_SERIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooksInSeries()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComicBooksPackage.SERIES__BOOKS_IN_SERIES:
				return ((InternalEList<?>)getBooksInSeries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComicBooksPackage.SERIES__SERIES_NAME:
				return getSeriesName();
			case ComicBooksPackage.SERIES__BOOKS_IN_SERIES:
				return getBooksInSeries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComicBooksPackage.SERIES__SERIES_NAME:
				setSeriesName((String)newValue);
				return;
			case ComicBooksPackage.SERIES__BOOKS_IN_SERIES:
				getBooksInSeries().clear();
				getBooksInSeries().addAll((Collection<? extends Book>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComicBooksPackage.SERIES__SERIES_NAME:
				setSeriesName(SERIES_NAME_EDEFAULT);
				return;
			case ComicBooksPackage.SERIES__BOOKS_IN_SERIES:
				getBooksInSeries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComicBooksPackage.SERIES__SERIES_NAME:
				return SERIES_NAME_EDEFAULT == null ? seriesName != null : !SERIES_NAME_EDEFAULT.equals(seriesName);
			case ComicBooksPackage.SERIES__BOOKS_IN_SERIES:
				return booksInSeries != null && !booksInSeries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (seriesName: ");
		result.append(seriesName);
		result.append(')');
		return result.toString();
	}

} //SeriesImpl
