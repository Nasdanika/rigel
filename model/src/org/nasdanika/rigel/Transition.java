/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transition from its containing source element to a target element. May pass artifacts in both directions. E.g. a transition to "Commit code" may take "Source code" as input and return "Commit ID" as a result.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Transition#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Transition#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Target#getInboundTransitions <em>Inbound Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transition target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Target)
	 * @see org.nasdanika.rigel.RigelPackage#getTransition_Target()
	 * @see org.nasdanika.rigel.Target#getInboundTransitions
	 * @model opposite="inboundTransitions" required="true"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts passed by the source to the transition and delivered to the target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getTransition_Inputs()
	 * @model
	 * @generated
	 */
	EList<Artifact> getInputs();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts returned by the target to be delivered to the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Results</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getTransition_Results()
	 * @model
	 * @generated
	 */
	EList<Artifact> getResults();

} // Transition
