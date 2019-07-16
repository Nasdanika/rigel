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
import org.nasdanika.rigel.Artifact;
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
 *   <li>{@link org.nasdanika.rigel.impl.ResourceImpl#getUsers <em>Users</em>}</li>
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getUsers() {
		return (EList<Activity>)eDynamicGet(RigelPackage.RESOURCE__USERS, RigelPackage.Literals.RESOURCE__USERS, true, true);
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
			case RigelPackage.RESOURCE__USERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsers()).basicAdd(otherEnd, msgs);
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
			case RigelPackage.RESOURCE__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
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
			case RigelPackage.RESOURCE__USERS:
				return getUsers();
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
			case RigelPackage.RESOURCE__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends Activity>)newValue);
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
			case RigelPackage.RESOURCE__USERS:
				getUsers().clear();
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
			case RigelPackage.RESOURCE__USERS:
				return !getUsers().isEmpty();
			case RigelPackage.RESOURCE__CHILDREN:
				return !getChildren().isEmpty();
			case RigelPackage.RESOURCE__ARTIFACTS:
				return !getArtifacts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
