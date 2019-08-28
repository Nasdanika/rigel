/**
 */
package org.nasdanika.rigel;

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
 * @model annotation="urn:org.nasdanika label_ru='\u0420\u0430\u0431\u043e\u0442\u0430' documentation_ru='\u0420\u0430\u0431\u043e\u0442\u0430 - \u044d\u0442\u043e \u0442\u043e, \u0447\u0442\u043e \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u0434\u043b\u044f \u043f\u043e\u043b\u0443\u0447\u0435\u043d\u0438\u044f \u0436\u0435\u043b\u0430\u0435\u043c\u043e\u0433\u043e \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u0430. \n\n\u0412\u044b\u043f\u043e\u043b\u043d\u044f\u044f \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c \u043f\u043e\u043b\u0443\u0447\u0430\u0435\u0442 \u0432\u0445\u043e\u0434\u044f\u0449\u0438\u0435 \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442 \u0440\u0435\u0441\u0443\u0440\u0441\u044b \u0438 \u0441\u043e\u0437\u0434\u0430\u0451\u0442 \u0438\u0441\u0445\u043e\u0434\u044f\u0449\u0438\u0435 \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b, \u044f\u0432\u043b\u044f\u044e\u0449\u0438\u0435\u0441\u044f \u043f\u0440\u043e\u043c\u0435\u0436\u0443\u0442\u043e\u0447\u043d\u044b\u043c\u0438 \u0438\u043b\u0438 \u043a\u043e\u043d\u0435\u0447\u043d\u044b\u043c\u0438 \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u0430\u043c\u0438 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u0430.\n\n\u0412\u0430\u0440\u0438\u0430\u043d\u0442\u044b \u043f\u0435\u0440\u0435\u0432\u043e\u0434\u0430:\n\n\n* \u0414\u0435\u0439\u0441\u0442\u0432\u0438\u0435 / \u042d\u043b\u0435\u043c\u0435\u043d\u0442\u0430\u0440\u043d\u043e\u0435 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435\n* \u041f\u0440\u043e\u0446\u0435\u0441\u0441/\u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f\n* \u0420\u0430\u0431\u043e\u0442\u0430 / \u041e\u043f\u0435\u0440\u0430\u0446\u0438\u044f '"
 * @generated
 */
public interface Activity extends Flow, Source, Target {
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
	 * @model annotation="urn:org.nasdanika label_ru='\u0420\u0430\u0437\u043c\u0435\u0440' documentation_ru='\u041e\u0446\u0435\u043d\u043a\u0430 \u0440\u0430\u0431\u043e\u0442\u044b / \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u0432 \u043a\u0430\u043a\u0438\u0445-\u043b\u0438\u0431\u043e \u0435\u0434\u0438\u043d\u0438\u0446\u0430\u0445: \u0442\u0440\u0443\u0434\u043e-\u0447\u0430\u0441\u0430\u0445, \u043f\u0440\u0438\u0441\u0435\u0441\u0442\u0430\u0445, \u0434\u0435\u043d\u044c\u0433\u0430\u0445.'"
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
	 * @model annotation="urn:org.nasdanika label_ru='\u041f\u0440\u043e\u0433\u0440\u0435\u0441\u0441' documentation_ru='\u041e\u0446\u0435\u043d\u043a\u0430 \u0441\u0442\u0435\u043f\u0435\u043d\u0438 \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u0440\u0430\u0431\u043e\u0442\u044b/ \u043e\u043f\u0435\u0440\u0430\u0446\u0438\u0438 \u0432 \u043f\u0440\u043e\u0446\u0435\u043d\u0442\u0430\u0445. \u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435 \u043c\u0435\u0436\u0434\u0443 0 \u0438 100. \n\n\n\u041f\u0440\u043e\u0433\u0440\u0435\u0441\u0441 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d \u0434\u043b\u044f \u043e\u0446\u0435\u043d\u043a\u0438 \u043f\u0440\u0430\u043a\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u0440\u0430\u0431\u043e\u0447\u0435\u0433\u043e \u043f\u043e\u0442\u043e\u043a\u0430. \n\n\u0414\u043b\u044f \u044d\u0442\u043e\u0433\u043e \u043d\u0430 \u043e\u0441\u043d\u043e\u0432\u0430\u043d\u0438\u0438 \u0441\u043c\u043e\u0434\u0435\u043b\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u043e\u0433\u043e \u0448\u0430\u0431\u043b\u043e\u043d\u0430, \u043e\u043f\u0438\u0441\u044b\u0432\u0430\u044e\u0449\u0435\u0433\u043e \u044d\u0442\u0430\u043f\u044b \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u0440\u0430\u0431\u043e\u0442\u044b \u0441\u043e\u0437\u0434\u0430\u0435\u0442\u0441\u044f \"\u0414\u0435\u0439\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u0439 \u044d\u043a\u0437\u0435\u043c\u043f\u043b\u044f\u0440\" \u0440\u0430\u0431\u043e\u0447\u0435\u0433\u043e \u043f\u043e\u0442\u043e\u043a\u0430, \u0432 \u043a\u043e\u0442\u043e\u0440\u043e\u043c \u043e\u0446\u0435\u043d\u0438\u0432\u0430\u044e\u0442\u0441\u044f \u0444\u0430\u043a\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0435 \u0437\u0430\u0442\u0440\u0430\u0442\u044b \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u043e\u0432, \u043c\u0430\u0442\u0435\u0440\u0438\u0430\u043b\u043e\u0432, \u0440\u0435\u0441\u0443\u0440\u0441\u043e\u0432 \u0438 \u043f\u0440\u043e\u0433\u0440\u0435\u0441\u0441 \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f. \n\n'"
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
