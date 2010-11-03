/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerm Init Norestart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PrermInitNorestart#getScriptParam <em>Script Param</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PrermInitNorestart#getErrorHandler <em>Error Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPrermInitNorestart()
 * @model
 * @generated
 */
public interface PrermInitNorestart extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Script Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Param</em>' containment reference.
	 * @see #setScriptParam(Script)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPrermInitNorestart_ScriptParam()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Script getScriptParam();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PrermInitNorestart#getScriptParam <em>Script Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Param</em>' containment reference.
	 * @see #getScriptParam()
	 * @generated
	 */
	void setScriptParam(Script value);

	/**
	 * Returns the value of the '<em><b>Error Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Handler</em>' containment reference.
	 * @see #setErrorHandler(Statement)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPrermInitNorestart_ErrorHandler()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Statement getErrorHandler();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PrermInitNorestart#getErrorHandler <em>Error Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handler</em>' containment reference.
	 * @see #getErrorHandler()
	 * @generated
	 */
	void setErrorHandler(Statement value);

} // PrermInitNorestart
