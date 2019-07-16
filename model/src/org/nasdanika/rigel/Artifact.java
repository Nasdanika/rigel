/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Artifact is something output/produced by a source and consumed by a target as input. For example - source code, user guide, binary code. Artifacts are passed between activities over transitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Artifact#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Artifact#getProducers <em>Producers</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Artifact#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Consumers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Target}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Target#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Targets consuming this artifact as their input.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consumers</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getArtifact_Consumers()
	 * @see org.nasdanika.rigel.Target#getInputs
	 * @model opposite="inputs"
	 * @generated
	 */
	EList<Target> getConsumers();

	/**
	 * Returns the value of the '<em><b>Producers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Source}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Source#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sources emitting this artifact as their output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Producers</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getArtifact_Producers()
	 * @see org.nasdanika.rigel.Source#getOutputs
	 * @model opposite="outputs"
	 * @generated
	 */
	EList<Source> getProducers();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts can be nested. E.g. a zip archive contains directories which contain files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getArtifact_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getChildren();

} // Artifact
