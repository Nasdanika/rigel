/**
 */
package org.nasdanika.rigel;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.engineering.EngineeredElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Flow is an abstract container of flow elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.rigel.Flow#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Flow#getParicipants <em>Paricipants</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Flow#getTotalSize <em>Total Size</em>}</li>
 *   <li>{@link org.nasdanika.rigel.Flow#getTotalProgress <em>Total Progress</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.rigel.RigelPackage#getFlow()
 * @model abstract="true"
 * @generated
 */
public interface Flow extends PackageElement, EngineeredElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flows are composed from flow elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getFlow_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getElements();

	/**
	 * Returns the value of the '<em><b>Paricipants</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.rigel.Participant}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.rigel.Participant#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more actors participate in completion of a flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paricipants</em>' reference list.
	 * @see org.nasdanika.rigel.RigelPackage#getFlow_Paricipants()
	 * @see org.nasdanika.rigel.Participant#getFlows
	 * @model opposite="flows"
	 *        annotation="urn:org.nasdanika label_ru='\u0423\u0447\u0430\u0441\u0442\u043d\u0438\u043a\u0438' documentation_ru='\u041e\u0434\u0438\u043d \u0438\u043b\u0438 \u0431\u043e\u043b\u0435\u0435 \u0438\u0441\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u0435\u0439, \u0443\u0447\u0430\u0441\u0442\u0432\u0443\u044e\u0449\u0438\u0445 \u0432 \u0432\u044b\u043f\u043e\u043b\u043d\u0435\u043d\u0438\u0438 \u0440\u0430\u0431\u043e\u0442\u044b.'"
	 * @generated
	 */
	EList<Participant> getParicipants();

	/**
	 * Returns the value of the '<em><b>Total Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sum of total sizes of this flow children plus the size of self if instance of activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Size</em>' attribute.
	 * @see org.nasdanika.rigel.RigelPackage#getFlow_TotalSize()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double getTotalSize();

	/**
	 * Returns the value of the '<em><b>Total Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calculated total flow progress in percent. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Progress</em>' attribute.
	 * @see org.nasdanika.rigel.RigelPackage#getFlow_TotalProgress()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	int getTotalProgress();

} // Flow
