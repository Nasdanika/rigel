/**
 */
package org.nasdanika.rigel;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A milestone shows an important achievement in a flow. 
 * The milestones represent a sequence of events that incrementally build up until flow completion.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Milestone#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Milestone#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Milestone#getTargetDate <em>Target Date</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Milestone#isMissed <em>Missed</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends PackageElement, Source, Target {

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sum of size of all activities which need to be completed to reach this milestone from the start of the previous milestone(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see org.nasdanika.rigel.RigelPackage#getMilestone_Size()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getSize();

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calculated total progress toward achiveing the milestone in percent. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see org.nasdanika.rigel.RigelPackage#getMilestone_Progress()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	int getProgress();

	/**
	 * Returns the value of the '<em><b>Target Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Date</em>' attribute.
	 * @see #setTargetDate(Date)
	 * @see org.nasdanika.rigel.RigelPackage#getMilestone_TargetDate()
	 * @model
	 * @generated
	 */
	Date getTargetDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Milestone#getTargetDate <em>Target Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Date</em>' attribute.
	 * @see #getTargetDate()
	 * @generated
	 */
	void setTargetDate(Date value);

	/**
	 * Returns the value of the '<em><b>Missed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if target date is set, the current date is after the target date and progress is less than 100%
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Missed</em>' attribute.
	 * @see org.nasdanika.rigel.RigelPackage#getMilestone_Missed()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	boolean isMissed();
} // Milestone
