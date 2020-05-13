/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element which can be contained by a package.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.PackageElement#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getPackageElement()
 * @model abstract="true"
 * @generated
 */
public interface PackageElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getPackageElement_Associations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getAssociations();

} // PackageElement
