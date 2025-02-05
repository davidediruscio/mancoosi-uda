/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Wm Noman</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstWmNoman#getWm <em>Wm</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstWmNoman#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstWmNoman()
 * @model
 * @generated
 */
public interface PostinstWmNoman extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Wm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wm</em>' containment reference.
	 * @see #setWm(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstWmNoman_Wm()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getWm();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstWmNoman#getWm <em>Wm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wm</em>' containment reference.
	 * @see #getWm()
	 * @generated
	 */
	void setWm(StringParam value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstWmNoman_Priority()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getPriority();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstWmNoman#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(StringParam value);

} // PostinstWmNoman
