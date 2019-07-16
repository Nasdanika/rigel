/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.nasdanika.rigel.Resource#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Resource#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Resource#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Activity}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Activity#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities using/leveraging this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getResource_Users()
	 * @see org.nasdanika.rigel.Activity#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	EList<Activity> getUsers();

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

} // Resource
