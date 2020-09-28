/**
 */
package org.nasdanika.rigel;

import org.nasdanika.engineering.AbstractComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * By performing an activity participants produce outputs from inputs using resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Activity#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Activity#getProgress <em>Progress</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Flow, Source, Target, AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity size in some unit used by all activities. For example - hours, points, dollars.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_Size()
	 * @model
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Activity#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activity progress in percent. Value between 0 and 100. Progress can be used in "instance" models which are used to model and track execution of an actual effort as opposed to "template" models which explain steps to complete an effort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(int)
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_Progress()
	 * @model
	 * @generated
	 */
	int getProgress();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Activity#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(int value);

} // Activity
