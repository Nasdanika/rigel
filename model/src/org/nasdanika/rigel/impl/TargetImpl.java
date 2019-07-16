/**
 */
package org.nasdanika.rigel.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.rigel.Artifact;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.rigel.Target;
import org.nasdanika.rigel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.impl.TargetImpl#getInboundTransitions <em>Inbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.TargetImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TargetImpl extends ActivityElementImpl implements Target {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RigelPackage.Literals.TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getInboundTransitions() {
		return (Transition)eDynamicGet(RigelPackage.TARGET__INBOUND_TRANSITIONS, RigelPackage.Literals.TARGET__INBOUND_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetInboundTransitions() {
		return (Transition)eDynamicGet(RigelPackage.TARGET__INBOUND_TRANSITIONS, RigelPackage.Literals.TARGET__INBOUND_TRANSITIONS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInboundTransitions(Transition newInboundTransitions, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInboundTransitions, RigelPackage.TARGET__INBOUND_TRANSITIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInboundTransitions(Transition newInboundTransitions) {
		eDynamicSet(RigelPackage.TARGET__INBOUND_TRANSITIONS, RigelPackage.Literals.TARGET__INBOUND_TRANSITIONS, newInboundTransitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getInputs() {
		return (Artifact)eDynamicGet(RigelPackage.TARGET__INPUTS, RigelPackage.Literals.TARGET__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetInputs() {
		return (Artifact)eDynamicGet(RigelPackage.TARGET__INPUTS, RigelPackage.Literals.TARGET__INPUTS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(Artifact newInputs, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInputs, RigelPackage.TARGET__INPUTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputs(Artifact newInputs) {
		eDynamicSet(RigelPackage.TARGET__INPUTS, RigelPackage.Literals.TARGET__INPUTS, newInputs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RigelPackage.TARGET__INBOUND_TRANSITIONS:
				Transition inboundTransitions = basicGetInboundTransitions();
				if (inboundTransitions != null)
					msgs = ((InternalEObject)inboundTransitions).eInverseRemove(this, RigelPackage.TRANSITION__TARGET, Transition.class, msgs);
				return basicSetInboundTransitions((Transition)otherEnd, msgs);
			case RigelPackage.TARGET__INPUTS:
				Artifact inputs = basicGetInputs();
				if (inputs != null)
					msgs = ((InternalEObject)inputs).eInverseRemove(this, RigelPackage.ARTIFACT__CONSUMERS, Artifact.class, msgs);
				return basicSetInputs((Artifact)otherEnd, msgs);
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
			case RigelPackage.TARGET__INBOUND_TRANSITIONS:
				return basicSetInboundTransitions(null, msgs);
			case RigelPackage.TARGET__INPUTS:
				return basicSetInputs(null, msgs);
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
			case RigelPackage.TARGET__INBOUND_TRANSITIONS:
				if (resolve) return getInboundTransitions();
				return basicGetInboundTransitions();
			case RigelPackage.TARGET__INPUTS:
				if (resolve) return getInputs();
				return basicGetInputs();
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
			case RigelPackage.TARGET__INBOUND_TRANSITIONS:
				setInboundTransitions((Transition)newValue);
				return;
			case RigelPackage.TARGET__INPUTS:
				setInputs((Artifact)newValue);
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
			case RigelPackage.TARGET__INBOUND_TRANSITIONS:
				setInboundTransitions((Transition)null);
				return;
			case RigelPackage.TARGET__INPUTS:
				setInputs((Artifact)null);
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
			case RigelPackage.TARGET__INBOUND_TRANSITIONS:
				return basicGetInboundTransitions() != null;
			case RigelPackage.TARGET__INPUTS:
				return basicGetInputs() != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetImpl
