/**
 */
package org.nasdanika.rigel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.engineering.AbstractComponent;
import org.nasdanika.engineering.AbstractEngineer;
import org.nasdanika.engineering.ComponentCategoryElement;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.engineering.Issue;
import org.nasdanika.engineering.Release;
import org.nasdanika.party.ResourceCategoryElement;
import org.nasdanika.rigel.Activity;
import org.nasdanika.rigel.Artifact;
import org.nasdanika.rigel.Flow;
import org.nasdanika.rigel.FlowElement;
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
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getOwners <em>Owners</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends FlowImpl implements Activity {
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
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final int PROGRESS_EDEFAULT = 0;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getInboundTransitions() {
		return (EList<Transition>)eDynamicGet(RigelPackage.ACTIVITY__INBOUND_TRANSITIONS, RigelPackage.Literals.TARGET__INBOUND_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getInputs() {
		return (EList<Artifact>)eDynamicGet(RigelPackage.ACTIVITY__INPUTS, RigelPackage.Literals.TARGET__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractEngineer> getOwners() {
		return (EList<AbstractEngineer>)eDynamicGet(RigelPackage.ACTIVITY__OWNERS, EngineeringPackage.Literals.ABSTRACT_COMPONENT__OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(RigelPackage.ACTIVITY__ISSUES, EngineeringPackage.Literals.ABSTRACT_COMPONENT__ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Release> getReleases() {
		return (EList<Release>)eDynamicGet(RigelPackage.ACTIVITY__RELEASES, EngineeringPackage.Literals.ABSTRACT_COMPONENT__RELEASES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSize() {
		return (Double)eDynamicGet(RigelPackage.ACTIVITY__SIZE, RigelPackage.Literals.ACTIVITY__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(double newSize) {
		eDynamicSet(RigelPackage.ACTIVITY__SIZE, RigelPackage.Literals.ACTIVITY__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProgress() {
		return (Integer)eDynamicGet(RigelPackage.ACTIVITY__PROGRESS, RigelPackage.Literals.ACTIVITY__PROGRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgress(int newProgress) {
		eDynamicSet(RigelPackage.ACTIVITY__PROGRESS, RigelPackage.Literals.ACTIVITY__PROGRESS, newProgress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ResourceCategoryElement> getResources() {
		return (EList<ResourceCategoryElement>)eDynamicGet(RigelPackage.ACTIVITY__RESOURCES, RigelPackage.Literals.ACTIVITY__RESOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getTotalSize() {
		return super.getTotalSize() + getSize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getTotalProgress() {
		boolean hasChildFlows = getElements().stream().filter(e -> e instanceof Flow).count() > 0;
		if (!hasChildFlows) {
			return getProgress();
		}
		
		// Worked = size * progress
		double totalWorked = getSize()*getProgress() + super.getTotalSize() * super.getTotalProgress();
		double totalSize = getTotalSize();		
		return totalSize == 0 ? 0 : (int) Math.round(totalWorked/totalSize);
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
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
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
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
				return ((InternalEList<?>)getOutboundTransitions()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				return ((InternalEList<?>)getInboundTransitions()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__RELEASES:
				return ((InternalEList<?>)getReleases()).basicRemove(otherEnd, msgs);
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
				return getInboundTransitions();
			case RigelPackage.ACTIVITY__INPUTS:
				return getInputs();
			case RigelPackage.ACTIVITY__OWNERS:
				return getOwners();
			case RigelPackage.ACTIVITY__ISSUES:
				return getIssues();
			case RigelPackage.ACTIVITY__RELEASES:
				return getReleases();
			case RigelPackage.ACTIVITY__SIZE:
				return getSize();
			case RigelPackage.ACTIVITY__PROGRESS:
				return getProgress();
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
				getInboundTransitions().clear();
				getInboundTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RigelPackage.ACTIVITY__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Artifact>)newValue);
				return;
			case RigelPackage.ACTIVITY__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends AbstractEngineer>)newValue);
				return;
			case RigelPackage.ACTIVITY__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case RigelPackage.ACTIVITY__RELEASES:
				getReleases().clear();
				getReleases().addAll((Collection<? extends Release>)newValue);
				return;
			case RigelPackage.ACTIVITY__SIZE:
				setSize((Double)newValue);
				return;
			case RigelPackage.ACTIVITY__PROGRESS:
				setProgress((Integer)newValue);
				return;
			case RigelPackage.ACTIVITY__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceCategoryElement>)newValue);
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
				getInboundTransitions().clear();
				return;
			case RigelPackage.ACTIVITY__INPUTS:
				getInputs().clear();
				return;
			case RigelPackage.ACTIVITY__OWNERS:
				getOwners().clear();
				return;
			case RigelPackage.ACTIVITY__ISSUES:
				getIssues().clear();
				return;
			case RigelPackage.ACTIVITY__RELEASES:
				getReleases().clear();
				return;
			case RigelPackage.ACTIVITY__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case RigelPackage.ACTIVITY__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
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
				return !getInboundTransitions().isEmpty();
			case RigelPackage.ACTIVITY__INPUTS:
				return !getInputs().isEmpty();
			case RigelPackage.ACTIVITY__OWNERS:
				return !getOwners().isEmpty();
			case RigelPackage.ACTIVITY__ISSUES:
				return !getIssues().isEmpty();
			case RigelPackage.ACTIVITY__RELEASES:
				return !getReleases().isEmpty();
			case RigelPackage.ACTIVITY__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case RigelPackage.ACTIVITY__PROGRESS:
				return getProgress() != PROGRESS_EDEFAULT;
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
		if (baseClass == FlowElement.class) {
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
		if (baseClass == ComponentCategoryElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractComponent.class) {
			switch (derivedFeatureID) {
				case RigelPackage.ACTIVITY__OWNERS: return EngineeringPackage.ABSTRACT_COMPONENT__OWNERS;
				case RigelPackage.ACTIVITY__ISSUES: return EngineeringPackage.ABSTRACT_COMPONENT__ISSUES;
				case RigelPackage.ACTIVITY__RELEASES: return EngineeringPackage.ABSTRACT_COMPONENT__RELEASES;
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
		if (baseClass == ComponentCategoryElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractComponent.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.ABSTRACT_COMPONENT__OWNERS: return RigelPackage.ACTIVITY__OWNERS;
				case EngineeringPackage.ABSTRACT_COMPONENT__ISSUES: return RigelPackage.ACTIVITY__ISSUES;
				case EngineeringPackage.ABSTRACT_COMPONENT__RELEASES: return RigelPackage.ACTIVITY__RELEASES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityImpl
