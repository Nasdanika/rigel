/**
 */
package org.nasdanika.rigel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * References a shared repository defined elsewhere.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.RepositoryReference#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getRepositoryReference()
 * @model
 * @generated
 */
public interface RepositoryReference extends PackageElement, Source, Target {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * By performing an activity participants produce outputs from inputs using resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see org.nasdanika.rigel.RigelPackage#getRepositoryReference_Repository()
	 * @model annotation="urn:org.nasdanika label_ru='\u0420\u0430\u0431\u043e\u0442\u0430' documentation_ru='\u0412\u044b\u043f\u043e\u043b\u043d\u044f\u044f \u0440\u0430\u0431\u043e\u0442\u0443 \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u0438 \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u044f\u0442 \u0438\u0441\u0445\u043e\u0434\u044f\u0449\u0438\u0435 (\u0446\u0435\u043b\u0435\u0432\u044b\u0435) \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044f \u0432\u0445\u043e\u0434\u044f\u0449\u0438\u0435 \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b \u0438 \u0440\u0435\u0441\u0443\u0440\u0441\u044b.'"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.RepositoryReference#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // RepositoryReference
