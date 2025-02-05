/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.MancoosiPackage;
import mancoosi.PostinstUsrlocal;
import mancoosi.StringParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Usrlocal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostinstUsrlocalImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstUsrlocalImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstUsrlocalImpl#getUser <em>User</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstUsrlocalImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstUsrlocalImpl extends UpdateFileSytemStatementImpl implements PostinstUsrlocal {
	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected StringParam dir;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected StringParam mode;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected StringParam user;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected StringParam group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstUsrlocalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostinstUsrlocal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getDir() {
		if (dir != null && dir.eIsProxy()) {
			InternalEObject oldDir = (InternalEObject)dir;
			dir = (StringParam)eResolveProxy(oldDir);
			if (dir != oldDir) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_USRLOCAL__DIR, oldDir, dir));
			}
		}
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(StringParam newDir) {
		StringParam oldDir = dir;
		dir = newDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_USRLOCAL__DIR, oldDir, dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (StringParam)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_USRLOCAL__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(StringParam newMode) {
		StringParam oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_USRLOCAL__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (StringParam)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_USRLOCAL__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(StringParam newUser) {
		StringParam oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_USRLOCAL__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (StringParam)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_USRLOCAL__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(StringParam newGroup) {
		StringParam oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_USRLOCAL__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_USRLOCAL__DIR:
				if (resolve) return getDir();
				return basicGetDir();
			case MancoosiPackage.POSTINST_USRLOCAL__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case MancoosiPackage.POSTINST_USRLOCAL__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case MancoosiPackage.POSTINST_USRLOCAL__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
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
			case MancoosiPackage.POSTINST_USRLOCAL__DIR:
				setDir((StringParam)newValue);
				return;
			case MancoosiPackage.POSTINST_USRLOCAL__MODE:
				setMode((StringParam)newValue);
				return;
			case MancoosiPackage.POSTINST_USRLOCAL__USER:
				setUser((StringParam)newValue);
				return;
			case MancoosiPackage.POSTINST_USRLOCAL__GROUP:
				setGroup((StringParam)newValue);
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
			case MancoosiPackage.POSTINST_USRLOCAL__DIR:
				setDir((StringParam)null);
				return;
			case MancoosiPackage.POSTINST_USRLOCAL__MODE:
				setMode((StringParam)null);
				return;
			case MancoosiPackage.POSTINST_USRLOCAL__USER:
				setUser((StringParam)null);
				return;
			case MancoosiPackage.POSTINST_USRLOCAL__GROUP:
				setGroup((StringParam)null);
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
			case MancoosiPackage.POSTINST_USRLOCAL__DIR:
				return dir != null;
			case MancoosiPackage.POSTINST_USRLOCAL__MODE:
				return mode != null;
			case MancoosiPackage.POSTINST_USRLOCAL__USER:
				return user != null;
			case MancoosiPackage.POSTINST_USRLOCAL__GROUP:
				return group != null;
		}
		return super.eIsSet(featureID);
	}

} //PostinstUsrlocalImpl
