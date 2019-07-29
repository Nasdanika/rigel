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
 *        annotation="urn:org.nasdanika label_ru='\u0426\u0435\u043b\u044c' documentation_ru='\u0426\u0435\u043b\u044c \u043f\u0435\u0440\u0435\u0445\u043e\u0434\u0430'"
 * @generated
 */
public interface Target extends ActivityElement {
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
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Artifact#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input artifacts consumed by this target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getTarget_Inputs()
	 * @see org.nasdanika.rigel.Artifact#getConsumers
	 * @model opposite="consumers"
	 * @generated
	 */
	EList<Artifact> getInputs();

} // Target
