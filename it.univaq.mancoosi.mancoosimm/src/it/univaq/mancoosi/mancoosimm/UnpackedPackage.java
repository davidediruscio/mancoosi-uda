/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unpacked Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getDescription <em>Description</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getSection <em>Section</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getTag <em>Tag</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getPriority <em>Priority</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getUploaders <em>Uploaders</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getUnpackedPackage()
 * @model
 * @generated
 */
public interface UnpackedPackage extends it.univaq.mancoosi.mancoosimm.Package {
	/**
	 * Returns the value of the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintainer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainer</em>' attribute.
	 * @see #setMaintainer(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getUnpackedPackage_Maintainer()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMaintainer();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getMaintainer <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainer</em>' attribute.
	 * @see #getMaintainer()
	 * @generated
	 */
	void setMaintainer(String value);

	/**
	 * Returns the value of the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Sum</em>' attribute.
	 * @see #setCheckSum(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getUnpackedPackage_CheckSum()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCheckSum();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getCheckSum <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Sum</em>' attribute.
	 * @see #getCheckSum()
	 * @generated
	 */
	void setCheckSum(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getUnpackedPackage_Description()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see #setSection(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getUnpackedPackage_Section()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getSection();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getUnpackedPackage_Tag()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.mancoosimm.PriorityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see it.univaq.mancoosi.mancoosimm.PriorityType
	 * @see #setPriority(PriorityType)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getUnpackedPackage_Priority()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	PriorityType getPriority();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see it.univaq.mancoosi.mancoosimm.PriorityType
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityType value);

	/**
	 * Returns the value of the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uploaders</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uploaders</em>' attribute.
	 * @see #setUploaders(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getUnpackedPackage_Uploaders()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getUploaders();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.UnpackedPackage#getUploaders <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploaders</em>' attribute.
	 * @see #getUploaders()
	 * @generated
	 */
	void setUploaders(String value);

	/**
	 * Returns the value of the '<em><b>Files</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getUnpackedPackage_Files()
	 * @model ordered="false"
	 * @generated
	 */
	EList<File> getFiles();

} // UnpackedPackage
