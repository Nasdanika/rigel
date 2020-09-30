/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.AbstractComponent;
import org.nasdanika.party.ResourceCategoryElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of package elements. Packages are used to organize model elements into a hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Package#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends PackageElement, AbstractComponent, IPackage {

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.party.ResourceCategoryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource/document library.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getPackage_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceCategoryElement> getResources();

} // Package
