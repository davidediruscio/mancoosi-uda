/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Python Modules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.UpdatePythonModules#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getUpdatePythonModules()
 * @model
 * @generated
 */
public interface UpdatePythonModules extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(File)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getUpdatePythonModules_File()
	 * @model containment="true"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.UpdatePythonModules#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

} // UpdatePythonModules
