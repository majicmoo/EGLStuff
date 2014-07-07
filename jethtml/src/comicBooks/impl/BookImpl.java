/**
 */
package comicBooks.impl;

import comicBooks.Artist;
import comicBooks.Book;
import comicBooks.ComicBooksPackage;
import comicBooks.Editor;
import comicBooks.Publisher;
import comicBooks.Series;
import comicBooks.Writer;

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
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comicBooks.impl.BookImpl#getName <em>Name</em>}</li>
 *   <li>{@link comicBooks.impl.BookImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link comicBooks.impl.BookImpl#getArtists <em>Artists</em>}</li>
 *   <li>{@link comicBooks.impl.BookImpl#getEditors <em>Editors</em>}</li>
 *   <li>{@link comicBooks.impl.BookImpl#getWriters <em>Writers</em>}</li>
 *   <li>{@link comicBooks.impl.BookImpl#getCoverArtist <em>Cover Artist</em>}</li>
 *   <li>{@link comicBooks.impl.BookImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link comicBooks.impl.BookImpl#getSeriesPartOf <em>Series Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookImpl extends MinimalEObjectImpl.Container implements Book {
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
	 * The default value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected String publicationDate = PUBLICATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtists() <em>Artists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtists()
	 * @generated
	 * @ordered
	 */
	protected EList<Artist> artists;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<Editor> editors;

	/**
	 * The cached value of the '{@link #getWriters() <em>Writers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriters()
	 * @generated
	 * @ordered
	 */
	protected EList<Writer> writers;

	/**
	 * The cached value of the '{@link #getCoverArtist() <em>Cover Artist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverArtist()
	 * @generated
	 * @ordered
	 */
	protected Artist coverArtist;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Publisher publisher;

	/**
	 * The cached value of the '{@link #getSeriesPartOf() <em>Series Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesPartOf()
	 * @generated
	 * @ordered
	 */
	protected Series seriesPartOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComicBooksPackage.Literals.BOOK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComicBooksPackage.BOOK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDate(String newPublicationDate) {
		String oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComicBooksPackage.BOOK__PUBLICATION_DATE, oldPublicationDate, publicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artist> getArtists() {
		if (artists == null) {
			artists = new EObjectWithInverseResolvingEList.ManyInverse<Artist>(Artist.class, this, ComicBooksPackage.BOOK__ARTISTS, ComicBooksPackage.ARTIST__BOOKS_ARTIST_FOR);
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
			editors = new EObjectWithInverseResolvingEList.ManyInverse<Editor>(Editor.class, this, ComicBooksPackage.BOOK__EDITORS, ComicBooksPackage.EDITOR__BOOKS_EDITOR_FOR);
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
			writers = new EObjectWithInverseResolvingEList.ManyInverse<Writer>(Writer.class, this, ComicBooksPackage.BOOK__WRITERS, ComicBooksPackage.WRITER__BOOKS_WRITER_FOR);
		}
		return writers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist getCoverArtist() {
		if (coverArtist != null && coverArtist.eIsProxy()) {
			InternalEObject oldCoverArtist = (InternalEObject)coverArtist;
			coverArtist = (Artist)eResolveProxy(oldCoverArtist);
			if (coverArtist != oldCoverArtist) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComicBooksPackage.BOOK__COVER_ARTIST, oldCoverArtist, coverArtist));
			}
		}
		return coverArtist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist basicGetCoverArtist() {
		return coverArtist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverArtist(Artist newCoverArtist, NotificationChain msgs) {
		Artist oldCoverArtist = coverArtist;
		coverArtist = newCoverArtist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComicBooksPackage.BOOK__COVER_ARTIST, oldCoverArtist, newCoverArtist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverArtist(Artist newCoverArtist) {
		if (newCoverArtist != coverArtist) {
			NotificationChain msgs = null;
			if (coverArtist != null)
				msgs = ((InternalEObject)coverArtist).eInverseRemove(this, ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR, Artist.class, msgs);
			if (newCoverArtist != null)
				msgs = ((InternalEObject)newCoverArtist).eInverseAdd(this, ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR, Artist.class, msgs);
			msgs = basicSetCoverArtist(newCoverArtist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComicBooksPackage.BOOK__COVER_ARTIST, newCoverArtist, newCoverArtist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (Publisher)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComicBooksPackage.BOOK__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(Publisher newPublisher, NotificationChain msgs) {
		Publisher oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComicBooksPackage.BOOK__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Publisher newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED, Publisher.class, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED, Publisher.class, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComicBooksPackage.BOOK__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Series getSeriesPartOf() {
		if (seriesPartOf != null && seriesPartOf.eIsProxy()) {
			InternalEObject oldSeriesPartOf = (InternalEObject)seriesPartOf;
			seriesPartOf = (Series)eResolveProxy(oldSeriesPartOf);
			if (seriesPartOf != oldSeriesPartOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComicBooksPackage.BOOK__SERIES_PART_OF, oldSeriesPartOf, seriesPartOf));
			}
		}
		return seriesPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Series basicGetSeriesPartOf() {
		return seriesPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesPartOf(Series newSeriesPartOf, NotificationChain msgs) {
		Series oldSeriesPartOf = seriesPartOf;
		seriesPartOf = newSeriesPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComicBooksPackage.BOOK__SERIES_PART_OF, oldSeriesPartOf, newSeriesPartOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesPartOf(Series newSeriesPartOf) {
		if (newSeriesPartOf != seriesPartOf) {
			NotificationChain msgs = null;
			if (seriesPartOf != null)
				msgs = ((InternalEObject)seriesPartOf).eInverseRemove(this, ComicBooksPackage.SERIES__BOOKS_IN_SERIES, Series.class, msgs);
			if (newSeriesPartOf != null)
				msgs = ((InternalEObject)newSeriesPartOf).eInverseAdd(this, ComicBooksPackage.SERIES__BOOKS_IN_SERIES, Series.class, msgs);
			msgs = basicSetSeriesPartOf(newSeriesPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComicBooksPackage.BOOK__SERIES_PART_OF, newSeriesPartOf, newSeriesPartOf));
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
			case ComicBooksPackage.BOOK__ARTISTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArtists()).basicAdd(otherEnd, msgs);
			case ComicBooksPackage.BOOK__EDITORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEditors()).basicAdd(otherEnd, msgs);
			case ComicBooksPackage.BOOK__WRITERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWriters()).basicAdd(otherEnd, msgs);
			case ComicBooksPackage.BOOK__COVER_ARTIST:
				if (coverArtist != null)
					msgs = ((InternalEObject)coverArtist).eInverseRemove(this, ComicBooksPackage.ARTIST__BOOKS_COVER_ARTIST_FOR, Artist.class, msgs);
				return basicSetCoverArtist((Artist)otherEnd, msgs);
			case ComicBooksPackage.BOOK__PUBLISHER:
				if (publisher != null)
					msgs = ((InternalEObject)publisher).eInverseRemove(this, ComicBooksPackage.PUBLISHER__BOOKS_PUBLISHED, Publisher.class, msgs);
				return basicSetPublisher((Publisher)otherEnd, msgs);
			case ComicBooksPackage.BOOK__SERIES_PART_OF:
				if (seriesPartOf != null)
					msgs = ((InternalEObject)seriesPartOf).eInverseRemove(this, ComicBooksPackage.SERIES__BOOKS_IN_SERIES, Series.class, msgs);
				return basicSetSeriesPartOf((Series)otherEnd, msgs);
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
			case ComicBooksPackage.BOOK__ARTISTS:
				return ((InternalEList<?>)getArtists()).basicRemove(otherEnd, msgs);
			case ComicBooksPackage.BOOK__EDITORS:
				return ((InternalEList<?>)getEditors()).basicRemove(otherEnd, msgs);
			case ComicBooksPackage.BOOK__WRITERS:
				return ((InternalEList<?>)getWriters()).basicRemove(otherEnd, msgs);
			case ComicBooksPackage.BOOK__COVER_ARTIST:
				return basicSetCoverArtist(null, msgs);
			case ComicBooksPackage.BOOK__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case ComicBooksPackage.BOOK__SERIES_PART_OF:
				return basicSetSeriesPartOf(null, msgs);
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
			case ComicBooksPackage.BOOK__NAME:
				return getName();
			case ComicBooksPackage.BOOK__PUBLICATION_DATE:
				return getPublicationDate();
			case ComicBooksPackage.BOOK__ARTISTS:
				return getArtists();
			case ComicBooksPackage.BOOK__EDITORS:
				return getEditors();
			case ComicBooksPackage.BOOK__WRITERS:
				return getWriters();
			case ComicBooksPackage.BOOK__COVER_ARTIST:
				if (resolve) return getCoverArtist();
				return basicGetCoverArtist();
			case ComicBooksPackage.BOOK__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case ComicBooksPackage.BOOK__SERIES_PART_OF:
				if (resolve) return getSeriesPartOf();
				return basicGetSeriesPartOf();
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
			case ComicBooksPackage.BOOK__NAME:
				setName((String)newValue);
				return;
			case ComicBooksPackage.BOOK__PUBLICATION_DATE:
				setPublicationDate((String)newValue);
				return;
			case ComicBooksPackage.BOOK__ARTISTS:
				getArtists().clear();
				getArtists().addAll((Collection<? extends Artist>)newValue);
				return;
			case ComicBooksPackage.BOOK__EDITORS:
				getEditors().clear();
				getEditors().addAll((Collection<? extends Editor>)newValue);
				return;
			case ComicBooksPackage.BOOK__WRITERS:
				getWriters().clear();
				getWriters().addAll((Collection<? extends Writer>)newValue);
				return;
			case ComicBooksPackage.BOOK__COVER_ARTIST:
				setCoverArtist((Artist)newValue);
				return;
			case ComicBooksPackage.BOOK__PUBLISHER:
				setPublisher((Publisher)newValue);
				return;
			case ComicBooksPackage.BOOK__SERIES_PART_OF:
				setSeriesPartOf((Series)newValue);
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
			case ComicBooksPackage.BOOK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComicBooksPackage.BOOK__PUBLICATION_DATE:
				setPublicationDate(PUBLICATION_DATE_EDEFAULT);
				return;
			case ComicBooksPackage.BOOK__ARTISTS:
				getArtists().clear();
				return;
			case ComicBooksPackage.BOOK__EDITORS:
				getEditors().clear();
				return;
			case ComicBooksPackage.BOOK__WRITERS:
				getWriters().clear();
				return;
			case ComicBooksPackage.BOOK__COVER_ARTIST:
				setCoverArtist((Artist)null);
				return;
			case ComicBooksPackage.BOOK__PUBLISHER:
				setPublisher((Publisher)null);
				return;
			case ComicBooksPackage.BOOK__SERIES_PART_OF:
				setSeriesPartOf((Series)null);
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
			case ComicBooksPackage.BOOK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComicBooksPackage.BOOK__PUBLICATION_DATE:
				return PUBLICATION_DATE_EDEFAULT == null ? publicationDate != null : !PUBLICATION_DATE_EDEFAULT.equals(publicationDate);
			case ComicBooksPackage.BOOK__ARTISTS:
				return artists != null && !artists.isEmpty();
			case ComicBooksPackage.BOOK__EDITORS:
				return editors != null && !editors.isEmpty();
			case ComicBooksPackage.BOOK__WRITERS:
				return writers != null && !writers.isEmpty();
			case ComicBooksPackage.BOOK__COVER_ARTIST:
				return coverArtist != null;
			case ComicBooksPackage.BOOK__PUBLISHER:
				return publisher != null;
			case ComicBooksPackage.BOOK__SERIES_PART_OF:
				return seriesPartOf != null;
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
		result.append(", publicationDate: ");
		result.append(publicationDate);
		result.append(')');
		return result.toString();
	}

} //BookImpl
