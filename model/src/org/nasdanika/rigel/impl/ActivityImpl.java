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
import org.nasdanika.rigel.Engineer;
import org.nasdanika.rigel.Issue;
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
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getOutboundTransitions <em>Outbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getInboundTransitions <em>Inbound Transitions</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getParicipants <em>Paricipants</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getTotalSize <em>Total Size</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ActivityImpl#getTotalProgress <em>Total Progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends PackageElementImpl implements Activity {
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
	 * The default value of the '{@link #getTotalSize() <em>Total Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSize()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_SIZE_EDEFAULT = 0.0;
	/**
	 * The default value of the '{@link #getTotalProgress() <em>Total Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalProgress()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_PROGRESS_EDEFAULT = 0;

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
	@Override
	public Engineer getOwner() {
		return (Engineer)eDynamicGet(RigelPackage.ACTIVITY__OWNER, RigelPackage.Literals.ENGINEERED_ELEMENT__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetOwner() {
		return (Engineer)eDynamicGet(RigelPackage.ACTIVITY__OWNER, RigelPackage.Literals.ENGINEERED_ELEMENT__OWNER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Engineer newOwner, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOwner, RigelPackage.ACTIVITY__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Engineer newOwner) {
		eDynamicSet(RigelPackage.ACTIVITY__OWNER, RigelPackage.Literals.ENGINEERED_ELEMENT__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(RigelPackage.ACTIVITY__ISSUES, RigelPackage.Literals.ENGINEERED_ELEMENT__ISSUES, true, true);
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
	 * @generated NOT
	 */
	@Override
	public double getTotalSize() {
		return getSize() + getElements().stream().filter(e -> e instanceof Activity).mapToDouble(e -> ((Activity) e).getTotalSize()).sum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getTotalProgress() {
		boolean hasChildActivities = getElements().stream().filter(e -> e instanceof Activity).count() > 0;
		if (!hasChildActivities) {
			return getProgress();
		}
		
		// Worked = size * progress
		double totalWorked = getSize()*getProgress() + getElements().stream().filter(e -> e instanceof Activity).mapToDouble(e -> ((Activity) e).getTotalSize() * ((Activity) e).getTotalProgress()).sum();
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
			case RigelPackage.ACTIVITY__OWNER:
				Engineer owner = basicGetOwner();
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, RigelPackage.ENGINEER__OWNS, Engineer.class, msgs);
				return basicSetOwner((Engineer)otherEnd, msgs);
			case RigelPackage.ACTIVITY__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInboundTransitions()).basicAdd(otherEnd, msgs);
			case RigelPackage.ACTIVITY__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
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
			case RigelPackage.ACTIVITY__OWNER:
				return basicSetOwner(null, msgs);
			case RigelPackage.ACTIVITY__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
				return ((InternalEList<?>)getOutboundTransitions()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				return ((InternalEList<?>)getInboundTransitions()).basicRemove(otherEnd, msgs);
			case RigelPackage.ACTIVITY__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
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
			case RigelPackage.ACTIVITY__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case RigelPackage.ACTIVITY__ISSUES:
				return getIssues();
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
				return getOutboundTransitions();
			case RigelPackage.ACTIVITY__OUTPUTS:
				return getOutputs();
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				return getInboundTransitions();
			case RigelPackage.ACTIVITY__INPUTS:
				return getInputs();
			case RigelPackage.ACTIVITY__ELEMENTS:
				return getElements();
			case RigelPackage.ACTIVITY__PARICIPANTS:
				return getParicipants();
			case RigelPackage.ACTIVITY__RESOURCES:
				return getResources();
			case RigelPackage.ACTIVITY__SIZE:
				return getSize();
			case RigelPackage.ACTIVITY__PROGRESS:
				return getProgress();
			case RigelPackage.ACTIVITY__TOTAL_SIZE:
				return getTotalSize();
			case RigelPackage.ACTIVITY__TOTAL_PROGRESS:
				return getTotalProgress();
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
			case RigelPackage.ACTIVITY__OWNER:
				setOwner((Engineer)newValue);
				return;
			case RigelPackage.ACTIVITY__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
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
			case RigelPackage.ACTIVITY__SIZE:
				setSize((Double)newValue);
				return;
			case RigelPackage.ACTIVITY__PROGRESS:
				setProgress((Integer)newValue);
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
			case RigelPackage.ACTIVITY__OWNER:
				setOwner((Engineer)null);
				return;
			case RigelPackage.ACTIVITY__ISSUES:
				getIssues().clear();
				return;
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
			case RigelPackage.ACTIVITY__ELEMENTS:
				getElements().clear();
				return;
			case RigelPackage.ACTIVITY__PARICIPANTS:
				getParicipants().clear();
				return;
			case RigelPackage.ACTIVITY__RESOURCES:
				getResources().clear();
				return;
			case RigelPackage.ACTIVITY__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case RigelPackage.ACTIVITY__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
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
			case RigelPackage.ACTIVITY__OWNER:
				return basicGetOwner() != null;
			case RigelPackage.ACTIVITY__ISSUES:
				return !getIssues().isEmpty();
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
				return !getOutboundTransitions().isEmpty();
			case RigelPackage.ACTIVITY__OUTPUTS:
				return !getOutputs().isEmpty();
			case RigelPackage.ACTIVITY__INBOUND_TRANSITIONS:
				return !getInboundTransitions().isEmpty();
			case RigelPackage.ACTIVITY__INPUTS:
				return !getInputs().isEmpty();
			case RigelPackage.ACTIVITY__ELEMENTS:
				return !getElements().isEmpty();
			case RigelPackage.ACTIVITY__PARICIPANTS:
				return !getParicipants().isEmpty();
			case RigelPackage.ACTIVITY__RESOURCES:
				return !getResources().isEmpty();
			case RigelPackage.ACTIVITY__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case RigelPackage.ACTIVITY__PROGRESS:
				return getProgress() != PROGRESS_EDEFAULT;
			case RigelPackage.ACTIVITY__TOTAL_SIZE:
				return getTotalSize() != TOTAL_SIZE_EDEFAULT;
			case RigelPackage.ACTIVITY__TOTAL_PROGRESS:
				return getTotalProgress() != TOTAL_PROGRESS_EDEFAULT;
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
