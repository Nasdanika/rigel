/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Source of transitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Source#getOutboundTransitions <em>Outbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Source#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getSource()
 * @model abstract="true"
 * @generated
 */
public interface Source extends ActivityElement {
	/**
	 * Returns the value of the '<em><b>Outbound Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outbound transitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outbound Transitions</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getSource_OutboundTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getOutboundTransitions();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Artifact}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Artifact#getProducers <em>Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts output/produced by this source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getSource_Outputs()
	 * @see org.nasdanika.rigel.Artifact#getProducers
	 * @model opposite="producers"
	 * @generated
	 */
	EList<Artifact> getOutputs();

} // Source
