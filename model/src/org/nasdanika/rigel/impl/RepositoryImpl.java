/**
 */
package org.nasdanika.rigel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.engineering.Engineer;
import org.nasdanika.engineering.EngineeredElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;

import org.nasdanika.rigel.Artifact;
import org.nasdanika.rigel.FlowElement;
import org.nasdanika.rigel.Repository;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.rigel.Source;
import org.nasdanika.rigel.Target;
import org.nasdanika.rigel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.impl.RepositoryImpl#getOutboundTransitions <em>Outbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.RepositoryImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.RepositoryImpl#getInboundTransitions <em>Inbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.RepositoryImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.RepositoryImpl#getOwners <em>Owners</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.RepositoryImpl#getIssues <em>Issues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends PackageElementImpl implements Repository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RigelPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutboundTransitions() {
		return (EList<Transition>)eDynamicGet(RigelPackage.REPOSITORY__OUTBOUND_TRANSITIONS, RigelPackage.Literals.SOURCE__OUTBOUND_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getOutputs() {
		return (EList<Artifact>)eDynamicGet(RigelPackage.REPOSITORY__OUTPUTS, RigelPackage.Literals.SOURCE__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getInboundTransitions() {
		return (EList<Transition>)eDynamicGet(RigelPackage.REPOSITORY__INBOUND_TRANSITIONS, RigelPackage.Literals.TARGET__INBOUND_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getInputs() {
		return (EList<Artifact>)eDynamicGet(RigelPackage.REPOSITORY__INPUTS, RigelPackage.Literals.TARGET__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Engineer> getOwners() {
		return (EList<Engineer>)eDynamicGet(RigelPackage.REPOSITORY__OWNERS, EngineeringPackage.Literals.ENGINEERED_ELEMENT__OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(RigelPackage.REPOSITORY__ISSUES, EngineeringPackage.Literals.ENGINEERED_ELEMENT__ISSUES, true, true);
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
			case RigelPackage.REPOSITORY__INBOUND_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInboundTransitions()).basicAdd(otherEnd, msgs);
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
			case RigelPackage.REPOSITORY__OUTBOUND_TRANSITIONS:
				return ((InternalEList<?>)getOutboundTransitions()).basicRemove(otherEnd, msgs);
			case RigelPackage.REPOSITORY__INBOUND_TRANSITIONS:
				return ((InternalEList<?>)getInboundTransitions()).basicRemove(otherEnd, msgs);
			case RigelPackage.REPOSITORY__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
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
			case RigelPackage.REPOSITORY__OUTBOUND_TRANSITIONS:
				return getOutboundTransitions();
			case RigelPackage.REPOSITORY__OUTPUTS:
				return getOutputs();
			case RigelPackage.REPOSITORY__INBOUND_TRANSITIONS:
				return getInboundTransitions();
			case RigelPackage.REPOSITORY__INPUTS:
				return getInputs();
			case RigelPackage.REPOSITORY__OWNERS:
				return getOwners();
			case RigelPackage.REPOSITORY__ISSUES:
				return getIssues();
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
			case RigelPackage.REPOSITORY__OUTBOUND_TRANSITIONS:
				getOutboundTransitions().clear();
				getOutboundTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RigelPackage.REPOSITORY__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Artifact>)newValue);
				return;
			case RigelPackage.REPOSITORY__INBOUND_TRANSITIONS:
				getInboundTransitions().clear();
				getInboundTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RigelPackage.REPOSITORY__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Artifact>)newValue);
				return;
			case RigelPackage.REPOSITORY__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends Engineer>)newValue);
				return;
			case RigelPackage.REPOSITORY__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
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
			case RigelPackage.REPOSITORY__OUTBOUND_TRANSITIONS:
				getOutboundTransitions().clear();
				return;
			case RigelPackage.REPOSITORY__OUTPUTS:
				getOutputs().clear();
				return;
			case RigelPackage.REPOSITORY__INBOUND_TRANSITIONS:
				getInboundTransitions().clear();
				return;
			case RigelPackage.REPOSITORY__INPUTS:
				getInputs().clear();
				return;
			case RigelPackage.REPOSITORY__OWNERS:
				getOwners().clear();
				return;
			case RigelPackage.REPOSITORY__ISSUES:
				getIssues().clear();
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
			case RigelPackage.REPOSITORY__OUTBOUND_TRANSITIONS:
				return !getOutboundTransitions().isEmpty();
			case RigelPackage.REPOSITORY__OUTPUTS:
				return !getOutputs().isEmpty();
			case RigelPackage.REPOSITORY__INBOUND_TRANSITIONS:
				return !getInboundTransitions().isEmpty();
			case RigelPackage.REPOSITORY__INPUTS:
				return !getInputs().isEmpty();
			case RigelPackage.REPOSITORY__OWNERS:
				return !getOwners().isEmpty();
			case RigelPackage.REPOSITORY__ISSUES:
				return !getIssues().isEmpty();
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
		if (baseClass == FlowElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Source.class) {
			switch (derivedFeatureID) {
				case RigelPackage.REPOSITORY__OUTBOUND_TRANSITIONS: return RigelPackage.SOURCE__OUTBOUND_TRANSITIONS;
				case RigelPackage.REPOSITORY__OUTPUTS: return RigelPackage.SOURCE__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == Target.class) {
			switch (derivedFeatureID) {
				case RigelPackage.REPOSITORY__INBOUND_TRANSITIONS: return RigelPackage.TARGET__INBOUND_TRANSITIONS;
				case RigelPackage.REPOSITORY__INPUTS: return RigelPackage.TARGET__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == EngineeredElement.class) {
			switch (derivedFeatureID) {
				case RigelPackage.REPOSITORY__OWNERS: return EngineeringPackage.ENGINEERED_ELEMENT__OWNERS;
				case RigelPackage.REPOSITORY__ISSUES: return EngineeringPackage.ENGINEERED_ELEMENT__ISSUES;
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
		if (baseClass == FlowElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Source.class) {
			switch (baseFeatureID) {
				case RigelPackage.SOURCE__OUTBOUND_TRANSITIONS: return RigelPackage.REPOSITORY__OUTBOUND_TRANSITIONS;
				case RigelPackage.SOURCE__OUTPUTS: return RigelPackage.REPOSITORY__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == Target.class) {
			switch (baseFeatureID) {
				case RigelPackage.TARGET__INBOUND_TRANSITIONS: return RigelPackage.REPOSITORY__INBOUND_TRANSITIONS;
				case RigelPackage.TARGET__INPUTS: return RigelPackage.REPOSITORY__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == EngineeredElement.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.ENGINEERED_ELEMENT__OWNERS: return RigelPackage.REPOSITORY__OWNERS;
				case EngineeringPackage.ENGINEERED_ELEMENT__ISSUES: return RigelPackage.REPOSITORY__ISSUES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RepositoryImpl
