/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.party.Role;

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
 *   <li>{@link org.nasdanika.rigel.Actor#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends PackageElement, Participant {

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.party.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping or actors to roles in the organization model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getActor_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

} // Actor
