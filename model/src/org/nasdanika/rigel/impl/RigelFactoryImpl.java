/**
 */
package org.nasdanika.rigel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.rigel.Activity;
import org.nasdanika.rigel.ActivityReference;
import org.nasdanika.rigel.Actor;
import org.nasdanika.rigel.Artifact;
import org.nasdanika.rigel.Association;
import org.nasdanika.rigel.End;
import org.nasdanika.rigel.Milestone;
import org.nasdanika.rigel.Partition;
import org.nasdanika.rigel.Repository;
import org.nasdanika.rigel.RepositoryReference;
import org.nasdanika.rigel.Resource;
import org.nasdanika.rigel.RigelFactory;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.rigel.Start;
import org.nasdanika.rigel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RigelFactoryImpl extends EFactoryImpl implements RigelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RigelFactory init() {
		try {
			RigelFactory theRigelFactory = (RigelFactory)EPackage.Registry.INSTANCE.getEFactory(RigelPackage.eNS_URI);
			if (theRigelFactory != null) {
				return theRigelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RigelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RigelPackage.PACKAGE: return createPackage();
			case RigelPackage.ACTOR: return createActor();
			case RigelPackage.START: return createStart();
			case RigelPackage.END: return createEnd();
			case RigelPackage.PARTITION: return createPartition();
			case RigelPackage.ACTIVITY: return createActivity();
			case RigelPackage.MILESTONE: return createMilestone();
			case RigelPackage.ACTIVITY_REFERENCE: return createActivityReference();
			case RigelPackage.RESOURCE: return createResource();
			case RigelPackage.ARTIFACT: return createArtifact();
			case RigelPackage.TRANSITION: return createTransition();
			case RigelPackage.ASSOCIATION: return createAssociation();
			case RigelPackage.REPOSITORY: return createRepository();
			case RigelPackage.REPOSITORY_REFERENCE: return createRepositoryReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.nasdanika.rigel.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Partition createPartition() {
		PartitionImpl partition = new PartitionImpl();
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityReference createActivityReference() {
		ActivityReferenceImpl activityReference = new ActivityReferenceImpl();
		return activityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryReference createRepositoryReference() {
		RepositoryReferenceImpl repositoryReference = new RepositoryReferenceImpl();
		return repositoryReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Milestone createMilestone() {
		MilestoneImpl milestone = new MilestoneImpl();
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RigelPackage getRigelPackage() {
		return (RigelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RigelPackage getPackage() {
		return RigelPackage.eINSTANCE;
	}

} //RigelFactoryImpl
