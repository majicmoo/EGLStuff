/**
 */
package comicBooks.impl;

import comicBooks.Artist;
import comicBooks.Book;
import comicBooks.ComicBooksPackage;

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
 * An implementation of the model object '<em><b>Artist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comicBooks.impl.ArtistImpl#getName <em>Name</em>}</li>
 *   <li>{@link comicBooks.impl.ArtistImpl#getBooksArtistFor <em>Books Artist For</em>}</li>
 *   <li>{@link comicBooks.impl.ArtistImpl#getBooksCoverArtistFor <em>Books Cover Artist For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtistImpl extends MinimalEObjectImpl.Container implements Artist {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooksArtistFor() <em>Books Artist For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooksArtistFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> booksArtistFor;

	/**
	 * The cached value of the '{@link #getBooksCoverArtistFor() <em>Books Cover Artist For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooksCoverArtistFor()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> booksCoverArtistFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComicBooksPackage.Literals.ARTIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComicBooksPackage.ARTIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooksArtistFor() {
		if (booksArtistFor == null) {
			booksArtistFor = new EObjectWithInverseResolvingEList.ManyInverse<Book>(Book.class, this, ComicBooksPackage.ARTIST__BOOKS_ARTIST_FOR, ComicBooksPackage.BOOK__ARTISTS);
		}
		return booksArtistFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooksCoverArtistFor() {
		if (booksCoverArtistFor == null) {
			booksCoverArtistFor = new EObjectWithInverseResolvingEList<Book>(Book.class, this, ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR, ComicBooksPackage.BOOK__COVER_ARTIST);
		}
		return booksCoverArtistFor;
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
			case ComicBooksPackage.ARTIST__BOOKS_ARTIST_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooksArtistFor()).basicAdd(otherEnd, msgs);
			case ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBooksCoverArtistFor()).basicAdd(otherEnd, msgs);
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
			case ComicBooksPackage.ARTIST__BOOKS_ARTIST_FOR:
				return ((InternalEList<?>)getBooksArtistFor()).basicRemove(otherEnd, msgs);
			case ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR:
				return ((InternalEList<?>)getBooksCoverArtistFor()).basicRemove(otherEnd, msgs);
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
			case ComicBooksPackage.ARTIST__NAME:
				return getName();
			case ComicBooksPackage.ARTIST__BOOKS_ARTIST_FOR:
				return getBooksArtistFor();
			case ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR:
				return getBooksCoverArtistFor();
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
			case ComicBooksPackage.ARTIST__NAME:
				setName((String)newValue);
				return;
			case ComicBooksPackage.ARTIST__BOOKS_ARTIST_FOR:
				getBooksArtistFor().clear();
				getBooksArtistFor().addAll((Collection<? extends Book>)newValue);
				return;
			case ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR:
				getBooksCoverArtistFor().clear();
				getBooksCoverArtistFor().addAll((Collection<? extends Book>)newValue);
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
			case ComicBooksPackage.ARTIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComicBooksPackage.ARTIST__BOOKS_ARTIST_FOR:
				getBooksArtistFor().clear();
				return;
			case ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR:
				getBooksCoverArtistFor().clear();
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
			case ComicBooksPackage.ARTIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComicBooksPackage.ARTIST__BOOKS_ARTIST_FOR:
				return booksArtistFor != null && !booksArtistFor.isEmpty();
			case ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR:
				return booksCoverArtistFor != null && !booksCoverArtistFor.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArtistImpl
