/**
 */
package org.nasdanika.rigel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.rigel.Activity;
import org.nasdanika.rigel.ActivityElement;
import org.nasdanika.rigel.ActivityReference;
import org.nasdanika.rigel.Actor;
import org.nasdanika.rigel.Artifact;
import org.nasdanika.rigel.Association;
import org.nasdanika.rigel.End;
import org.nasdanika.rigel.Engineer;
import org.nasdanika.rigel.EngineeredElement;
import org.nasdanika.rigel.Issue;
import org.nasdanika.rigel.IssueImportance;
import org.nasdanika.rigel.IssueStatus;
import org.nasdanika.rigel.ModelElement;
import org.nasdanika.rigel.PackageElement;
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
	private EClass modelElementEClass = null;

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
	private EClass engineeredElementEClass = null;

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
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityElementEClass = null;

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
	private EClass engineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueImportanceEEnum = null;

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
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Description() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Configuration() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
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
	public EClass getEngineeredElement() {
		return engineeredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElement_Owner() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineeredElement_Issues() {
		return (EReference)engineeredElementEClass.getEStructuralFeatures().get(1);
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
	public EReference getPackage_Elements() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
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
	public EReference getActor_Activities() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityElement() {
		return activityElementEClass;
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
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Elements() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Paricipants() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Resources() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Size() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Progress() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_TotalSize() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_TotalProgress() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(6);
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
	public EReference getArtifact_Consumers() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Producers() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_Children() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(2);
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
	public EReference getResource_Users() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Children() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Artifacts() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
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
	public EClass getEngineer() {
		return engineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Owns() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEngineer_Assignments() {
		return (EReference)engineerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Importance() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Status() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssue_AssignedTo() {
		return (EReference)issueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Size() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIssueStatus() {
		return issueStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIssueImportance() {
		return issueImportanceEEnum;
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
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__CONFIGURATION);

		packageElementEClass = createEClass(PACKAGE_ELEMENT);
		createEReference(packageElementEClass, PACKAGE_ELEMENT__ASSOCIATIONS);

		engineeredElementEClass = createEClass(ENGINEERED_ELEMENT);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__OWNER);
		createEReference(engineeredElementEClass, ENGINEERED_ELEMENT__ISSUES);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__ELEMENTS);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__ACTIVITIES);

		activityElementEClass = createEClass(ACTIVITY_ELEMENT);

		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__OUTBOUND_TRANSITIONS);
		createEReference(sourceEClass, SOURCE__OUTPUTS);

		startEClass = createEClass(START);

		targetEClass = createEClass(TARGET);
		createEReference(targetEClass, TARGET__INBOUND_TRANSITIONS);
		createEReference(targetEClass, TARGET__INPUTS);

		endEClass = createEClass(END);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__ELEMENTS);
		createEReference(activityEClass, ACTIVITY__PARICIPANTS);
		createEReference(activityEClass, ACTIVITY__RESOURCES);
		createEAttribute(activityEClass, ACTIVITY__SIZE);
		createEAttribute(activityEClass, ACTIVITY__PROGRESS);
		createEAttribute(activityEClass, ACTIVITY__TOTAL_SIZE);
		createEAttribute(activityEClass, ACTIVITY__TOTAL_PROGRESS);

		activityReferenceEClass = createEClass(ACTIVITY_REFERENCE);
		createEReference(activityReferenceEClass, ACTIVITY_REFERENCE__ACTIVITY);

		artifactEClass = createEClass(ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__CONSUMERS);
		createEReference(artifactEClass, ARTIFACT__PRODUCERS);
		createEReference(artifactEClass, ARTIFACT__CHILDREN);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__USERS);
		createEReference(resourceEClass, RESOURCE__CHILDREN);
		createEReference(resourceEClass, RESOURCE__ARTIFACTS);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__INPUTS);
		createEReference(transitionEClass, TRANSITION__RESULTS);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__TARGET);

		engineerEClass = createEClass(ENGINEER);
		createEReference(engineerEClass, ENGINEER__OWNS);
		createEReference(engineerEClass, ENGINEER__ASSIGNMENTS);

		issueEClass = createEClass(ISSUE);
		createEAttribute(issueEClass, ISSUE__IMPORTANCE);
		createEAttribute(issueEClass, ISSUE__STATUS);
		createEReference(issueEClass, ISSUE__ASSIGNED_TO);
		createEAttribute(issueEClass, ISSUE__SIZE);

		// Create enums
		issueStatusEEnum = createEEnum(ISSUE_STATUS);
		issueImportanceEEnum = createEEnum(ISSUE_IMPORTANCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		packageElementEClass.getESuperTypes().add(this.getModelElement());
		engineeredElementEClass.getESuperTypes().add(this.getPackageElement());
		packageEClass.getESuperTypes().add(this.getEngineeredElement());
		actorEClass.getESuperTypes().add(this.getEngineeredElement());
		activityElementEClass.getESuperTypes().add(this.getModelElement());
		sourceEClass.getESuperTypes().add(this.getActivityElement());
		startEClass.getESuperTypes().add(this.getSource());
		targetEClass.getESuperTypes().add(this.getActivityElement());
		endEClass.getESuperTypes().add(this.getTarget());
		activityEClass.getESuperTypes().add(this.getEngineeredElement());
		activityEClass.getESuperTypes().add(this.getSource());
		activityEClass.getESuperTypes().add(this.getTarget());
		activityReferenceEClass.getESuperTypes().add(this.getPackageElement());
		activityReferenceEClass.getESuperTypes().add(this.getSource());
		activityReferenceEClass.getESuperTypes().add(this.getTarget());
		artifactEClass.getESuperTypes().add(this.getEngineeredElement());
		resourceEClass.getESuperTypes().add(this.getEngineeredElement());
		transitionEClass.getESuperTypes().add(this.getModelElement());
		associationEClass.getESuperTypes().add(this.getModelElement());
		engineerEClass.getESuperTypes().add(this.getPackageElement());
		issueEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Configuration(), ecorePackage.getEString(), "configuration", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageElementEClass, PackageElement.class, "PackageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageElement_Associations(), this.getAssociation(), null, "associations", null, 0, -1, PackageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineeredElementEClass, EngineeredElement.class, "EngineeredElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineeredElement_Owner(), this.getEngineer(), this.getEngineer_Owns(), "owner", null, 0, 1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineeredElement_Issues(), this.getIssue(), null, "issues", null, 0, -1, EngineeredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, org.nasdanika.rigel.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Elements(), this.getPackageElement(), null, "elements", null, 0, -1, org.nasdanika.rigel.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Activities(), this.getActivity(), this.getActivity_Paricipants(), "activities", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityElementEClass, ActivityElement.class, "ActivityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceEClass, Source.class, "Source", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_OutboundTransitions(), this.getTransition(), null, "outboundTransitions", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Outputs(), this.getArtifact(), this.getArtifact_Producers(), "outputs", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetEClass, Target.class, "Target", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTarget_InboundTransitions(), this.getTransition(), this.getTransition_Target(), "inboundTransitions", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Inputs(), this.getArtifact(), this.getArtifact_Consumers(), "inputs", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Elements(), this.getActivityElement(), null, "elements", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Paricipants(), this.getActor(), this.getActor_Activities(), "paricipants", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Resources(), this.getResource(), this.getResource_Users(), "resources", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Size(), ecorePackage.getEDouble(), "size", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Progress(), ecorePackage.getEInt(), "progress", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_TotalSize(), ecorePackage.getEDouble(), "totalSize", null, 0, 1, Activity.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_TotalProgress(), ecorePackage.getEInt(), "totalProgress", null, 0, 1, Activity.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(activityReferenceEClass, ActivityReference.class, "ActivityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityReference_Activity(), this.getActivity(), null, "activity", null, 0, 1, ActivityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifact_Consumers(), this.getTarget(), this.getTarget_Inputs(), "consumers", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Producers(), this.getSource(), this.getSource_Outputs(), "producers", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Children(), this.getArtifact(), null, "children", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Users(), this.getActivity(), this.getActivity_Resources(), "users", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Children(), this.getResource(), null, "children", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Target(), this.getTarget(), this.getTarget_InboundTransitions(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Inputs(), this.getArtifact(), null, "inputs", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Results(), this.getArtifact(), null, "results", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Target(), this.getPackageElement(), null, "target", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(engineerEClass, Engineer.class, "Engineer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEngineer_Owns(), this.getEngineeredElement(), this.getEngineeredElement_Owner(), "owns", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEngineer_Assignments(), this.getIssue(), this.getIssue_AssignedTo(), "assignments", null, 0, -1, Engineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssue_Importance(), this.getIssueImportance(), "importance", "Medium", 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Status(), this.getIssueStatus(), "status", "Open", 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_AssignedTo(), this.getEngineer(), this.getEngineer_Assignments(), "assignedTo", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Size(), ecorePackage.getEDouble(), "size", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(issueStatusEEnum, IssueStatus.class, "IssueStatus");
		addEEnumLiteral(issueStatusEEnum, IssueStatus.OPEN);
		addEEnumLiteral(issueStatusEEnum, IssueStatus.IN_PROGRESS);
		addEEnumLiteral(issueStatusEEnum, IssueStatus.DONE);
		addEEnumLiteral(issueStatusEEnum, IssueStatus.CANCELLED);

		initEEnum(issueImportanceEEnum, IssueImportance.class, "IssueImportance");
		addEEnumLiteral(issueImportanceEEnum, IssueImportance.LOW);
		addEEnumLiteral(issueImportanceEEnum, IssueImportance.MEDIUM);
		addEEnumLiteral(issueImportanceEEnum, IssueImportance.HIGH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:org.nasdanika
		createUrnorgAnnotations();
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
		  (this,
		   source,
		   new String[] {
			   "label_ru", "Nasdanika.\u0420\u0438\u0433\u0435\u043b\u044c",
			   "Documentation_ru", "\u041c\u043e\u0434\u0435\u043b\u044c \u0440\u0430\u0431\u043e\u0447\u0435\u0433\u043e \u043f\u043e\u0442\u043e\u043a\u0430"
		   });
		addAnnotation
		  (modelElementEClass,
		   source,
		   new String[] {
			   "label_ru", "\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438",
			   "Documentation_ru", "\u0411\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u043b\u0430\u0441\u0441 \u0434\u043b\u044f \u0434\u0440\u0443\u0433\u0438\u0445 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u0432 \u043c\u043e\u0434\u0435\u043b\u0438"
		   });
		addAnnotation
		  (getModelElement_Name(),
		   source,
		   new String[] {
			   "label_ru", "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435",
			   "Documentation_ru", "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u043c\u043e\u0434\u0435\u043b\u0438"
		   });
		addAnnotation
		  (getModelElement_Description(),
		   source,
		   new String[] {
			   "label_ru", "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435",
			   "Documentation_ru", "\u041e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u043c\u043e\u0434\u0435\u043b\u0438 \u0441 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435\u043c \u0441\u0438\u043d\u0442\u0430\u043a\u0441\u0438\u0441\u0430 [markdown](https://en.wikipedia.org/wiki/Markdown)."
		   });
		addAnnotation
		  (getModelElement_Configuration(),
		   source,
		   new String[] {
			   "label_ru", "\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f",
			   "Documentation_ru", "*\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f* \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u0432 [YAML] (https://en.wikipedia.org/wiki/YAML). \u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f \u0437\u0430\u0432\u0438\u0441\u0438\u0442 \u043e\u0442 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u0438 \u043c\u043e\u0436\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c\u0441\u044f, \u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \u0434\u043b\u044f \u0430\u043d\u0430\u043b\u0438\u0437\u0430 \u0438\u043b\u0438 \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438 \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f."
		   });
		addAnnotation
		  (packageElementEClass,
		   source,
		   new String[] {
			   "label_ru", "\u0423\u043f\u0430\u043a\u043e\u0432\u0430\u043d\u043d\u044b\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442",
			   "Documentation_ru", "\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438, \u043a\u043e\u0442\u0440\u044b\u0439 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u0432\u043a\u043b\u044e\u0447\u0435\u043d \u0432 \u043f\u0430\u043a\u0435\u0442"
		   });
		addAnnotation
		  (engineeredElementEClass,
		   source,
		   new String[] {
			   "label_ru", "?\u0423\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u043c\u044b\u0439 \u044d\u043b\u0435\u043c\u0435\u043d\u0442",
			   "Documentation_ru", "\u0411\u0430\u0437\u043e\u0432\u044b\u0439 \u043a\u043b\u0430\u0441\u0441 \u0434\u043b\u044f \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430 \u043c\u043e\u0434\u0435\u043b\u0438, \u0432\u043b\u0430\u0434\u0435\u043b\u044c\u0446\u0435\u043c \u043a\u043e\u0442\u043e\u0440\u043e\u0433\u043e \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0438\u043d\u0436\u0435\u043d\u0435\u0440. \u041c\u043e\u0436\u0435\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0430\u0442\u044c \u043f\u0440\u043e\u0431\u043b\u0435\u043c\u043c\u044b/\u0437\u0430\u0434\u0430\u0447\u0438."
		   });
		addAnnotation
		  (getEngineeredElement_Owner(),
		   source,
		   new String[] {
			   "label_ru", "\u0418\u043d\u0436\u0435\u043d\u0435\u0440",
			   "Documentation_ru", "\u0418\u043d\u0436\u0435\u043d\u0435\u0440, \u0432\u043b\u0430\u0434\u0435\u043b\u0435\u0446 \u044d\u0442\u043e\u0433\u043e \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u0430."
		   });
		addAnnotation
		  (getEngineeredElement_Issues(),
		   source,
		   new String[] {
			   "label_ru", "\u041f\u0440\u043e\u0431\u043b\u0435\u043c\u044b",
			   "Documentation_ru", "\u041f\u0440\u043e\u0431\u043b\u0435\u043c\u044b, \u0441\u0432\u044f\u0437\u0430\u043d\u043d\u044b\u0435 \u0441 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u043e\u043c - \u043f\u0440\u043e\u0431\u043b\u0435\u043c\u044b / \u0431\u043e\u043b\u0435\u0432\u044b\u0435 \u0442\u043e\u0447\u043a\u0438, \u0432\u043e\u0437\u043c\u043e\u0436\u043d\u043e\u0441\u0442\u0438 \u0443\u043b\u0443\u0447\u0448\u0435\u043d\u0438\u044f / \u0443\u043b\u0443\u0447\u0448\u0435\u043d\u0438\u044f."
		   });
		addAnnotation
		  (packageEClass,
		   source,
		   new String[] {
			   "label_ru", "\u041f\u0430\u043a\u0435\u0442",
			   "documentation_ru", "\u041f\u0430\u043a\u0435\u0442 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u0442 \u044d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u043c\u043e\u0434\u0435\u043b\u0438."
		   });
		addAnnotation
		  (getPackage_Elements(),
		   source,
		   new String[] {
			   "label_ru", "\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u043f\u0430\u043a\u0435\u0442\u0430",
			   "documentation_ru", "\u042d\u043b\u0435\u043c\u0435\u043d\u0442\u044b \u043f\u0430\u043a\u0435\u0442\u0430"
		   });
		addAnnotation
		  (actorEClass,
		   source,
		   new String[] {
			   "label_ru", "\u0418\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c",
			   "documentation_ru", "\u041b\u0438\u0446\u043e, \u043e\u0441\u0443\u0449\u0435\u0441\u0442\u0432\u043b\u044f\u044e\u0449\u0435\u0435 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f, \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044f \u0440\u0435\u0441\u0443\u0440\u0441\u044b \u0438 \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u044f \u0430\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b"
		   });
		addAnnotation
		  (getActor_Activities(),
		   source,
		   new String[] {
			   "label_ru", "\u0414\u0435\u0439\u0441\u0442\u0432\u0438\u044f",
			   "documentation_ru", "\u0414\u0435\u0439\u0441\u0442\u0432\u0438\u044f \u0432 \u043a\u043e\u0442\u043e\u0440\u044b\u0445 \u0443\u0447\u0430\u0441\u0442\u0432\u0443\u0435\u0442 \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c"
		   });
		addAnnotation
		  (activityElementEClass,
		   source,
		   new String[] {
			   "label_ru", "\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f",
			   "documentation_ru", "\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u0441\u043b\u043e\u0436\u043d\u043e\u0433\u043e (\u0441\u043e\u0441\u0442\u0430\u0432\u043d\u043e\u0433\u043e) \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f"
		   });
		addAnnotation
		  (sourceEClass,
		   source,
		   new String[] {
			   "label_ru", "\u0418\u0441\u0442\u043e\u0447\u043d\u0438\u043a",
			   "documentation_ru", "\u0418\u0441\u0442\u043e\u0447\u043d\u0438\u043a (\u0447\u0435\u0433\u043e?) \u0422\u043e\u0447\u043a\u0430 \u0432\u0445\u043e\u0434\u0430?"
		   });
		addAnnotation
		  (getSource_OutboundTransitions(),
		   source,
		   new String[] {
			   "label_ru", "\u0418\u0441\u0445\u043e\u0434\u044f\u0449\u0438\u0435",
			   "documentation_ru", "\u0418\u0441\u0445\u043e\u0434\u044f\u0449\u0438\u0435 (\u0447\u0442\u043e?) \u0422\u043e\u0447\u043a\u0438 \u0432\u044b\u0445\u043e\u0434\u0430?"
		   });
		addAnnotation
		  (getSource_Outputs(),
		   source,
		   new String[] {
			   "label_ru", "\u0410\u0440\u0442\u0435\u0444\u0430\u043a\u0442",
			   "documentation_ru", "\u0410\u0440\u0442\u0435\u0444\u0430\u043a\u0442\u044b \u043f\u0440\u043e\u0438\u0437\u0432\u043e\u0434\u0438\u043c\u044b\u0435 \u044d\u0442\u0438\u043c \u0438\u0441\u0442\u043e\u0447\u043d\u0438\u043a\u043e\u043c"
		   });
		addAnnotation
		  (startEClass,
		   source,
		   new String[] {
			   "label_ru", "\u0421\u0442\u0430\u0440\u0442",
			   "documentation_ru", "\u0421\u0442\u0430\u0440\u0442 \u043f\u0441\u0435\u0432\u0434\u043e- \u0430\u043a\u0442\u0438\u0432\u043d\u043e\u0441\u0442\u0438"
		   });
		addAnnotation
		  (targetEClass,
		   source,
		   new String[] {
			   "label_ru", "\u0426\u0435\u043b\u044c",
			   "documentation_ru", "\u0426\u0435\u043b\u044c \u043f\u0435\u0440\u0435\u0445\u043e\u0434\u0430"
		   });
		addAnnotation
		  (endEClass,
		   source,
		   new String[] {
			   "label_ru", "\u041a\u043e\u043d\u0435\u0446",
			   "documentation_ru", "\u042d\u043b\u0435\u043c\u0435\u043d\u0442 \u0437\u0430\u0432\u0435\u0440\u0448\u0430\u044e\u0449\u0438\u0439 \u043f\u0441\u0435\u0432\u0434\u043e-\u0430\u043a\u0442\u0438\u0432\u043d\u043e\u0441\u0442\u044c"
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "label_ru", "\u0414\u0435\u0439\u0441\u0442\u0432\u0438\u0435",
			   "documentation_ru", "\u0412\u044b\u043f\u043e\u043b\u043d\u044f\u044f \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442 \u0440\u0435\u0441\u0443\u0440\u0441\u044b \u0438 \u043f\u043e\u043b\u0443\u0447\u0430\u0435\u0442 \u043d\u0435\u043a\u0438\u0439 \u0440\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442"
		   });
	}

} //RigelPackageImpl
