/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Workflow model.
 * <!-- end-model-doc -->
 * @see org.nasdanika.rigel.RigelFactory
 * @model kind="package"
 *        annotation="urn:org.nasdanika label_ru='Nasdanika.\u0420\u0438\u0433\u0435\u043b\u044c' Documentation_ru='Nasdanika Rigel -  \u0438\u043d\u0441\u0442\u0440\u0443\u043c\u0435\u043d\u0442 \u043c\u043e\u0434\u0435\u043b\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u044f, \u043e\u043f\u0438\u0441\u0430\u043d\u0438\u044f \u0438 \u043a\u043e\u043d\u0442\u0440\u0430\u043b\u044f \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u044f \u0440\u0430\u0431\u043e\u0447\u0438\u0445 \u043f\u043e\u0442\u043e\u043a\u043e\u0432 \u0438 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u043e\u0432. '"
 * @generated
 */
public interface RigelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rigel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.rigel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.rigel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RigelPackage eINSTANCE = org.nasdanika.rigel.impl.RigelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.ModelElementImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__URL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONFIGURATION = 3;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.PackageElementImpl <em>Package Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.PackageElementImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getPackageElement()
	 * @generated
	 */
	int PACKAGE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__URL = MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__ASSOCIATIONS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.EngineeredElement <em>Engineered Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.EngineeredElement
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getEngineeredElement()
	 * @generated
	 */
	int ENGINEERED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__URL = PACKAGE_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__DESCRIPTION = PACKAGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__CONFIGURATION = PACKAGE_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__ASSOCIATIONS = PACKAGE_ELEMENT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__OWNER = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT__ISSUES = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Engineered Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Engineered Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEERED_ELEMENT_OPERATION_COUNT = PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.PackageImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__URL = ENGINEERED_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONFIGURATION = ENGINEERED_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ASSOCIATIONS = ENGINEERED_ELEMENT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER = ENGINEERED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ISSUES = ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENTS = ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ENGINEERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.ActorImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__URL = ENGINEERED_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONFIGURATION = ENGINEERED_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ASSOCIATIONS = ENGINEERED_ELEMENT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__OWNER = ENGINEERED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ISSUES = ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__FLOWS = ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = ENGINEERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.FlowImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__URL = ENGINEERED_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DESCRIPTION = ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONFIGURATION = ENGINEERED_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ASSOCIATIONS = ENGINEERED_ELEMENT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__OWNER = ENGINEERED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ISSUES = ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ELEMENTS = ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paricipants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__PARICIPANTS = ENGINEERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__RESOURCES = ENGINEERED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = ENGINEERED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.FlowElementImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__URL = MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.SourceImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__URL = FLOW_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DESCRIPTION = FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CONFIGURATION = FLOW_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Outbound Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__OUTBOUND_TRANSITIONS = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__OUTPUTS = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.StartImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getStart()
	 * @generated
	 */
	int START = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__URL = SOURCE__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__DESCRIPTION = SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__CONFIGURATION = SOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Outbound Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUTBOUND_TRANSITIONS = SOURCE__OUTBOUND_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__OUTPUTS = SOURCE__OUTPUTS;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.TargetImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__URL = FLOW_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__DESCRIPTION = FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CONFIGURATION = FLOW_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Inbound Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__INBOUND_TRANSITIONS = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__INPUTS = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.EndImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getEnd()
	 * @generated
	 */
	int END = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__NAME = TARGET__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__URL = TARGET__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__DESCRIPTION = TARGET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__CONFIGURATION = TARGET__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Inbound Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__INBOUND_TRANSITIONS = TARGET__INBOUND_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__INPUTS = TARGET__INPUTS;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = TARGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.PartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.PartitionImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getPartition()
	 * @generated
	 */
	int PARTITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__URL = FLOW__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__DESCRIPTION = FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__CONFIGURATION = FLOW__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ASSOCIATIONS = FLOW__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__OWNER = FLOW__OWNER;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ISSUES = FLOW__ISSUES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__ELEMENTS = FLOW__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Paricipants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__PARICIPANTS = FLOW__PARICIPANTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION__RESOURCES = FLOW__RESOURCES;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_FEATURE_COUNT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITION_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.ActivityImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__URL = FLOW__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONFIGURATION = FLOW__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ASSOCIATIONS = FLOW__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OWNER = FLOW__OWNER;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ISSUES = FLOW__ISSUES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ELEMENTS = FLOW__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Paricipants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PARICIPANTS = FLOW__PARICIPANTS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCES = FLOW__RESOURCES;

	/**
	 * The feature id for the '<em><b>Outbound Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTBOUND_TRANSITIONS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUTS = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inbound Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INBOUND_TRANSITIONS = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SIZE = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROGRESS = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Total Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TOTAL_SIZE = FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Total Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TOTAL_PROGRESS = FLOW_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = FLOW_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.ActivityReferenceImpl <em>Activity Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.ActivityReferenceImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getActivityReference()
	 * @generated
	 */
	int ACTIVITY_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__URL = PACKAGE_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__DESCRIPTION = PACKAGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__CONFIGURATION = PACKAGE_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__ASSOCIATIONS = PACKAGE_ELEMENT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Outbound Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__OUTBOUND_TRANSITIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__OUTPUTS = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inbound Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__INBOUND_TRANSITIONS = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__INPUTS = PACKAGE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE__ACTIVITY = PACKAGE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_REFERENCE_OPERATION_COUNT = PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.ArtifactImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__URL = ENGINEERED_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONFIGURATION = ENGINEERED_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ASSOCIATIONS = ENGINEERED_ELEMENT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__OWNER = ENGINEERED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ISSUES = ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Consumers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CONSUMERS = ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Producers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PRODUCERS = ENGINEERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CHILDREN = ENGINEERED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = ENGINEERED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.ResourceImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = ENGINEERED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__URL = ENGINEERED_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = ENGINEERED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONFIGURATION = ENGINEERED_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ASSOCIATIONS = ENGINEERED_ELEMENT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OWNER = ENGINEERED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ISSUES = ENGINEERED_ELEMENT__ISSUES;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__USERS = ENGINEERED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CHILDREN = ENGINEERED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ARTIFACTS = ENGINEERED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ENGINEERED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = ENGINEERED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.TransitionImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__URL = MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUTS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__RESULTS = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.AssociationImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__URL = MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.EngineerImpl <em>Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.EngineerImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getEngineer()
	 * @generated
	 */
	int ENGINEER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__NAME = PACKAGE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__URL = PACKAGE_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__DESCRIPTION = PACKAGE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__CONFIGURATION = PACKAGE_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ASSOCIATIONS = PACKAGE_ELEMENT__ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__OWNS = PACKAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER__ASSIGNMENTS = PACKAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_FEATURE_COUNT = PACKAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINEER_OPERATION_COUNT = PACKAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.impl.IssueImpl
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__URL = MODEL_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CONFIGURATION = MODEL_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__IMPORTANCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNED_TO = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SIZE = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Benefit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__BENEFIT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CHILDREN = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__IMPLEMENTATION = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.IssueStatus <em>Issue Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.IssueStatus
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getIssueStatus()
	 * @generated
	 */
	int ISSUE_STATUS = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.rigel.IssueImportance <em>Issue Importance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.rigel.IssueImportance
	 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getIssueImportance()
	 * @generated
	 */
	int ISSUE_IMPORTANCE = 21;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.rigel.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.rigel.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.ModelElement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.rigel.ModelElement#getUrl()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.rigel.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.ModelElement#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see org.nasdanika.rigel.ModelElement#getConfiguration()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Configuration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.PackageElement <em>Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Element</em>'.
	 * @see org.nasdanika.rigel.PackageElement
	 * @generated
	 */
	EClass getPackageElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.rigel.PackageElement#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see org.nasdanika.rigel.PackageElement#getAssociations()
	 * @see #getPackageElement()
	 * @generated
	 */
	EReference getPackageElement_Associations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.EngineeredElement <em>Engineered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineered Element</em>'.
	 * @see org.nasdanika.rigel.EngineeredElement
	 * @generated
	 */
	EClass getEngineeredElement();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.rigel.EngineeredElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.nasdanika.rigel.EngineeredElement#getOwner()
	 * @see #getEngineeredElement()
	 * @generated
	 */
	EReference getEngineeredElement_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.rigel.EngineeredElement#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see org.nasdanika.rigel.EngineeredElement#getIssues()
	 * @see #getEngineeredElement()
	 * @generated
	 */
	EReference getEngineeredElement_Issues();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see org.nasdanika.rigel.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.rigel.Package#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.rigel.Package#getElements()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Elements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.nasdanika.rigel.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Actor#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flows</em>'.
	 * @see org.nasdanika.rigel.Actor#getFlows()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Flows();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.nasdanika.rigel.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.rigel.Flow#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.nasdanika.rigel.Flow#getElements()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Elements();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Flow#getParicipants <em>Paricipants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paricipants</em>'.
	 * @see org.nasdanika.rigel.Flow#getParicipants()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Paricipants();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Flow#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.nasdanika.rigel.Flow#getResources()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see org.nasdanika.rigel.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.nasdanika.rigel.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.rigel.Source#getOutboundTransitions <em>Outbound Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outbound Transitions</em>'.
	 * @see org.nasdanika.rigel.Source#getOutboundTransitions()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_OutboundTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Source#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see org.nasdanika.rigel.Source#getOutputs()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Outputs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see org.nasdanika.rigel.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see org.nasdanika.rigel.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Target#getInboundTransitions <em>Inbound Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound Transitions</em>'.
	 * @see org.nasdanika.rigel.Target#getInboundTransitions()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_InboundTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Target#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see org.nasdanika.rigel.Target#getInputs()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Inputs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see org.nasdanika.rigel.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see org.nasdanika.rigel.Partition
	 * @generated
	 */
	EClass getPartition();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.nasdanika.rigel.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.Activity#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.rigel.Activity#getSize()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.Activity#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see org.nasdanika.rigel.Activity#getProgress()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Progress();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.Activity#getTotalSize <em>Total Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Size</em>'.
	 * @see org.nasdanika.rigel.Activity#getTotalSize()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_TotalSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.Activity#getTotalProgress <em>Total Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Progress</em>'.
	 * @see org.nasdanika.rigel.Activity#getTotalProgress()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_TotalProgress();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.ActivityReference <em>Activity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Reference</em>'.
	 * @see org.nasdanika.rigel.ActivityReference
	 * @generated
	 */
	EClass getActivityReference();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.rigel.ActivityReference#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.nasdanika.rigel.ActivityReference#getActivity()
	 * @see #getActivityReference()
	 * @generated
	 */
	EReference getActivityReference_Activity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.nasdanika.rigel.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Artifact#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consumers</em>'.
	 * @see org.nasdanika.rigel.Artifact#getConsumers()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Consumers();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Artifact#getProducers <em>Producers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Producers</em>'.
	 * @see org.nasdanika.rigel.Artifact#getProducers()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Producers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.rigel.Artifact#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.rigel.Artifact#getChildren()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.rigel.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Resource#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see org.nasdanika.rigel.Resource#getUsers()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.rigel.Resource#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.rigel.Resource#getChildren()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.rigel.Resource#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.nasdanika.rigel.Resource#getArtifacts()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Artifacts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.nasdanika.rigel.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.rigel.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.rigel.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Transition#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see org.nasdanika.rigel.Transition#getInputs()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Transition#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see org.nasdanika.rigel.Transition#getResults()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Results();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.nasdanika.rigel.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.rigel.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.rigel.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Engineer <em>Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engineer</em>'.
	 * @see org.nasdanika.rigel.Engineer
	 * @generated
	 */
	EClass getEngineer();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Engineer#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns</em>'.
	 * @see org.nasdanika.rigel.Engineer#getOwns()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Owns();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.rigel.Engineer#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignments</em>'.
	 * @see org.nasdanika.rigel.Engineer#getAssignments()
	 * @see #getEngineer()
	 * @generated
	 */
	EReference getEngineer_Assignments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.rigel.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see org.nasdanika.rigel.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.Issue#getImportance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance</em>'.
	 * @see org.nasdanika.rigel.Issue#getImportance()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Importance();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.rigel.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Status();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.rigel.Issue#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned To</em>'.
	 * @see org.nasdanika.rigel.Issue#getAssignedTo()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_AssignedTo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.Issue#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.rigel.Issue#getSize()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.rigel.Issue#getBenefit <em>Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Benefit</em>'.
	 * @see org.nasdanika.rigel.Issue#getBenefit()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Benefit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.rigel.Issue#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.rigel.Issue#getChildren()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Children();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.rigel.Issue#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see org.nasdanika.rigel.Issue#getImplementation()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Implementation();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.rigel.IssueStatus <em>Issue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Status</em>'.
	 * @see org.nasdanika.rigel.IssueStatus
	 * @generated
	 */
	EEnum getIssueStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.rigel.IssueImportance <em>Issue Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Importance</em>'.
	 * @see org.nasdanika.rigel.IssueImportance
	 * @generated
	 */
	EEnum getIssueImportance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RigelFactory getRigelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.ModelElementImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__URL = eINSTANCE.getModelElement_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__CONFIGURATION = eINSTANCE.getModelElement_Configuration();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.PackageElementImpl <em>Package Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.PackageElementImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getPackageElement()
		 * @generated
		 */
		EClass PACKAGE_ELEMENT = eINSTANCE.getPackageElement();

		/**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_ELEMENT__ASSOCIATIONS = eINSTANCE.getPackageElement_Associations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.EngineeredElement <em>Engineered Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.EngineeredElement
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getEngineeredElement()
		 * @generated
		 */
		EClass ENGINEERED_ELEMENT = eINSTANCE.getEngineeredElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERED_ELEMENT__OWNER = eINSTANCE.getEngineeredElement_Owner();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEERED_ELEMENT__ISSUES = eINSTANCE.getEngineeredElement_Issues();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.PackageImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.ActorImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__FLOWS = eINSTANCE.getActor_Flows();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.FlowImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ELEMENTS = eINSTANCE.getFlow_Elements();

		/**
		 * The meta object literal for the '<em><b>Paricipants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__PARICIPANTS = eINSTANCE.getFlow_Paricipants();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__RESOURCES = eINSTANCE.getFlow_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.FlowElementImpl <em>Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.FlowElementImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.SourceImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Outbound Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__OUTBOUND_TRANSITIONS = eINSTANCE.getSource_OutboundTransitions();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__OUTPUTS = eINSTANCE.getSource_Outputs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.StartImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.TargetImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Inbound Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__INBOUND_TRANSITIONS = eINSTANCE.getTarget_InboundTransitions();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__INPUTS = eINSTANCE.getTarget_Inputs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.EndImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.PartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.PartitionImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getPartition()
		 * @generated
		 */
		EClass PARTITION = eINSTANCE.getPartition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.ActivityImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__SIZE = eINSTANCE.getActivity_Size();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__PROGRESS = eINSTANCE.getActivity_Progress();

		/**
		 * The meta object literal for the '<em><b>Total Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TOTAL_SIZE = eINSTANCE.getActivity_TotalSize();

		/**
		 * The meta object literal for the '<em><b>Total Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TOTAL_PROGRESS = eINSTANCE.getActivity_TotalProgress();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.ActivityReferenceImpl <em>Activity Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.ActivityReferenceImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getActivityReference()
		 * @generated
		 */
		EClass ACTIVITY_REFERENCE = eINSTANCE.getActivityReference();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_REFERENCE__ACTIVITY = eINSTANCE.getActivityReference_Activity();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.ArtifactImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Consumers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CONSUMERS = eINSTANCE.getArtifact_Consumers();

		/**
		 * The meta object literal for the '<em><b>Producers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__PRODUCERS = eINSTANCE.getArtifact_Producers();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CHILDREN = eINSTANCE.getArtifact_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.ResourceImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__USERS = eINSTANCE.getResource_Users();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CHILDREN = eINSTANCE.getResource_Children();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__ARTIFACTS = eINSTANCE.getResource_Artifacts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.TransitionImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INPUTS = eINSTANCE.getTransition_Inputs();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__RESULTS = eINSTANCE.getTransition_Results();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.AssociationImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.EngineerImpl <em>Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.EngineerImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getEngineer()
		 * @generated
		 */
		EClass ENGINEER = eINSTANCE.getEngineer();

		/**
		 * The meta object literal for the '<em><b>Owns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__OWNS = eINSTANCE.getEngineer_Owns();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINEER__ASSIGNMENTS = eINSTANCE.getEngineer_Assignments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.impl.IssueImpl
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__IMPORTANCE = eINSTANCE.getIssue_Importance();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ASSIGNED_TO = eINSTANCE.getIssue_AssignedTo();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SIZE = eINSTANCE.getIssue_Size();

		/**
		 * The meta object literal for the '<em><b>Benefit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__BENEFIT = eINSTANCE.getIssue_Benefit();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CHILDREN = eINSTANCE.getIssue_Children();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__IMPLEMENTATION = eINSTANCE.getIssue_Implementation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.IssueStatus <em>Issue Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.IssueStatus
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getIssueStatus()
		 * @generated
		 */
		EEnum ISSUE_STATUS = eINSTANCE.getIssueStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.rigel.IssueImportance <em>Issue Importance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.rigel.IssueImportance
		 * @see org.nasdanika.rigel.impl.RigelPackageImpl#getIssueImportance()
		 * @generated
		 */
		EEnum ISSUE_IMPORTANCE = eINSTANCE.getIssueImportance();

	}

} //RigelPackage
