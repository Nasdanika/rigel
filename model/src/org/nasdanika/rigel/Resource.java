/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.Release;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something leveraged by an actor to perform an activity. For example - a tool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Resource#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Resource#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Resource#getRelease <em>Release</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource can be nested. E.g. a virtual machine may host a web server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getResource_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getChildren();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resources may host artifacts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getResource_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource may be a release of a product. For example, resource IDE may reference release 2020-09 of product Eclipse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see #setRelease(Release)
	 * @see org.nasdanika.rigel.RigelPackage#getResource_Release()
	 * @model
	 * @generated
	 */
	Release getRelease();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Resource#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(Release value);

} // Resource
