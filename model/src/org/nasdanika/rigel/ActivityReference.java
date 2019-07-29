/**
 */
package org.nasdanika.rigel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * References a shared activity defined elsewhere.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.ActivityReference#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getActivityReference()
 * @model
 * @generated
 */
public interface ActivityReference extends PackageElement, Source, Target {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * By performing an activity participants produce outputs from inputs using resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see org.nasdanika.rigel.RigelPackage#getActivityReference_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.ActivityReference#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // ActivityReference
