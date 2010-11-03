/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.PostinstModules;
import it.univaq.mancoosi.packagemm.StringParam;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Modules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstModulesImpl#getKvers <em>Kvers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstModulesImpl extends UpdateEnvironmentStatementImpl implements PostinstModules {
	/**
	 * The cached value of the '{@link #getKvers() <em>Kvers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKvers()
	 * @generated
	 * @ordered
	 */
	protected StringParam kvers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstModulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPostinstModules();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getKvers() {
		return kvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKvers(StringParam newKvers, NotificationChain msgs) {
		StringParam oldKvers = kvers;
		kvers = newKvers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_MODULES__KVERS, oldKvers, newKvers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKvers(StringParam newKvers) {
		if (newKvers != kvers) {
			NotificationChain msgs = null;
			if (kvers != null)
				msgs = ((InternalEObject)kvers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_MODULES__KVERS, null, msgs);
			if (newKvers != null)
				msgs = ((InternalEObject)newKvers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_MODULES__KVERS, null, msgs);
			msgs = basicSetKvers(newKvers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_MODULES__KVERS, newKvers, newKvers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.POSTINST_MODULES__KVERS:
				return basicSetKvers(null, msgs);
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
			case PackagemmPackage.POSTINST_MODULES__KVERS:
				return getKvers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PackagemmPackage.POSTINST_MODULES__KVERS:
				setKvers((StringParam)newValue);
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
			case PackagemmPackage.POSTINST_MODULES__KVERS:
				setKvers((StringParam)null);
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
			case PackagemmPackage.POSTINST_MODULES__KVERS:
				return kvers != null;
		}
		return super.eIsSet(featureID);
	}

} //PostinstModulesImpl
