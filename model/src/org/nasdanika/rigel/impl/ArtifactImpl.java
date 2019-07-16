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
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.rigel.Source;
import org.nasdanika.rigel.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.impl.ArtifactImpl#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ArtifactImpl#getProducers <em>Producers</em>}</li>
 *   <li>{@link org.nasdanika.rigel.impl.ArtifactImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends PackageElementImpl implements Artifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RigelPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Target> getConsumers() {
		return (EList<Target>)eDynamicGet(RigelPackage.ARTIFACT__CONSUMERS, RigelPackage.Literals.ARTIFACT__CONSUMERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Source> getProducers() {
		return (EList<Source>)eDynamicGet(RigelPackage.ARTIFACT__PRODUCERS, RigelPackage.Literals.ARTIFACT__PRODUCERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getChildren() {
		return (EList<Artifact>)eDynamicGet(RigelPackage.ARTIFACT__CHILDREN, RigelPackage.Literals.ARTIFACT__CHILDREN, true, true);
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
			case RigelPackage.ARTIFACT__CONSUMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumers()).basicAdd(otherEnd, msgs);
			case RigelPackage.ARTIFACT__PRODUCERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProducers()).basicAdd(otherEnd, msgs);
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
			case RigelPackage.ARTIFACT__CONSUMERS:
				return ((InternalEList<?>)getConsumers()).basicRemove(otherEnd, msgs);
			case RigelPackage.ARTIFACT__PRODUCERS:
				return ((InternalEList<?>)getProducers()).basicRemove(otherEnd, msgs);
			case RigelPackage.ARTIFACT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case RigelPackage.ARTIFACT__CONSUMERS:
				return getConsumers();
			case RigelPackage.ARTIFACT__PRODUCERS:
				return getProducers();
			case RigelPackage.ARTIFACT__CHILDREN:
				return getChildren();
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
			case RigelPackage.ARTIFACT__CONSUMERS:
				getConsumers().clear();
				getConsumers().addAll((Collection<? extends Target>)newValue);
				return;
			case RigelPackage.ARTIFACT__PRODUCERS:
				getProducers().clear();
				getProducers().addAll((Collection<? extends Source>)newValue);
				return;
			case RigelPackage.ARTIFACT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Artifact>)newValue);
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
			case RigelPackage.ARTIFACT__CONSUMERS:
				getConsumers().clear();
				return;
			case RigelPackage.ARTIFACT__PRODUCERS:
				getProducers().clear();
				return;
			case RigelPackage.ARTIFACT__CHILDREN:
				getChildren().clear();
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
			case RigelPackage.ARTIFACT__CONSUMERS:
				return !getConsumers().isEmpty();
			case RigelPackage.ARTIFACT__PRODUCERS:
				return !getProducers().isEmpty();
			case RigelPackage.ARTIFACT__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
