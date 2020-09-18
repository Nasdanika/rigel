/**
 */
package org.nasdanika.rigel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.engineering.EngineeringPackage;
import org.nasdanika.ncore.NcorePackage;
import org.nasdanika.party.PartyPackage;
import org.nasdanika.rigel.Activity;
import org.nasdanika.rigel.FlowElement;
import org.nasdanika.rigel.IPackage;
import org.nasdanika.rigel.ActivityReference;
import org.nasdanika.rigel.Actor;
import org.nasdanika.rigel.Artifact;
import org.nasdanika.rigel.Association;
import org.nasdanika.rigel.End;
import org.nasdanika.rigel.Flow;
import org.nasdanika.rigel.Milestone;
import org.nasdanika.rigel.PackageElement;
import org.nasdanika.rigel.Participant;
import org.nasdanika.rigel.Partition;
import org.nasdanika.rigel.Repository;
import org.nasdanika.rigel.RepositoryReference;
import org.nasdanika.rigel.Resource;
import org.nasdanika.rigel.RigelFactory;
import org.nasdanika.rigel.RigelPackage;
import org.nasdanika.rigel.Source;
import org.nasdanika.rigel.Start;
import org.nasdanika.rigel.Target;
import org.nasdanika.rigel.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RigelPackageImpl extends EPackageImpl implements RigelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass milestoneEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.rigel.RigelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RigelPackageImpl() {
		super(eNS_URI, RigelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RigelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RigelPackage init() {
		if (isInited) return (RigelPackage)EPackage.Registry.INSTANCE.getEPackage(RigelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRigelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RigelPackageImpl theRigelPackage = registeredRigelPackage instanceof RigelPackageImpl ? (RigelPackageImpl)registeredRigelPackage : new RigelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EngineeringPackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();
		PartyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRigelPackage.createPackageContents();

		// Initialize created meta-data
		theRigelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRigelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RigelPackage.eNS_URI, theRigelPackage);
		return theRigelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageElement() {
		return packageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageElement_Associations() {
		return (EReference)packageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIPackage() {
		return iPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIPackage_Elements() {
		return (EReference)iPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipant_Flows() {
		return (EReference)participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Elements() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlow_Paricipants() {
		return (EReference)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlow_TotalSize() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlow_TotalProgress() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_OutboundTransitions() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_Outputs() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTarget() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTarget_InboundTransitions() {
		return (EReference)targetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTarget_Inputs() {
		return (EReference)targetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartition() {
		return partitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Size() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Progress() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityReference() {
		return activityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityReference_Activity() {
		return (EReference)activityReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Children() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Artifacts() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Inputs() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Results() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_Target() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepositoryReference() {
		return repositoryReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepositoryReference_Repository() {
		return (EReference)repositoryReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMilestone() {
		return milestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_Size() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_Progress() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_TargetDate() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_Missed() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RigelFactory getRigelFactory() {
		return (RigelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		packageElementEClass = createEClass(PACKAGE_ELEMENT);
		createEReference(packageElementEClass, PACKAGE_ELEMENT__ASSOCIATIONS);

		iPackageEClass = createEClass(IPACKAGE);
		createEReference(iPackageEClass, IPACKAGE__ELEMENTS);

		packageEClass = createEClass(PACKAGE);

		participantEClass = createEClass(PARTICIPANT);
		createEReference(participantEClass, PARTICIPANT__FLOWS);

		actorEClass = createEClass(ACTOR);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__ELEMENTS);
		createEReference(flowEClass, FLOW__PARICIPANTS);
		createEAttribute(flowEClass, FLOW__TOTAL_SIZE);
		createEAttribute(flowEClass, FLOW__TOTAL_PROGRESS);

		flowElementEClass = createEClass(FLOW_ELEMENT);

		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__OUTBOUND_TRANSITIONS);
		createEReference(sourceEClass, SOURCE__OUTPUTS);

		startEClass = createEClass(START);

		targetEClass = createEClass(TARGET);
		createEReference(targetEClass, TARGET__INBOUND_TRANSITIONS);
		createEReference(targetEClass, TARGET__INPUTS);

		endEClass = createEClass(END);

		partitionEClass = createEClass(PARTITION);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__SIZE);
		createEAttribute(activityEClass, ACTIVITY__PROGRESS);

		milestoneEClass = createEClass(MILESTONE);
		createEAttribute(milestoneEClass, MILESTONE__SIZE);
		createEAttribute(milestoneEClass, MILESTONE__PROGRESS);
		createEAttribute(milestoneEClass, MILESTONE__TARGET_DATE);
		createEAttribute(milestoneEClass, MILESTONE__MISSED);

		activityReferenceEClass = createEClass(ACTIVITY_REFERENCE);
		createEReference(activityReferenceEClass, ACTIVITY_REFERENCE__ACTIVITY);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__CHILDREN);
		createEReference(resourceEClass, RESOURCE__ARTIFACTS);

		artifactEClass = createEClass(ARTIFACT);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__INPUTS);
		createEReference(transitionEClass, TRANSITION__RESULTS);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__TARGET);

		repositoryEClass = createEClass(REPOSITORY);

		repositoryReferenceEClass = createEClass(REPOSITORY_REFERENCE);
		createEReference(repositoryReferenceEClass, REPOSITORY_REFERENCE__REPOSITORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);
		EngineeringPackage theEngineeringPackage = (EngineeringPackage)EPackage.Registry.INSTANCE.getEPackage(EngineeringPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		packageElementEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		packageEClass.getESuperTypes().add(this.getPackageElement());
		packageEClass.getESuperTypes().add(theEngineeringPackage.getAbstractComponent());
		packageEClass.getESuperTypes().add(this.getIPackage());
		actorEClass.getESuperTypes().add(this.getPackageElement());
		actorEClass.getESuperTypes().add(theEngineeringPackage.getAbstractComponent());
		actorEClass.getESuperTypes().add(this.getParticipant());
		flowEClass.getESuperTypes().add(this.getPackageElement());
		flowEClass.getESuperTypes().add(theEngineeringPackage.getAbstractComponent());
		flowElementEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		sourceEClass.getESuperTypes().add(this.getFlowElement());
		startEClass.getESuperTypes().add(this.getPackageElement());
		startEClass.getESuperTypes().add(this.getSource());
		targetEClass.getESuperTypes().add(this.getFlowElement());
		endEClass.getESuperTypes().add(this.getPackageElement());
		endEClass.getESuperTypes().add(this.getTarget());
		partitionEClass.getESuperTypes().add(this.getFlow());
		partitionEClass.getESuperTypes().add(this.getFlowElement());
		activityEClass.getESuperTypes().add(this.getFlow());
		activityEClass.getESuperTypes().add(this.getSource());
		activityEClass.getESuperTypes().add(this.getTarget());
		milestoneEClass.getESuperTypes().add(this.getPackageElement());
		milestoneEClass.getESuperTypes().add(this.getSource());
		milestoneEClass.getESuperTypes().add(this.getTarget());
		activityReferenceEClass.getESuperTypes().add(this.getPackageElement());
		activityReferenceEClass.getESuperTypes().add(this.getSource());
		activityReferenceEClass.getESuperTypes().add(this.getTarget());
		resourceEClass.getESuperTypes().add(this.getPackageElement());
		resourceEClass.getESuperTypes().add(theEngineeringPackage.getAbstractComponent());
		artifactEClass.getESuperTypes().add(this.getResource());
		transitionEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		associationEClass.getESuperTypes().add(theNcorePackage.getModelElement());
		repositoryEClass.getESuperTypes().add(this.getPackageElement());
		repositoryEClass.getESuperTypes().add(this.getSource());
		repositoryEClass.getESuperTypes().add(this.getTarget());
		repositoryEClass.getESuperTypes().add(theEngineeringPackage.getAbstractComponent());
		repositoryReferenceEClass.getESuperTypes().add(this.getPackageElement());
		repositoryReferenceEClass.getESuperTypes().add(this.getSource());
		repositoryReferenceEClass.getESuperTypes().add(this.getTarget());

		// Initialize classes, features, and operations; add parameters
		initEClass(packageElementEClass, PackageElement.class, "PackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageElement_Associations(), this.getAssociation(), null, "associations", null, 0, -1, PackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iPackageEClass, IPackage.class, "IPackage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIPackage_Elements(), this.getPackageElement(), null, "elements", null, 0, -1, IPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.nasdanika.rigel.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(participantEClass, Participant.class, "Participant", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipant_Flows(), this.getFlow(), this.getFlow_Paricipants(), "flows", null, 0, -1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_Elements(), this.getFlowElement(), null, "elements", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Paricipants(), this.getParticipant(), this.getParticipant_Flows(), "paricipants", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_TotalSize(), ecorePackage.getEDouble(), "totalSize", null, 0, 1, Flow.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_TotalProgress(), ecorePackage.getEInt(), "totalProgress", null, 0, 1, Flow.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEClass, Source.class, "Source", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_OutboundTransitions(), this.getTransition(), null, "outboundTransitions", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Outputs(), this.getArtifact(), null, "outputs", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetEClass, Target.class, "Target", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTarget_InboundTransitions(), this.getTransition(), this.getTransition_Target(), "inboundTransitions", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Inputs(), this.getArtifact(), null, "inputs", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partitionEClass, Partition.class, "Partition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Size(), ecorePackage.getEDouble(), "size", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Progress(), ecorePackage.getEInt(), "progress", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMilestone_Size(), ecorePackage.getEDouble(), "size", null, 0, 1, Milestone.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_Progress(), ecorePackage.getEInt(), "progress", null, 0, 1, Milestone.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_TargetDate(), ecorePackage.getEDate(), "targetDate", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_Missed(), ecorePackage.getEBoolean(), "missed", null, 0, 1, Milestone.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(activityReferenceEClass, ActivityReference.class, "ActivityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityReference_Activity(), this.getActivity(), null, "activity", null, 0, 1, ActivityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Children(), this.getResource(), null, "children", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Target(), this.getTarget(), this.getTarget_InboundTransitions(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Inputs(), this.getArtifact(), null, "inputs", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Results(), this.getArtifact(), null, "results", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Target(), this.getPackageElement(), null, "target", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryReferenceEClass, RepositoryReference.class, "RepositoryReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepositoryReference_Repository(), this.getRepository(), null, "repository", null, 0, 1, RepositoryReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "A model of value stream where something (value) is created via a series of activities performed by participants using inputs and resources (e.g. tools) and producing outputs. \nActivities are owned by engineers who identify activity improvement opportunities as issues and resolve them to make the value stream more efficient. \n\nFor example, a development activity would have requirements as input, source code as output and IDE as a resource. \nThe activity engineer may identify an improvement opportunity \"Create a code generator\", which would reduce duration of the activity.\n"
		   });
		addAnnotation
		  (packageElementEClass,
		   source,
		   new String[] {
			   "documentation", "Model element which can be contained by a package."
		   });
		addAnnotation
		  (iPackageEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract container of package elements."
		   });
		addAnnotation
		  (getIPackage_Elements(),
		   source,
		   new String[] {
			   "documentation", "Container elements."
		   });
		addAnnotation
		  (packageEClass,
		   source,
		   new String[] {
			   "documentation", "Container of package elements. Packages are used to organize model elements into a hierarchy."
		   });
		addAnnotation
		  (getParticipant_Flows(),
		   source,
		   new String[] {
			   "documentation", "Activities in which this actor participates."
		   });
		addAnnotation
		  (actorEClass,
		   source,
		   new String[] {
			   "documentation", "Actors perform activities using resources consuming and producing artifacts."
		   });
		addAnnotation
		  (flowEClass,
		   source,
		   new String[] {
			   "documentation", "Flow is an abstract container of flow elements."
		   });
		addAnnotation
		  (getFlow_Elements(),
		   source,
		   new String[] {
			   "documentation", "Flows are composed from flow elements."
		   });
		addAnnotation
		  (getFlow_Paricipants(),
		   source,
		   new String[] {
			   "documentation", "One or more actors participate in completion of a flow."
		   });
		addAnnotation
		  (getFlow_TotalSize(),
		   source,
		   new String[] {
			   "documentation", "The sum of total sizes of this flow children plus the size of self if instance of activity."
		   });
		addAnnotation
		  (getFlow_TotalProgress(),
		   source,
		   new String[] {
			   "documentation", "Calculated total flow progress in percent. "
		   });
		addAnnotation
		  (flowElementEClass,
		   source,
		   new String[] {
			   "documentation", "Element of a (composite) activity."
		   });
		addAnnotation
		  (sourceEClass,
		   source,
		   new String[] {
			   "documentation", "Source of transitions."
		   });
		addAnnotation
		  (getSource_OutboundTransitions(),
		   source,
		   new String[] {
			   "documentation", "Outbound transitions."
		   });
		addAnnotation
		  (getSource_Outputs(),
		   source,
		   new String[] {
			   "documentation", "Artifacts output/produced by this source."
		   });
		addAnnotation
		  (startEClass,
		   source,
		   new String[] {
			   "documentation", "Start pseudo-activity."
		   });
		addAnnotation
		  (targetEClass,
		   source,
		   new String[] {
			   "documentation", "Target of transitions."
		   });
		addAnnotation
		  (getTarget_InboundTransitions(),
		   source,
		   new String[] {
			   "documentation", "Inbound transitions."
		   });
		addAnnotation
		  (getTarget_Inputs(),
		   source,
		   new String[] {
			   "documentation", "Input artifacts consumed by this target."
		   });
		addAnnotation
		  (endEClass,
		   source,
		   new String[] {
			   "documentation", "End pseudo-activity."
		   });
		addAnnotation
		  (partitionEClass,
		   source,
		   new String[] {
			   "documentation", "Partition is a grouping of flow elements associating participants and resources with the contained elements. "
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "documentation", "By performing an activity participants produce outputs from inputs using resources."
		   });
		addAnnotation
		  (getActivity_Size(),
		   source,
		   new String[] {
			   "documentation", "Activity size in some unit used by all activities. For example - hours, points, dollars."
		   });
		addAnnotation
		  (getActivity_Progress(),
		   source,
		   new String[] {
			   "documentation", "Activity progress in percent. Value between 0 and 100. Progress can be used in \"instance\" models which are used to model and track execution of an actual effort as opposed to \"template\" models which explain steps to complete an effort."
		   });
		addAnnotation
		  (milestoneEClass,
		   source,
		   new String[] {
			   "documentation", "A milestone shows an important achievement in a flow. \nThe milestones represent a sequence of events that incrementally build up until flow completion."
		   });
		addAnnotation
		  (getMilestone_Size(),
		   source,
		   new String[] {
			   "documentation", "The sum of size of all activities which need to be completed to reach this milestone from the start of the previous milestone(s)."
		   });
		addAnnotation
		  (getMilestone_Progress(),
		   source,
		   new String[] {
			   "documentation", "Calculated total progress toward achiveing the milestone in percent. "
		   });
		addAnnotation
		  (getMilestone_Missed(),
		   source,
		   new String[] {
			   "documentation", "True if target date is set, the current date is after the target date and progress is less than 100%"
		   });
		addAnnotation
		  (activityReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "References a shared activity defined elsewhere."
		   });
		addAnnotation
		  (getActivityReference_Activity(),
		   source,
		   new String[] {
			   "documentation", "By performing an activity participants produce outputs from inputs using resources."
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "Something leveraged by an actor to perform an activity. For example - a tool."
		   });
		addAnnotation
		  (getResource_Children(),
		   source,
		   new String[] {
			   "documentation", "Resource can be nested. E.g. a virtual machine may host a web server."
		   });
		addAnnotation
		  (getResource_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "Resources may host artifacts."
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "documentation", "Artifact is something output/produced by a source and consumed by a target as input. For example - source code, user guide, binary code. \nArtifacts are passed between activities over transitions.\nArtifacts can be stored in artifact repositories and be used as resources. E.g. an executable jar file or Eclipse product can be produced as an artifact by a build activity and then be used as a tool.\nAnother example is documentation."
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "documentation", "Transition from its containing source element to a target element. May pass artifacts in both directions. E.g. a transition to \"Commit code\" may take \"Source code\" as input and return \"Commit ID\" as a result."
		   });
		addAnnotation
		  (getTransition_Target(),
		   source,
		   new String[] {
			   "documentation", "Transition target."
		   });
		addAnnotation
		  (getTransition_Inputs(),
		   source,
		   new String[] {
			   "documentation", "Artifacts passed by the source to the transition and delivered to the target."
		   });
		addAnnotation
		  (getTransition_Results(),
		   source,
		   new String[] {
			   "documentation", "Artifacts returned by the target to be delivered to the source."
		   });
		addAnnotation
		  (associationEClass,
		   source,
		   new String[] {
			   "documentation", "A generic relationship between model elements."
		   });
		addAnnotation
		  (repositoryEClass,
		   source,
		   new String[] {
			   "documentation", "Repository stores artifacts. It may initiate activities when artifacts are stored to it or updated - hooks or polling."
		   });
		addAnnotation
		  (repositoryReferenceEClass,
		   source,
		   new String[] {
			   "documentation", "References a shared repository defined elsewhere."
		   });
		addAnnotation
		  (getRepositoryReference_Repository(),
		   source,
		   new String[] {
			   "documentation", "By performing an activity participants produce outputs from inputs using resources."
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (getActivityReference_Activity(),
		   source,
		   new String[] {
			   "label_ru", "\u0420\u0430\u0431\u043e\u0442\u0430",
			   "documentation_ru", "\u0412\u044b\u043f\u043e\u043b\u043d\u044f\u044f \u0440\u0430\u0431\u043e\u0442\u0443 \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u0438 \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u044f\u0442 \u0438\u0441\u0445\u043e\u0434\u044f\u0449\u0438\u0435 (\u0446\u0435\u043b\u0435\u0432\u044b\u0435) \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044f \u0432\u0445\u043e\u0434\u044f\u0449\u0438\u0435 \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b \u0438 \u0440\u0435\u0441\u0443\u0440\u0441\u044b."
		   });
		addAnnotation
		  (getRepositoryReference_Repository(),
		   source,
		   new String[] {
			   "label_ru", "\u0420\u0430\u0431\u043e\u0442\u0430",
			   "documentation_ru", "\u0412\u044b\u043f\u043e\u043b\u043d\u044f\u044f \u0440\u0430\u0431\u043e\u0442\u0443 \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u0438 \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u044f\u0442 \u0438\u0441\u0445\u043e\u0434\u044f\u0449\u0438\u0435 (\u0446\u0435\u043b\u0435\u0432\u044b\u0435) \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044f \u0432\u0445\u043e\u0434\u044f\u0449\u0438\u0435 \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b \u0438 \u0440\u0435\u0441\u0443\u0440\u0441\u044b."
		   });
	}

} //RigelPackageImpl
