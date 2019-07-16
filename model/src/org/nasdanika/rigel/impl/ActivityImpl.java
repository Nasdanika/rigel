/**
 */
package org.nasdanika.rigel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.rigel.Activity;
import org.nasdanika.rigel.ActivityElement;
import org.nasdanika.rigel.Actor;
import org.nasdanika.rigel.Artifact;
import org.nasdanika.rigel.Resource;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.rigel.Source;
import org.nasdanika.rigel.Target;
import org.nasdanika.rigel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getOutboundTransitions <em>Outbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getInboundTransitions <em>Inbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getParicipants <em>Paricipants</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends PackageElementImpl implements Activity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RigelPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutboundTransitions() {
		return (EList<Transition>)eDynamicGet(RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS, RigelPackage.Literals.SOURCE__OUTBOUND_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getOutputs() {
		return (EList<Artifact>)eDynamicGet(RigelPackage.ACTIVITY__OUTPUTS, RigelPackage.Literals.SOURCE__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getInboundTransitions() {
		return (Transition)eDynamicGet(RigelPackage.ACTIVITY__INBOUND_TRANSITIONS, RigelPackage.Literals.TARGET__INBOUND_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetInboundTransitions() {
		return (Transition)eDynamicGet(RigelPackage.ACTIVITY__INBOUND_TRANSITIONS, RigelPackage.Literals.TARGET__INBOUND_TRANSITIONS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInboundTransitions(Transition newInboundTransitions, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInboundTransitions, RigelPackage.ACTIVITY__INBOUND_TRANSITIONS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInboundTransitions(Transition newInboundTransitions) {
		eDynamicSet(RigelPackage.ACTIVITY__INBOUND_TRANSITIONS, RigelPackage.Literals.TARGET__INBOUND_TRANSITIONS, newInboundTransitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact getInputs() {
		return (Artifact)eDynamicGet(RigelPackage.ACTIVITY__INPUTS, RigelPackage.Literals.TARGET__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetInputs() {
		return (Artifact)eDynamicGet(RigelPackage.ACTIVITY__INPUTS, RigelPackage.Literals.TARGET__INPUTS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(Artifact newInputs, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newInputs, RigelPackage.ACTIVITY__INPUTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputs(Artifact newInputs) {
		eDynamicSet(RigelPackage.ACTIVITY__INPUTS, RigelPackage.Literals.TARGET__INPUTS, newInputs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ActivityElement> getElements() {
		return (EList<ActivityElement>)eDynamicGet(RigelPackage.ACTIVITY__ELEMENTS, RigelPackage.Literals.ACTIVITY__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Actor> getParicipants() {
		return (EList<Actor>)eDynamicGet(RigelPackage.ACTIVITY__PARICIPANTS, RigelPackage.Literals.ACTIVITY__PARICIPANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getResources() {
		return (EList<Resource>)eDynamicGet(RigelPackage.ACTIVITY__RESOURCES, RigelPackage.Literals.ACTIVITY__RESOURCES, true, true);
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
			case RigelPackage.ACTIVITY__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				Transition inboundTransitions = basicGetInboundTransitions();
				if (inboundTransitions != null)
					msgs = ((InternalEObject)inboundTransitions).eInverseRemove(this, RigelPackage.TRANSITION__TARGET, Transition.class, msgs);
				return basicSetInboundTransitions((Transition)otherEnd, msgs);
			case RigelPackage.ACTIVITY__INPUTS:
				Artifact inputs = basicGetInputs();
				if (inputs != null)
					msgs = ((InternalEObject)inputs).eInverseRemove(this, RigelPackage.ARTIFACT__CONSUMERS, Artifact.class, msgs);
				return basicSetInputs((Artifact)otherEnd, msgs);
			case RigelPackage.ACTIVITY__PARICIPANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParicipants()).basicAdd(otherEnd, msgs);
			case RigelPackage.ACTIVITY__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
				return ((InternalEList<?>)getOutboundTransitions()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				return basicSetInboundTransitions(null, msgs);
			case RigelPackage.ACTIVITY__INPUTS:
				return basicSetInputs(null, msgs);
			case RigelPackage.ACTIVITY__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__PARICIPANTS:
				return ((InternalEList<?>)getParicipants()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
				return getOutboundTransitions();
			case RigelPackage.ACTIVITY__OUTPUTS:
				return getOutputs();
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				if (resolve) return getInboundTransitions();
				return basicGetInboundTransitions();
			case RigelPackage.ACTIVITY__INPUTS:
				if (resolve) return getInputs();
				return basicGetInputs();
			case RigelPackage.ACTIVITY__ELEMENTS:
				return getElements();
			case RigelPackage.ACTIVITY__PARICIPANTS:
				return getParicipants();
			case RigelPackage.ACTIVITY__RESOURCES:
				return getResources();
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
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
				getOutboundTransitions().clear();
				getOutboundTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RigelPackage.ACTIVITY__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Artifact>)newValue);
				return;
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				setInboundTransitions((Transition)newValue);
				return;
			case RigelPackage.ACTIVITY__INPUTS:
				setInputs((Artifact)newValue);
				return;
			case RigelPackage.ACTIVITY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ActivityElement>)newValue);
				return;
			case RigelPackage.ACTIVITY__PARICIPANTS:
				getParicipants().clear();
				getParicipants().addAll((Collection<? extends Actor>)newValue);
				return;
			case RigelPackage.ACTIVITY__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
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
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
				getOutboundTransitions().clear();
				return;
			case RigelPackage.ACTIVITY__OUTPUTS:
				getOutputs().clear();
				return;
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				setInboundTransitions((Transition)null);
				return;
			case RigelPackage.ACTIVITY__INPUTS:
				setInputs((Artifact)null);
				return;
			case RigelPackage.ACTIVITY__ELEMENTS:
				getElements().clear();
				return;
			case RigelPackage.ACTIVITY__PARICIPANTS:
				getParicipants().clear();
				return;
			case RigelPackage.ACTIVITY__RESOURCES:
				getResources().clear();
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
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
				return !getOutboundTransitions().isEmpty();
			case RigelPackage.ACTIVITY__OUTPUTS:
				return !getOutputs().isEmpty();
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				return basicGetInboundTransitions() != null;
			case RigelPackage.ACTIVITY__INPUTS:
				return basicGetInputs() != null;
			case RigelPackage.ACTIVITY__ELEMENTS:
				return !getElements().isEmpty();
			case RigelPackage.ACTIVITY__PARICIPANTS:
				return !getParicipants().isEmpty();
			case RigelPackage.ACTIVITY__RESOURCES:
				return !getResources().isEmpty();
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
		if (baseClass == ActivityElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Source.class) {
			switch (derivedFeatureID) {
				case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS: return RigelPackage.SOURCE__OUTBOUND_TRANSITIONS;
				case RigelPackage.ACTIVITY__OUTPUTS: return RigelPackage.SOURCE__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == Target.class) {
			switch (derivedFeatureID) {
				case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS: return RigelPackage.TARGET__INBOUND_TRANSITIONS;
				case RigelPackage.ACTIVITY__INPUTS: return RigelPackage.TARGET__INPUTS;
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
		if (baseClass == ActivityElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Source.class) {
			switch (baseFeatureID) {
				case RigelPackage.SOURCE__OUTBOUND_TRANSITIONS: return RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS;
				case RigelPackage.SOURCE__OUTPUTS: return RigelPackage.ACTIVITY__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == Target.class) {
			switch (baseFeatureID) {
				case RigelPackage.TARGET__INBOUND_TRANSITIONS: return RigelPackage.ACTIVITY__INBOUND_TRANSITIONS;
				case RigelPackage.TARGET__INPUTS: return RigelPackage.ACTIVITY__INPUTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityImpl
