/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Engineers own engineered elements and are assigned issues associated with these elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Engineer#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Engineer#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getEngineer()
 * @model
 * @generated
 */
public interface Engineer extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Owns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.EngineeredElement}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.EngineeredElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements which this engineer owns. Ownership is propagated down to child elements recursively, unless these elements have an explicitly assigned owner. Also issues associated with owned elements and not having an engineer explicitly assigned to them are implicitly assigned to the element owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owns</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getEngineer_Owns()
	 * @see org.nasdanika.rigel.EngineeredElement#getOwner
	 * @model opposite="owner"
	 * @generated
	 */
	EList<EngineeredElement> getOwns();

	/**
	 * Returns the value of the '<em><b>Assignments</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Issue}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Issue#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer's assigned issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assignments</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getEngineer_Assignments()
	 * @see org.nasdanika.rigel.Issue#getAssignedTo
	 * @model opposite="assignedTo"
	 * @generated
	 */
	EList<Issue> getAssignments();

} // Engineer
