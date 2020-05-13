/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract container of package elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.IPackage#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getIPackage()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.PackageElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getIPackage_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<PackageElement> getElements();

} // IPackage
