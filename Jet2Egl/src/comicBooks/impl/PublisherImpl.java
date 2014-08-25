/**
 */
package comicBooks.impl;

import comicBooks.Book;
import comicBooks.ComicBooksPackage;
import comicBooks.Publisher;

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
 * An implementation of the model object '<em><b>Publisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comicBooks.impl.PublisherImpl#getPublishersName <em>Publishers Name</em>}</li>
 *   <li>{@link comicBooks.impl.PublisherImpl#getBooksPublished <em>Books Published</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublisherImpl extends MinimalEObjectImpl.Container implements Publisher {
	/**
	 * The default value of the '{@link #getPublishersName() <em>Publishers Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishersName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHERS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublishersName() <em>Publishers Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishersName()
	 * @generated
	 * @ordered
	 */
	protected String publishersName = PUBLISHERS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooksPublished() <em>Books Published</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooksPublished()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> booksPublished;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComicBooksPackage.Literals.PUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublishersName() {
		return publishersName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishersName(String newPublishersName) {
		String oldPublishersName = publishersName;
		publishersName = newPublishersName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComicBooksPackage.PUBLISHER__PUBLISHERS_NAME, oldPublishersName, publishersName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooksPublished() {
		if (booksPublished == null) {
			booksPublished = new EObjectWithInverseResolvingEList<Book>(Book.class, this, ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED, ComicBooksPackage.BOOK__PUBLISHER);
		}
		return booksPublished;
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
			case ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooksPublished()).basicAdd(otherEnd, msgs);
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
			case ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED:
				return ((InternalEList<?>)getBooksPublished()).basicRemove(otherEnd, msgs);
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
			case ComicBooksPackage.PUBLISHER__PUBLISHERS_NAME:
				return getPublishersName();
			case ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED:
				return getBooksPublished();
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
			case ComicBooksPackage.PUBLISHER__PUBLISHERS_NAME:
				setPublishersName((String)newValue);
				return;
			case ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED:
				getBooksPublished().clear();
				getBooksPublished().addAll((Collection<? extends Book>)newValue);
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
			case ComicBooksPackage.PUBLISHER__PUBLISHERS_NAME:
				setPublishersName(PUBLISHERS_NAME_EDEFAULT);
				return;
			case ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED:
				getBooksPublished().clear();
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
			case ComicBooksPackage.PUBLISHER__PUBLISHERS_NAME:
				return PUBLISHERS_NAME_EDEFAULT == null ? publishersName != null : !PUBLISHERS_NAME_EDEFAULT.equals(publishersName);
			case ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED:
				return booksPublished != null && !booksPublished.isEmpty();
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
		result.append(" (publishersName: ");
		result.append(publishersName);
		result.append(')');
		return result.toString();
	}

} //PublisherImpl
