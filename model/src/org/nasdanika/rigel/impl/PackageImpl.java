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
import org.nasdanika.rigel.IPackage;
import org.nasdanika.rigel.PackageElement;
import org.nasdanika.rigel.RigelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.impl.PackageImpl#getOwners <em>Owners</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.PackageImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.PackageImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends PackageElementImpl implements org.nasdanika.rigel.Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RigelPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AbstractEngineer> getOwners() {
		return (EList<AbstractEngineer>)eDynamicGet(RigelPackage.PACKAGE__OWNERS, EngineeringPackage.Literals.ABSTRACT_COMPONENT__OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(RigelPackage.PACKAGE__ISSUES, EngineeringPackage.Literals.ABSTRACT_COMPONENT__ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PackageElement> getElements() {
		return (EList<PackageElement>)eDynamicGet(RigelPackage.PACKAGE__ELEMENTS, RigelPackage.Literals.IPACKAGE__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RigelPackage.PACKAGE__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case RigelPackage.PACKAGE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case RigelPackage.PACKAGE__OWNERS:
				return getOwners();
			case RigelPackage.PACKAGE__ISSUES:
				return getIssues();
			case RigelPackage.PACKAGE__ELEMENTS:
				return getElements();
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
			case RigelPackage.PACKAGE__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends AbstractEngineer>)newValue);
				return;
			case RigelPackage.PACKAGE__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case RigelPackage.PACKAGE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends PackageElement>)newValue);
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
			case RigelPackage.PACKAGE__OWNERS:
				getOwners().clear();
				return;
			case RigelPackage.PACKAGE__ISSUES:
				getIssues().clear();
				return;
			case RigelPackage.PACKAGE__ELEMENTS:
				getElements().clear();
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
			case RigelPackage.PACKAGE__OWNERS:
				return !getOwners().isEmpty();
			case RigelPackage.PACKAGE__ISSUES:
				return !getIssues().isEmpty();
			case RigelPackage.PACKAGE__ELEMENTS:
				return !getElements().isEmpty();
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
				case RigelPackage.PACKAGE__OWNERS: return EngineeringPackage.ABSTRACT_COMPONENT__OWNERS;
				case RigelPackage.PACKAGE__ISSUES: return EngineeringPackage.ABSTRACT_COMPONENT__ISSUES;
				default: return -1;
			}
		}
		if (baseClass == IPackage.class) {
			switch (derivedFeatureID) {
				case RigelPackage.PACKAGE__ELEMENTS: return RigelPackage.IPACKAGE__ELEMENTS;
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
				case EngineeringPackage.ABSTRACT_COMPONENT__OWNERS: return RigelPackage.PACKAGE__OWNERS;
				case EngineeringPackage.ABSTRACT_COMPONENT__ISSUES: return RigelPackage.PACKAGE__ISSUES;
				default: return -1;
			}
		}
		if (baseClass == IPackage.class) {
			switch (baseFeatureID) {
				case RigelPackage.IPACKAGE__ELEMENTS: return RigelPackage.PACKAGE__ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PackageImpl
