/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Actors perform activities using resources consuming and producing artifacts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Actor#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Activity}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Activity#getParicipants <em>Paricipants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities in which this actor participates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getActor_Activities()
	 * @see org.nasdanika.rigel.Activity#getParicipants
	 * @model opposite="paricipants"
	 * @generated
	 */
	EList<Activity> getActivities();

} // Actor
