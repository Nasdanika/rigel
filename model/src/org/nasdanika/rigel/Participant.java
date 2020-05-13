/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Participant#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getParticipant()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Flows</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Flow}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Flow#getParicipants <em>Paricipants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities in which this actor participates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flows</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getParticipant_Flows()
	 * @see org.nasdanika.rigel.Flow#getParicipants
	 * @model opposite="paricipants"
	 * @generated
	 */
	EList<Flow> getFlows();

} // Participant
