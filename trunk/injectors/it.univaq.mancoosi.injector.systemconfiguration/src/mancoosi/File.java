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
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.File#getExtension <em>Extension</em>}</li>
 *   <li>{@link mancoosi.File#getDescription <em>Description</em>}</li>
 *   <li>{@link mancoosi.File#getSize <em>Size</em>}</li>
 *   <li>{@link mancoosi.File#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link mancoosi.File#isIsDirectory <em>Is Directory</em>}</li>
 *   <li>{@link mancoosi.File#isSuid <em>Suid</em>}</li>
 *   <li>{@link mancoosi.File#isGuid <em>Guid</em>}</li>
 *   <li>{@link mancoosi.File#getPermission <em>Permission</em>}</li>
 *   <li>{@link mancoosi.File#getLocation <em>Location</em>}</li>
 *   <li>{@link mancoosi.File#getFs <em>Fs</em>}</li>
 *   <li>{@link mancoosi.File#getChilds <em>Childs</em>}</li>
 *   <li>{@link mancoosi.File#getParent <em>Parent</em>}</li>
 *   <li>{@link mancoosi.File#getOwner <em>Owner</em>}</li>
 *   <li>{@link mancoosi.File#getGroup <em>Group</em>}</li>
 *   <li>{@link mancoosi.File#isIsMissing <em>Is Missing</em>}</li>
 *   <li>{@link mancoosi.File#getPkgSettings <em>Pkg Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getFile()
 * @model
 * @generated
 */
public interface File extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see mancoosi.MancoosiPackage#getFile_Extension()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link mancoosi.File#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

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
	 * @see mancoosi.MancoosiPackage#getFile_Description()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mancoosi.File#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see mancoosi.MancoosiPackage#getFile_Size()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link mancoosi.File#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

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
	 * @see mancoosi.MancoosiPackage#getFile_CheckSum()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCheckSum();

	/**
	 * Sets the value of the '{@link mancoosi.File#getCheckSum <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Sum</em>' attribute.
	 * @see #getCheckSum()
	 * @generated
	 */
	void setCheckSum(String value);

	/**
	 * Returns the value of the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Directory</em>' attribute.
	 * @see #setIsDirectory(boolean)
	 * @see mancoosi.MancoosiPackage#getFile_IsDirectory()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDirectory();

	/**
	 * Sets the value of the '{@link mancoosi.File#isIsDirectory <em>Is Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Directory</em>' attribute.
	 * @see #isIsDirectory()
	 * @generated
	 */
	void setIsDirectory(boolean value);

	/**
	 * Returns the value of the '<em><b>Suid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suid</em>' attribute.
	 * @see #setSuid(boolean)
	 * @see mancoosi.MancoosiPackage#getFile_Suid()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isSuid();

	/**
	 * Sets the value of the '{@link mancoosi.File#isSuid <em>Suid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suid</em>' attribute.
	 * @see #isSuid()
	 * @generated
	 */
	void setSuid(boolean value);

	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(boolean)
	 * @see mancoosi.MancoosiPackage#getFile_Guid()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isGuid();

	/**
	 * Sets the value of the '{@link mancoosi.File#isGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #isGuid()
	 * @generated
	 */
	void setGuid(boolean value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see #setPermission(String)
	 * @see mancoosi.MancoosiPackage#getFile_Permission()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPermission();

	/**
	 * Sets the value of the '{@link mancoosi.File#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see mancoosi.MancoosiPackage#getFile_Location()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link mancoosi.File#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Fs</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.FileSystem#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fs</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fs</em>' container reference.
	 * @see #setFs(FileSystem)
	 * @see mancoosi.MancoosiPackage#getFile_Fs()
	 * @see mancoosi.FileSystem#getRoot
	 * @model opposite="root" required="true" transient="false" ordered="false"
	 * @generated
	 */
	FileSystem getFs();

	/**
	 * Sets the value of the '{@link mancoosi.File#getFs <em>Fs</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fs</em>' container reference.
	 * @see #getFs()
	 * @generated
	 */
	void setFs(FileSystem value);

	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * It is bidirectional and its opposite is '{@link mancoosi.File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getFile_Childs()
	 * @see mancoosi.File#getParent
	 * @model type="mancoosi.File" opposite="parent" containment="true" ordered="false"
	 * @generated
	 */
	EList getChilds();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.File#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(File)
	 * @see mancoosi.MancoosiPackage#getFile_Parent()
	 * @see mancoosi.File#getChilds
	 * @model opposite="childs" required="true" transient="false" ordered="false"
	 * @generated
	 */
	File getParent();

	/**
	 * Sets the value of the '{@link mancoosi.File#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(File value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(User)
	 * @see mancoosi.MancoosiPackage#getFile_Owner()
	 * @model required="true"
	 * @generated
	 */
	User getOwner();

	/**
	 * Sets the value of the '{@link mancoosi.File#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(User value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see mancoosi.MancoosiPackage#getFile_Group()
	 * @model required="true"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link mancoosi.File#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Is Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Missing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Missing</em>' attribute.
	 * @see #setIsMissing(boolean)
	 * @see mancoosi.MancoosiPackage#getFile_IsMissing()
	 * @model
	 * @generated
	 */
	boolean isIsMissing();

	/**
	 * Sets the value of the '{@link mancoosi.File#isIsMissing <em>Is Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Missing</em>' attribute.
	 * @see #isIsMissing()
	 * @generated
	 */
	void setIsMissing(boolean value);

	/**
	 * Returns the value of the '<em><b>Pkg Settings</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.PackageSetting}.
	 * It is bidirectional and its opposite is '{@link mancoosi.PackageSetting#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg Settings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg Settings</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getFile_PkgSettings()
	 * @see mancoosi.PackageSetting#getFiles
	 * @model type="mancoosi.PackageSetting" opposite="files"
	 * @generated
	 */
	EList getPkgSettings();

} // File
