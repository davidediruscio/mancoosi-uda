/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstScript#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstScript()
 * @model
 * @generated
 */
public interface PostinstScript extends Script {
	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.Package#getPostinstScript <em>Postinst Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' container reference.
	 * @see #setPkg(it.univaq.mancoosi.packagemm.Package)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstScript_Pkg()
	 * @see it.univaq.mancoosi.packagemm.Package#getPostinstScript
	 * @model opposite="PostinstScript" required="true" transient="false" ordered="false"
	 * @generated
	 */
	it.univaq.mancoosi.packagemm.Package getPkg();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstScript#getPkg <em>Pkg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' container reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(it.univaq.mancoosi.packagemm.Package value);

} // PostinstScript
