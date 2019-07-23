/**
 */
package org.nasdanika.rigel.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.rigel.Engineer;
import org.nasdanika.rigel.Issue;
import org.nasdanika.rigel.IssueImportance;
import org.nasdanika.rigel.IssueStatus;
import org.nasdanika.rigel.RigelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.impl.IssueImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.IssueImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.IssueImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends ModelElementImpl implements Issue {
	/**
	 * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected static final IssueImportance IMPORTANCE_EDEFAULT = IssueImportance.MEDIUM;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final IssueStatus STATUS_EDEFAULT = IssueStatus.OPEN;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RigelPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueImportance getImportance() {
		return (IssueImportance)eDynamicGet(RigelPackage.ISSUE__IMPORTANCE, RigelPackage.Literals.ISSUE__IMPORTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportance(IssueImportance newImportance) {
		eDynamicSet(RigelPackage.ISSUE__IMPORTANCE, RigelPackage.Literals.ISSUE__IMPORTANCE, newImportance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueStatus getStatus() {
		return (IssueStatus)eDynamicGet(RigelPackage.ISSUE__STATUS, RigelPackage.Literals.ISSUE__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(IssueStatus newStatus) {
		eDynamicSet(RigelPackage.ISSUE__STATUS, RigelPackage.Literals.ISSUE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer getAssignedTo() {
		return (Engineer)eDynamicGet(RigelPackage.ISSUE__ASSIGNED_TO, RigelPackage.Literals.ISSUE__ASSIGNED_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetAssignedTo() {
		return (Engineer)eDynamicGet(RigelPackage.ISSUE__ASSIGNED_TO, RigelPackage.Literals.ISSUE__ASSIGNED_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedTo(Engineer newAssignedTo, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAssignedTo, RigelPackage.ISSUE__ASSIGNED_TO, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedTo(Engineer newAssignedTo) {
		eDynamicSet(RigelPackage.ISSUE__ASSIGNED_TO, RigelPackage.Literals.ISSUE__ASSIGNED_TO, newAssignedTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSize() {
		return (Double)eDynamicGet(RigelPackage.ISSUE__SIZE, RigelPackage.Literals.ISSUE__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(double newSize) {
		eDynamicSet(RigelPackage.ISSUE__SIZE, RigelPackage.Literals.ISSUE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RigelPackage.ISSUE__ASSIGNED_TO:
				Engineer assignedTo = basicGetAssignedTo();
				if (assignedTo != null)
					msgs = ((InternalEObject)assignedTo).eInverseRemove(this, RigelPackage.ENGINEER__ASSIGNMENTS, Engineer.class, msgs);
				return basicSetAssignedTo((Engineer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RigelPackage.ISSUE__ASSIGNED_TO:
				return basicSetAssignedTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RigelPackage.ISSUE__IMPORTANCE:
				return getImportance();
			case RigelPackage.ISSUE__STATUS:
				return getStatus();
			case RigelPackage.ISSUE__ASSIGNED_TO:
				if (resolve) return getAssignedTo();
				return basicGetAssignedTo();
			case RigelPackage.ISSUE__SIZE:
				return getSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RigelPackage.ISSUE__IMPORTANCE:
				setImportance((IssueImportance)newValue);
				return;
			case RigelPackage.ISSUE__STATUS:
				setStatus((IssueStatus)newValue);
				return;
			case RigelPackage.ISSUE__ASSIGNED_TO:
				setAssignedTo((Engineer)newValue);
				return;
			case RigelPackage.ISSUE__SIZE:
				setSize((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RigelPackage.ISSUE__IMPORTANCE:
				setImportance(IMPORTANCE_EDEFAULT);
				return;
			case RigelPackage.ISSUE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case RigelPackage.ISSUE__ASSIGNED_TO:
				setAssignedTo((Engineer)null);
				return;
			case RigelPackage.ISSUE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RigelPackage.ISSUE__IMPORTANCE:
				return getImportance() != IMPORTANCE_EDEFAULT;
			case RigelPackage.ISSUE__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case RigelPackage.ISSUE__ASSIGNED_TO:
				return basicGetAssignedTo() != null;
			case RigelPackage.ISSUE__SIZE:
				return getSize() != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //IssueImpl