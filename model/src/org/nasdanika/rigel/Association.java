/**
 */
package org.nasdanika.rigel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generic relationship between model elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Association#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PackageElement)
	 * @see org.nasdanika.rigel.RigelPackage#getAssociation_Target()
	 * @model required="true"
	 * @generated
	 */
	PackageElement getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Association#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PackageElement value);

} // Association
