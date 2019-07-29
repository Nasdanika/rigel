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
 * Container of package elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Package#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getPackage()
 * @model annotation="urn:org.nasdanika label_ru='\u041f\u0430\u043a\u0435\u0442' documentation_ru='\u041f\u0430\u043a\u0435\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u043c\u043e\u0434\u0435\u043b\u0438.'"
 * @generated
 */
public interface Package extends EngineeredElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.PackageElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getPackage_Elements()
	 * @model containment="true"
	 *        annotation="urn:org.nasdanika label_ru='\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u043f\u0430\u043a\u0435\u0442\u0430' documentation_ru='\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u043f\u0430\u043a\u0435\u0442\u0430'"
	 * @generated
	 */
	EList<PackageElement> getElements();

} // Package
