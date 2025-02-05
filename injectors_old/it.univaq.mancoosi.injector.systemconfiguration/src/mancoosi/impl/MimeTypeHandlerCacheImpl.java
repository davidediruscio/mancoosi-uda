/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.Environment;
import mancoosi.MancoosiPackage;
import mancoosi.MimeType;
import mancoosi.MimeTypeHandler;
import mancoosi.MimeTypeHandlerCache;

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
 * An implementation of the model object '<em><b>Mime Type Handler Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.MimeTypeHandlerCacheImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link mancoosi.impl.MimeTypeHandlerCacheImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link mancoosi.impl.MimeTypeHandlerCacheImpl#getMimeTypes <em>Mime Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MimeTypeHandlerCacheImpl extends EObjectImpl implements MimeTypeHandlerCache {
	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList handlers;

	/**
	 * The cached value of the '{@link #getMimeTypes() <em>Mime Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypes()
	 * @generated
	 * @ordered
	 */
	protected EList mimeTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MimeTypeHandlerCacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getMimeTypeHandlerCache();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnv() {
		if (eContainerFeatureID() != MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV) return null;
		return (Environment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnv(Environment newEnv, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnv, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(Environment newEnv) {
		if (newEnv != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV && newEnv != null)) {
			if (EcoreUtil.isAncestor(this, newEnv))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnv != null)
				msgs = ((InternalEObject)newEnv).eInverseAdd(this, MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE, Environment.class, msgs);
			msgs = basicSetEnv(newEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV, newEnv, newEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentWithInverseEList(MimeTypeHandler.class, this, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__HANDLERS, MancoosiPackage.MIME_TYPE_HANDLER__CACHE);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMimeTypes() {
		if (mimeTypes == null) {
			mimeTypes = new EObjectContainmentWithInverseEList(MimeType.class, this, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__MIME_TYPES, MancoosiPackage.MIME_TYPE__CACHE);
		}
		return mimeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnv((Environment)otherEnd, msgs);
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__HANDLERS:
				return ((InternalEList)getHandlers()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__MIME_TYPES:
				return ((InternalEList)getMimeTypes()).basicAdd(otherEnd, msgs);
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
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV:
				return basicSetEnv(null, msgs);
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__HANDLERS:
				return ((InternalEList)getHandlers()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__MIME_TYPES:
				return ((InternalEList)getMimeTypes()).basicRemove(otherEnd, msgs);
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
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.ENVIRONMENT__MIME_TYPE_HANDLER_CACHE, Environment.class, msgs);
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
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV:
				return getEnv();
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__HANDLERS:
				return getHandlers();
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__MIME_TYPES:
				return getMimeTypes();
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
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV:
				setEnv((Environment)newValue);
				return;
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection)newValue);
				return;
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__MIME_TYPES:
				getMimeTypes().clear();
				getMimeTypes().addAll((Collection)newValue);
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
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV:
				setEnv((Environment)null);
				return;
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__HANDLERS:
				getHandlers().clear();
				return;
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__MIME_TYPES:
				getMimeTypes().clear();
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
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__ENV:
				return getEnv() != null;
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE__MIME_TYPES:
				return mimeTypes != null && !mimeTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MimeTypeHandlerCacheImpl
