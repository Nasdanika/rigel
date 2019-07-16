/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of top level model elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Package#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends PackageElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.PackageElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getPackage_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageElement> getElement();

} // Package
