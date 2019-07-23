/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineered Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for elements which have an owning engineer and may contain issues.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.EngineeredElement#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.rigel.EngineeredElement#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getEngineeredElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EngineeredElement extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Engineer#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer responsible for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Engineer)
	 * @see org.nasdanika.rigel.RigelPackage#getEngineeredElement_Owner()
	 * @see org.nasdanika.rigel.Engineer#getOwns
	 * @model opposite="owns"
	 * @generated
	 */
	Engineer getOwner();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.EngineeredElement#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Engineer value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues associated with the element - problems/pain points, improvement opportunities/enhancements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getEngineeredElement_Issues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

} // EngineeredElement
