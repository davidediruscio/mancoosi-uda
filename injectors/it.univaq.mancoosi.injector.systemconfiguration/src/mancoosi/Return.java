/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Return#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends ControlStatement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link mancoosi.ReturnStatementValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see mancoosi.ReturnStatementValue
	 * @see #setValue(ReturnStatementValue)
	 * @see mancoosi.MancoosiPackage#getReturn_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ReturnStatementValue getValue();

	/**
	 * Sets the value of the '{@link mancoosi.Return#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see mancoosi.ReturnStatementValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ReturnStatementValue value);

} // Return
