/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Gconf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstGconf#getSchemas <em>Schemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstGconf()
 * @model
 * @generated
 */
public interface PostinstGconf extends UpdatePackageSettingStatement {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPostinstGconf_Schemas()
	 * @model type="mancoosi.File" required="true" ordered="false"
	 * @generated
	 */
	EList getSchemas();

} // PostinstGconf
