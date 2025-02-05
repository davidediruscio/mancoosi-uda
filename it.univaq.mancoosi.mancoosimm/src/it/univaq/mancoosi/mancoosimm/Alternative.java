/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Alternative#getCurrent <em>Current</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Alternative#getLocation <em>Location</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Alternative#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(File)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getAlternative_Current()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getCurrent();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Alternative#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(File value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(File)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getAlternative_Location()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getLocation();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Alternative#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(File value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Environment#getAlternatives <em>Alternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getAlternative_Env()
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getAlternatives
	 * @model opposite="alternatives" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Alternative#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

} // Alternative
