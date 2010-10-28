/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.Environment;
import mancoosi.File;
import mancoosi.LibraryCache;
import mancoosi.MancoosiPackage;
import mancoosi.SharedLibrary;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.LibraryCacheImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link mancoosi.impl.LibraryCacheImpl#getSharedLibraries <em>Shared Libraries</em>}</li>
 *   <li>{@link mancoosi.impl.LibraryCacheImpl#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryCacheImpl extends EObjectImpl implements LibraryCache {
	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList locations;

	/**
	 * The cached value of the '{@link #getSharedLibraries() <em>Shared Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList sharedLibraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryCacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getLibraryCache();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList(File.class, this, MancoosiPackage.LIBRARY_CACHE__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSharedLibraries() {
		if (sharedLibraries == null) {
			sharedLibraries = new EObjectContainmentWithInverseEList(SharedLibrary.class, this, MancoosiPackage.LIBRARY_CACHE__SHARED_LIBRARIES, MancoosiPackage.SHARED_LIBRARY__LIBRARY_CACHE);
		}
		return sharedLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnv() {
		if (eContainerFeatureID() != MancoosiPackage.LIBRARY_CACHE__ENV) return null;
		return (Environment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnv(Environment newEnv, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnv, MancoosiPackage.LIBRARY_CACHE__ENV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(Environment newEnv) {
		if (newEnv != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.LIBRARY_CACHE__ENV && newEnv != null)) {
			if (EcoreUtil.isAncestor(this, newEnv))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnv != null)
				msgs = ((InternalEObject)newEnv).eInverseAdd(this, MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE, Environment.class, msgs);
			msgs = basicSetEnv(newEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.LIBRARY_CACHE__ENV, newEnv, newEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.LIBRARY_CACHE__SHARED_LIBRARIES:
				return ((InternalEList)getSharedLibraries()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.LIBRARY_CACHE__ENV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnv((Environment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.LIBRARY_CACHE__SHARED_LIBRARIES:
				return ((InternalEList)getSharedLibraries()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.LIBRARY_CACHE__ENV:
				return basicSetEnv(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MancoosiPackage.LIBRARY_CACHE__ENV:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.ENVIRONMENT__LIBRARY_CACHE, Environment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.LIBRARY_CACHE__LOCATIONS:
				return getLocations();
			case MancoosiPackage.LIBRARY_CACHE__SHARED_LIBRARIES:
				return getSharedLibraries();
			case MancoosiPackage.LIBRARY_CACHE__ENV:
				return getEnv();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.LIBRARY_CACHE__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection)newValue);
				return;
			case MancoosiPackage.LIBRARY_CACHE__SHARED_LIBRARIES:
				getSharedLibraries().clear();
				getSharedLibraries().addAll((Collection)newValue);
				return;
			case MancoosiPackage.LIBRARY_CACHE__ENV:
				setEnv((Environment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MancoosiPackage.LIBRARY_CACHE__LOCATIONS:
				getLocations().clear();
				return;
			case MancoosiPackage.LIBRARY_CACHE__SHARED_LIBRARIES:
				getSharedLibraries().clear();
				return;
			case MancoosiPackage.LIBRARY_CACHE__ENV:
				setEnv((Environment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.LIBRARY_CACHE__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case MancoosiPackage.LIBRARY_CACHE__SHARED_LIBRARIES:
				return sharedLibraries != null && !sharedLibraries.isEmpty();
			case MancoosiPackage.LIBRARY_CACHE__ENV:
				return getEnv() != null;
		}
		return super.eIsSet(featureID);
	}

} //LibraryCacheImpl
