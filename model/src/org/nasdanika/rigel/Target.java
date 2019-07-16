/**
 */
package org.nasdanika.rigel;


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
public interface Target extends ActivityElement {
	/**
	 * Returns the value of the '<em><b>Inbound Transitions</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inbound transitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound Transitions</em>' reference.
	 * @see #setInboundTransitions(Transition)
	 * @see org.nasdanika.rigel.RigelPackage#getTarget_InboundTransitions()
	 * @see org.nasdanika.rigel.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Transition getInboundTransitions();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Target#getInboundTransitions <em>Inbound Transitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Transitions</em>' reference.
	 * @see #getInboundTransitions()
	 * @generated
	 */
	void setInboundTransitions(Transition value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Artifact#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input artifacts consumed by this target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' reference.
	 * @see #setInputs(Artifact)
	 * @see org.nasdanika.rigel.RigelPackage#getTarget_Inputs()
	 * @see org.nasdanika.rigel.Artifact#getConsumers
	 * @model opposite="consumers"
	 * @generated
	 */
	Artifact getInputs();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Target#getInputs <em>Inputs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(Artifact value);

} // Target
