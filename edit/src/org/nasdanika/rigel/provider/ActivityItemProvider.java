/**
 */
package org.nasdanika.rigel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.nasdanika.engineering.EngineeringFactory;
import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.rigel.Activity;
import org.nasdanika.rigel.RigelFactory;
import org.nasdanika.rigel.RigelPackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.rigel.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends FlowItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOutputsPropertyDescriptor(object);
			addInboundTransitionsPropertyDescriptor(object);
			addInputsPropertyDescriptor(object);
			addOwnersPropertyDescriptor(object);
			addSizePropertyDescriptor(object);
			addProgressPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Outputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOutputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(getResourceLocator(),
				 getString("_UI_Source_outputs_feature"),				 
				 RigelPackage.Literals.SOURCE__OUTPUTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inbound Transitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addInboundTransitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(getResourceLocator(),
				 getString("_UI_Target_inboundTransitions_feature"),
				 RigelPackage.Literals.TARGET__INBOUND_TRANSITIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(getResourceLocator(),
				 getString("_UI_Target_inputs_feature"),
				 RigelPackage.Literals.TARGET__INPUTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owners feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOwnersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_AbstractComponent_owners_feature"),
				 EngineeringPackage.Literals.ABSTRACT_COMPONENT__OWNERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Activity_size_feature"),
				 RigelPackage.Literals.ACTIVITY__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Progress feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addProgressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor(
				 getResourceLocator(),
				 getString("_UI_Activity_progress_feature"),
				 RigelPackage.Literals.ACTIVITY__PROGRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RigelPackage.Literals.SOURCE__OUTBOUND_TRANSITIONS);
			childrenFeatures.add(EngineeringPackage.Literals.ABSTRACT_COMPONENT__ISSUES);
			childrenFeatures.add(EngineeringPackage.Literals.ABSTRACT_COMPONENT__RELEASES);
			childrenFeatures.add(RigelPackage.Literals.ACTIVITY__RESOURCES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity.png"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity)object).getTitle();
		return label == null || label.length() == 0 ? getString("_UI_Activity_type") : label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Activity.class)) {
			case RigelPackage.ACTIVITY__SIZE:
			case RigelPackage.ACTIVITY__PROGRESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RigelPackage.ACTIVITY__OUTBOUND_TRANSITIONS:
			case RigelPackage.ACTIVITY__ISSUES:
			case RigelPackage.ACTIVITY__RELEASES:
			case RigelPackage.ACTIVITY__RESOURCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
				
		// --- Resources ---
		for (EObject resource: org.nasdanika.party.util.Activator.RESOURCES_PALETTE.getElements()) {
			newChildDescriptors.add(createChildParameter(RigelPackage.Literals.ACTIVITY__RESOURCES, resource));						
		}		

		newChildDescriptors.add
			(createChildParameter
				(RigelPackage.Literals.SOURCE__OUTBOUND_TRANSITIONS,
				 RigelFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(EngineeringPackage.Literals.ABSTRACT_COMPONENT__ISSUES,
				 EngineeringFactory.eINSTANCE.createIssue()));
		
	}

}
