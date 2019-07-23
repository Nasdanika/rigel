/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.nasdanika.rigel.Activity#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Activity#getParicipants <em>Paricipants</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Activity#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Activity#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Activity#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Activity#getTotalSize <em>Total Size</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Activity#getTotalProgress <em>Total Progress</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EngineeredElement, Source, Target {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.ActivityElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities can be composed from activity elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityElement> getElements();

	/**
	 * Returns the value of the '<em><b>Paricipants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Actor}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Actor#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more actors participate in completion of an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paricipants</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_Paricipants()
	 * @see org.nasdanika.rigel.Actor#getActivities
	 * @model opposite="activities"
	 * @generated
	 */
	EList<Actor> getParicipants();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Resource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Resource#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participants may use resources such as tools to complete an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_Resources()
	 * @see org.nasdanika.rigel.Resource#getUsers
	 * @model opposite="users"
	 * @generated
	 */
	EList<Resource> getResources();

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

	/**
	 * Returns the value of the '<em><b>Total Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sum of sizes of this activity and its children.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Size</em>' attribute.
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_TotalSize()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getTotalSize();

	/**
	 * Returns the value of the '<em><b>Total Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calculated total activity progress in percent. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Progress</em>' attribute.
	 * @see org.nasdanika.rigel.RigelPackage#getActivity_TotalProgress()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	int getTotalProgress();

} // Activity
