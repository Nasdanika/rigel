/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * By performing an activity participants produce outputs from inputs using resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Activity#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Activity#getParicipants <em>Paricipants</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Activity#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends PackageElement, Source, Target {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.ActivityElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities can be composed from activity elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityElement> getElements();

	/**
	 * Returns the value of the '<em><b>Paricipants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Actor}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Actor#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more actors participate in completion of an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paricipants</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_Paricipants()
	 * @see org.nasdanika.rigel.Actor#getActivities
	 * @model opposite="activities"
	 * @generated
	 */
	EList<Actor> getParicipants();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Resource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Resource#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants may use resources such as tools to complete an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_Resources()
	 * @see org.nasdanika.rigel.Resource#getUsers
	 * @model opposite="users"
	 * @generated
	 */
	EList<Resource> getResources();

} // Activity
