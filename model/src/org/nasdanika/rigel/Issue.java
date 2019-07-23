/**
 */
package org.nasdanika.rigel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something to possibly act on regarding the owning element - a problem/pain point, an improvement opportunity/enhancement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Issue#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Issue#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Issue#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Importance</b></em>' attribute.
	 * The default value is <code>"Medium"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.rigel.IssueImportance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue importance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importance</em>' attribute.
	 * @see org.nasdanika.rigel.IssueImportance
	 * @see #setImportance(IssueImportance)
	 * @see org.nasdanika.rigel.RigelPackage#getIssue_Importance()
	 * @model default="Medium"
	 * @generated
	 */
	IssueImportance getImportance();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Issue#getImportance <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance</em>' attribute.
	 * @see org.nasdanika.rigel.IssueImportance
	 * @see #getImportance()
	 * @generated
	 */
	void setImportance(IssueImportance value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"Open"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.rigel.IssueStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.rigel.IssueStatus
	 * @see #setStatus(IssueStatus)
	 * @see org.nasdanika.rigel.RigelPackage#getIssue_Status()
	 * @model default="Open"
	 * @generated
	 */
	IssueStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Issue#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.rigel.IssueStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IssueStatus value);

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Engineer#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engineer this issue is assigned to. If this attribute is null the issue is assumed to be assigned to the owner of the containing element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference.
	 * @see #setAssignedTo(Engineer)
	 * @see org.nasdanika.rigel.RigelPackage#getIssue_AssignedTo()
	 * @see org.nasdanika.rigel.Engineer#getAssignments
	 * @model opposite="assignments"
	 * @generated
	 */
	Engineer getAssignedTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Issue#getAssignedTo <em>Assigned To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned To</em>' reference.
	 * @see #getAssignedTo()
	 * @generated
	 */
	void setAssignedTo(Engineer value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An estimation of effort required to complete this issue in some units used consistently throughout the model - points, person hours, dollars.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see org.nasdanika.rigel.RigelPackage#getIssue_Size()
	 * @model
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.rigel.Issue#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

} // Issue
