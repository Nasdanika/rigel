/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target of transitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Target#getInboundTransitions <em>Inbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Target#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getTarget()
 * @model abstract="true"
 * @generated
 */
public interface Target extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Inbound Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Transition}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inbound transitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound Transitions</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getTarget_InboundTransitions()
	 * @see org.nasdanika.rigel.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getInboundTransitions();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input artifacts consumed by this target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getTarget_Inputs()
	 * @model
	 * @generated
	 */
	EList<Artifact> getInputs();

} // Target
