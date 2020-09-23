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
import org.nasdanika.rigel.ActivityReference;
import org.nasdanika.rigel.Flow;
import org.nasdanika.rigel.FlowElement;
import org.nasdanika.rigel.Participant;
import org.nasdanika.rigel.RigelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getOwners <em>Owners</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getParicipants <em>Paricipants</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getTotalSize <em>Total Size</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.FlowImpl#getTotalProgress <em>Total Progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowImpl extends PackageElementImpl implements Flow {
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractEngineer> getOwners() {
		return (EList<AbstractEngineer>)eDynamicGet(RigelPackage.FLOW__OWNERS, EngineeringPackage.Literals.ABSTRACT_COMPONENT__OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(RigelPackage.FLOW__ISSUES, EngineeringPackage.Literals.ABSTRACT_COMPONENT__ISSUES, true, true);
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
	public EList<Participant> getParicipants() {
		return (EList<Participant>)eDynamicGet(RigelPackage.FLOW__PARICIPANTS, RigelPackage.Literals.FLOW__PARICIPANTS, true, true);
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
			case RigelPackage.FLOW__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
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
			case RigelPackage.FLOW__OWNERS:
				return getOwners();
			case RigelPackage.FLOW__ISSUES:
				return getIssues();
			case RigelPackage.FLOW__ELEMENTS:
				return getElements();
			case RigelPackage.FLOW__PARICIPANTS:
				return getParicipants();
			case RigelPackage.FLOW__TOTAL_SIZE:
				return getTotalSize();
			case RigelPackage.FLOW__TOTAL_PROGRESS:
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
			case RigelPackage.FLOW__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends AbstractEngineer>)newValue);
				return;
			case RigelPackage.FLOW__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case RigelPackage.FLOW__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends FlowElement>)newValue);
				return;
			case RigelPackage.FLOW__PARICIPANTS:
				getParicipants().clear();
				getParicipants().addAll((Collection<? extends Participant>)newValue);
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
			case RigelPackage.FLOW__OWNERS:
				getOwners().clear();
				return;
			case RigelPackage.FLOW__ISSUES:
				getIssues().clear();
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
			case RigelPackage.FLOW__OWNERS:
				return !getOwners().isEmpty();
			case RigelPackage.FLOW__ISSUES:
				return !getIssues().isEmpty();
			case RigelPackage.FLOW__ELEMENTS:
				return !getElements().isEmpty();
			case RigelPackage.FLOW__PARICIPANTS:
				return !getParicipants().isEmpty();
			case RigelPackage.FLOW__TOTAL_SIZE:
				return getTotalSize() != TOTAL_SIZE_EDEFAULT;
			case RigelPackage.FLOW__TOTAL_PROGRESS:
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
		if (baseClass == ComponentCategoryElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractComponent.class) {
			switch (derivedFeatureID) {
				case RigelPackage.FLOW__OWNERS: return EngineeringPackage.ABSTRACT_COMPONENT__OWNERS;
				case RigelPackage.FLOW__ISSUES: return EngineeringPackage.ABSTRACT_COMPONENT__ISSUES;
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
		if (baseClass == ComponentCategoryElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractComponent.class) {
			switch (baseFeatureID) {
				case EngineeringPackage.ABSTRACT_COMPONENT__OWNERS: return RigelPackage.FLOW__OWNERS;
				case EngineeringPackage.ABSTRACT_COMPONENT__ISSUES: return RigelPackage.FLOW__ISSUES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getTotalSize() {
		double flowsSize = getElements().stream().filter(e -> e instanceof Flow).mapToDouble(e -> ((Flow) e).getTotalSize()).sum();
		double activityReferencesSize = getElements().stream().filter(e -> e instanceof ActivityReference && ((ActivityReference) e).getActivity() != null).mapToDouble(e -> ((ActivityReference) e).getActivity().getTotalSize()).sum();
		return flowsSize + activityReferencesSize;
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
			return 0;
		}
		
		// Worked = size * progress
		double totalFlowWorked = getElements().stream().filter(e -> e instanceof Flow).mapToDouble(e -> ((Flow) e).getTotalSize() * ((Flow) e).getTotalProgress()).sum();
		double totalActivityReferenceWorked = getElements().stream().filter(e -> e instanceof ActivityReference && ((ActivityReference) e).getActivity() != null).mapToDouble(e -> ((ActivityReference) e).getActivity().getTotalSize() * ((ActivityReference) e).getActivity().getTotalProgress()).sum();
		double totalSize = getTotalSize();		
		return totalSize == 0 ? 0 : (int) Math.round((totalFlowWorked + totalActivityReferenceWorked)/totalSize);
	}
	

} //FlowImpl
