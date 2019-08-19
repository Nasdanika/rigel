/**
 */
package org.nasdanika.rigel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.rigel.Artifact;
import org.nasdanika.rigel.Capability;
import org.nasdanika.rigel.Engineer;
import org.nasdanika.rigel.EngineeredElement;
import org.nasdanika.rigel.Issue;
import org.nasdanika.rigel.Requirement;
import org.nasdanika.rigel.Resource;
import org.nasdanika.rigel.RigelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.impl.ResourceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ResourceImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ResourceImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ResourceImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ResourceImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends PackageElementImpl implements Resource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RigelPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Engineer getOwner() {
		return (Engineer)eDynamicGet(RigelPackage.RESOURCE__OWNER, RigelPackage.Literals.ENGINEERED_ELEMENT__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engineer basicGetOwner() {
		return (Engineer)eDynamicGet(RigelPackage.RESOURCE__OWNER, RigelPackage.Literals.ENGINEERED_ELEMENT__OWNER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Engineer newOwner, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOwner, RigelPackage.RESOURCE__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Engineer newOwner) {
		eDynamicSet(RigelPackage.RESOURCE__OWNER, RigelPackage.Literals.ENGINEERED_ELEMENT__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(RigelPackage.RESOURCE__ISSUES, RigelPackage.Literals.ENGINEERED_ELEMENT__ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Requirement> getRequiredBy() {
		return (EList<Requirement>)eDynamicGet(RigelPackage.RESOURCE__REQUIRED_BY, RigelPackage.Literals.CAPABILITY__REQUIRED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getChildren() {
		return (EList<Resource>)eDynamicGet(RigelPackage.RESOURCE__CHILDREN, RigelPackage.Literals.RESOURCE__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(RigelPackage.RESOURCE__ARTIFACTS, RigelPackage.Literals.RESOURCE__ARTIFACTS, true, true);
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
			case RigelPackage.RESOURCE__OWNER:
				Engineer owner = basicGetOwner();
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, RigelPackage.ENGINEER__OWNS, Engineer.class, msgs);
				return basicSetOwner((Engineer)otherEnd, msgs);
			case RigelPackage.RESOURCE__REQUIRED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredBy()).basicAdd(otherEnd, msgs);
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
			case RigelPackage.RESOURCE__OWNER:
				return basicSetOwner(null, msgs);
			case RigelPackage.RESOURCE__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case RigelPackage.RESOURCE__REQUIRED_BY:
				return ((InternalEList<?>)getRequiredBy()).basicRemove(otherEnd, msgs);
			case RigelPackage.RESOURCE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case RigelPackage.RESOURCE__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
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
			case RigelPackage.RESOURCE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case RigelPackage.RESOURCE__ISSUES:
				return getIssues();
			case RigelPackage.RESOURCE__REQUIRED_BY:
				return getRequiredBy();
			case RigelPackage.RESOURCE__CHILDREN:
				return getChildren();
			case RigelPackage.RESOURCE__ARTIFACTS:
				return getArtifacts();
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
			case RigelPackage.RESOURCE__OWNER:
				setOwner((Engineer)newValue);
				return;
			case RigelPackage.RESOURCE__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case RigelPackage.RESOURCE__REQUIRED_BY:
				getRequiredBy().clear();
				getRequiredBy().addAll((Collection<? extends Requirement>)newValue);
				return;
			case RigelPackage.RESOURCE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Resource>)newValue);
				return;
			case RigelPackage.RESOURCE__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case RigelPackage.RESOURCE__OWNER:
				setOwner((Engineer)null);
				return;
			case RigelPackage.RESOURCE__ISSUES:
				getIssues().clear();
				return;
			case RigelPackage.RESOURCE__REQUIRED_BY:
				getRequiredBy().clear();
				return;
			case RigelPackage.RESOURCE__CHILDREN:
				getChildren().clear();
				return;
			case RigelPackage.RESOURCE__ARTIFACTS:
				getArtifacts().clear();
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
			case RigelPackage.RESOURCE__OWNER:
				return basicGetOwner() != null;
			case RigelPackage.RESOURCE__ISSUES:
				return !getIssues().isEmpty();
			case RigelPackage.RESOURCE__REQUIRED_BY:
				return !getRequiredBy().isEmpty();
			case RigelPackage.RESOURCE__CHILDREN:
				return !getChildren().isEmpty();
			case RigelPackage.RESOURCE__ARTIFACTS:
				return !getArtifacts().isEmpty();
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
		if (baseClass == EngineeredElement.class) {
			switch (derivedFeatureID) {
				case RigelPackage.RESOURCE__OWNER: return RigelPackage.ENGINEERED_ELEMENT__OWNER;
				case RigelPackage.RESOURCE__ISSUES: return RigelPackage.ENGINEERED_ELEMENT__ISSUES;
				default: return -1;
			}
		}
		if (baseClass == Capability.class) {
			switch (derivedFeatureID) {
				case RigelPackage.RESOURCE__REQUIRED_BY: return RigelPackage.CAPABILITY__REQUIRED_BY;
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
		if (baseClass == EngineeredElement.class) {
			switch (baseFeatureID) {
				case RigelPackage.ENGINEERED_ELEMENT__OWNER: return RigelPackage.RESOURCE__OWNER;
				case RigelPackage.ENGINEERED_ELEMENT__ISSUES: return RigelPackage.RESOURCE__ISSUES;
				default: return -1;
			}
		}
		if (baseClass == Capability.class) {
			switch (baseFeatureID) {
				case RigelPackage.CAPABILITY__REQUIRED_BY: return RigelPackage.RESOURCE__REQUIRED_BY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ResourceImpl
