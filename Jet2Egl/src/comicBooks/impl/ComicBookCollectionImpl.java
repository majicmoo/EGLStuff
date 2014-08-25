/**
 */
package comicBooks.impl;

import comicBooks.Artist;
import comicBooks.Book;
import comicBooks.ComicBookCollection;
import comicBooks.ComicBooksPackage;
import comicBooks.Editor;
import comicBooks.Publisher;
import comicBooks.Series;
import comicBooks.Writer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comic Book Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comicBooks.impl.ComicBookCollectionImpl#getBooks <em>Books</em>}</li>
 *   <li>{@link comicBooks.impl.ComicBookCollectionImpl#getArtists <em>Artists</em>}</li>
 *   <li>{@link comicBooks.impl.ComicBookCollectionImpl#getEditors <em>Editors</em>}</li>
 *   <li>{@link comicBooks.impl.ComicBookCollectionImpl#getWriters <em>Writers</em>}</li>
 *   <li>{@link comicBooks.impl.ComicBookCollectionImpl#getPublishingCompanies <em>Publishing Companies</em>}</li>
 *   <li>{@link comicBooks.impl.ComicBookCollectionImpl#getSeries <em>Series</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComicBookCollectionImpl extends MinimalEObjectImpl.Container implements ComicBookCollection {
	/**
	 * The cached value of the '{@link #getBooks() <em>Books</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> books;

	/**
	 * The cached value of the '{@link #getArtists() <em>Artists</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtists()
	 * @generated
	 * @ordered
	 */
	protected EList<Artist> artists;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<Editor> editors;

	/**
	 * The cached value of the '{@link #getWriters() <em>Writers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriters()
	 * @generated
	 * @ordered
	 */
	protected EList<Writer> writers;

	/**
	 * The cached value of the '{@link #getPublishingCompanies() <em>Publishing Companies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingCompanies()
	 * @generated
	 * @ordered
	 */
	protected EList<Publisher> publishingCompanies;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<Series> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComicBookCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComicBooksPackage.Literals.COMIC_BOOK_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooks() {
		if (books == null) {
			books = new EObjectContainmentEList<Book>(Book.class, this, ComicBooksPackage.COMIC_BOOK_COLLECTION__BOOKS);
		}
		return books;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artist> getArtists() {
		if (artists == null) {
			artists = new EObjectContainmentEList<Artist>(Artist.class, this, ComicBooksPackage.COMIC_BOOK_COLLECTION__ARTISTS);
		}
		return artists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Editor> getEditors() {
		if (editors == null) {
			editors = new EObjectContainmentEList<Editor>(Editor.class, this, ComicBooksPackage.COMIC_BOOK_COLLECTION__EDITORS);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Writer> getWriters() {
		if (writers == null) {
			writers = new EObjectContainmentEList<Writer>(Writer.class, this, ComicBooksPackage.COMIC_BOOK_COLLECTION__WRITERS);
		}
		return writers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publisher> getPublishingCompanies() {
		if (publishingCompanies == null) {
			publishingCompanies = new EObjectContainmentEList<Publisher>(Publisher.class, this, ComicBooksPackage.COMIC_BOOK_COLLECTION__PUBLISHING_COMPANIES);
		}
		return publishingCompanies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Series> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<Series>(Series.class, this, ComicBooksPackage.COMIC_BOOK_COLLECTION__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__BOOKS:
				return ((InternalEList<?>)getBooks()).basicRemove(otherEnd, msgs);
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__ARTISTS:
				return ((InternalEList<?>)getArtists()).basicRemove(otherEnd, msgs);
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__EDITORS:
				return ((InternalEList<?>)getEditors()).basicRemove(otherEnd, msgs);
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__WRITERS:
				return ((InternalEList<?>)getWriters()).basicRemove(otherEnd, msgs);
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__PUBLISHING_COMPANIES:
				return ((InternalEList<?>)getPublishingCompanies()).basicRemove(otherEnd, msgs);
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
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
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__BOOKS:
				return getBooks();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__ARTISTS:
				return getArtists();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__EDITORS:
				return getEditors();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__WRITERS:
				return getWriters();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__PUBLISHING_COMPANIES:
				return getPublishingCompanies();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__SERIES:
				return getSeries();
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
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__BOOKS:
				getBooks().clear();
				getBooks().addAll((Collection<? extends Book>)newValue);
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__ARTISTS:
				getArtists().clear();
				getArtists().addAll((Collection<? extends Artist>)newValue);
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__EDITORS:
				getEditors().clear();
				getEditors().addAll((Collection<? extends Editor>)newValue);
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__WRITERS:
				getWriters().clear();
				getWriters().addAll((Collection<? extends Writer>)newValue);
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__PUBLISHING_COMPANIES:
				getPublishingCompanies().clear();
				getPublishingCompanies().addAll((Collection<? extends Publisher>)newValue);
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends Series>)newValue);
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
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__BOOKS:
				getBooks().clear();
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__ARTISTS:
				getArtists().clear();
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__EDITORS:
				getEditors().clear();
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__WRITERS:
				getWriters().clear();
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__PUBLISHING_COMPANIES:
				getPublishingCompanies().clear();
				return;
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__SERIES:
				getSeries().clear();
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
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__BOOKS:
				return books != null && !books.isEmpty();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__ARTISTS:
				return artists != null && !artists.isEmpty();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__EDITORS:
				return editors != null && !editors.isEmpty();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__WRITERS:
				return writers != null && !writers.isEmpty();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__PUBLISHING_COMPANIES:
				return publishingCompanies != null && !publishingCompanies.isEmpty();
			case ComicBooksPackage.COMIC_BOOK_COLLECTION__SERIES:
				return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComicBookCollectionImpl
