/**
 */
package org.nasdanika.rigel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.rigel.Actor;
import org.nasdanika.rigel.Capability;
import org.nasdanika.rigel.Engineer;
import org.nasdanika.rigel.Flow;
import org.nasdanika.rigel.FlowElement;
import org.nasdanika.rigel.Issue;
import org.nasdanika.rigel.Requirement;
import org.nasdanika.rigel.RigelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getRequiredCapabilities <em>Required Capabilities</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getParicipants <em>Paricipants</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowImpl extends PackageElementImpl implements Flow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RigelPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer getOwner() {
		return (Engineer)eDynamicGet(RigelPackage.FLOW__OWNER, RigelPackage.Literals.ENGINEERED_ELEMENT__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetOwner() {
		return (Engineer)eDynamicGet(RigelPackage.FLOW__OWNER, RigelPackage.Literals.ENGINEERED_ELEMENT__OWNER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Engineer newOwner, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOwner, RigelPackage.FLOW__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Engineer newOwner) {
		eDynamicSet(RigelPackage.FLOW__OWNER, RigelPackage.Literals.ENGINEERED_ELEMENT__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(RigelPackage.FLOW__ISSUES, RigelPackage.Literals.ENGINEERED_ELEMENT__ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Capability> getRequiredCapabilities() {
		return (EList<Capability>)eDynamicGet(RigelPackage.FLOW__REQUIRED_CAPABILITIES, RigelPackage.Literals.REQUIREMENT__REQUIRED_CAPABILITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FlowElement> getElements() {
		return (EList<FlowElement>)eDynamicGet(RigelPackage.FLOW__ELEMENTS, RigelPackage.Literals.FLOW__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Actor> getParicipants() {
		return (EList<Actor>)eDynamicGet(RigelPackage.FLOW__PARICIPANTS, RigelPackage.Literals.FLOW__PARICIPANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RigelPackage.FLOW__OWNER:
				Engineer owner = basicGetOwner();
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, RigelPackage.ENGINEER__OWNS, Engineer.class, msgs);
				return basicSetOwner((Engineer)otherEnd, msgs);
			case RigelPackage.FLOW__REQUIRED_CAPABILITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredCapabilities()).basicAdd(otherEnd, msgs);
			case RigelPackage.FLOW__PARICIPANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParicipants()).basicAdd(otherEnd, msgs);
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
			case RigelPackage.FLOW__OWNER:
				return basicSetOwner(null, msgs);
			case RigelPackage.FLOW__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case RigelPackage.FLOW__REQUIRED_CAPABILITIES:
				return ((InternalEList<?>)getRequiredCapabilities()).basicRemove(otherEnd, msgs);
			case RigelPackage.FLOW__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case RigelPackage.FLOW__PARICIPANTS:
				return ((InternalEList<?>)getParicipants()).basicRemove(otherEnd, msgs);
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
			case RigelPackage.FLOW__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case RigelPackage.FLOW__ISSUES:
				return getIssues();
			case RigelPackage.FLOW__REQUIRED_CAPABILITIES:
				return getRequiredCapabilities();
			case RigelPackage.FLOW__ELEMENTS:
				return getElements();
			case RigelPackage.FLOW__PARICIPANTS:
				return getParicipants();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RigelPackage.FLOW__OWNER:
				setOwner((Engineer)newValue);
				return;
			case RigelPackage.FLOW__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case RigelPackage.FLOW__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				getRequiredCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case RigelPackage.FLOW__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends FlowElement>)newValue);
				return;
			case RigelPackage.FLOW__PARICIPANTS:
				getParicipants().clear();
				getParicipants().addAll((Collection<? extends Actor>)newValue);
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
			case RigelPackage.FLOW__OWNER:
				setOwner((Engineer)null);
				return;
			case RigelPackage.FLOW__ISSUES:
				getIssues().clear();
				return;
			case RigelPackage.FLOW__REQUIRED_CAPABILITIES:
				getRequiredCapabilities().clear();
				return;
			case RigelPackage.FLOW__ELEMENTS:
				getElements().clear();
				return;
			case RigelPackage.FLOW__PARICIPANTS:
				getParicipants().clear();
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
			case RigelPackage.FLOW__OWNER:
				return basicGetOwner() != null;
			case RigelPackage.FLOW__ISSUES:
				return !getIssues().isEmpty();
			case RigelPackage.FLOW__REQUIRED_CAPABILITIES:
				return !getRequiredCapabilities().isEmpty();
			case RigelPackage.FLOW__ELEMENTS:
				return !getElements().isEmpty();
			case RigelPackage.FLOW__PARICIPANTS:
				return !getParicipants().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Requirement.class) {
			switch (derivedFeatureID) {
				case RigelPackage.FLOW__REQUIRED_CAPABILITIES: return RigelPackage.REQUIREMENT__REQUIRED_CAPABILITIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Requirement.class) {
			switch (baseFeatureID) {
				case RigelPackage.REQUIREMENT__REQUIRED_CAPABILITIES: return RigelPackage.FLOW__REQUIRED_CAPABILITIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FlowImpl
