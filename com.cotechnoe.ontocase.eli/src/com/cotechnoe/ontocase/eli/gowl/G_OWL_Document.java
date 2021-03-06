/**
 * (c) 2020 Cotechnoe http://www.cotechnoe.com
 */
package com.cotechnoe.ontocase.eli.gowl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GOWL Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getG_relations <em>Grelations</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getG_prefix <em>Gprefix</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getBaseIRI <em>Base IRI</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getGroupOfEntities <em>Group Of Entities</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getGroupOfRelations <em>Group Of Relations</em>}</li>
 *   <li>{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getG_entities <em>Gentities</em>}</li>
 * </ul>
 *
 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Document()
 * @model
 * @generated
 */
public interface G_OWL_Document extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Text\t(c) 2020 Cotechnoe http://www.cotechnoe.com";

	/**
	 * Returns the value of the '<em><b>Grelations</b></em>' containment reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.G_Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grelations</em>' containment reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Document_G_relations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<G_Relation> getG_relations();

	/**
	 * Returns the value of the '<em><b>Gprefix</b></em>' containment reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.G_Prefix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gprefix</em>' containment reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Document_G_prefix()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<G_Prefix> getG_prefix();

	/**
	 * Returns the value of the '<em><b>Base IRI</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base IRI</em>' reference.
	 * @see #setBaseIRI(IRI)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Document_BaseIRI()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IRI getBaseIRI();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getBaseIRI <em>Base IRI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base IRI</em>' reference.
	 * @see #getBaseIRI()
	 * @generated
	 */
	void setBaseIRI(IRI value);

	/**
	 * Returns the value of the '<em><b>Group Of Entities</b></em>' containment reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.Entities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Of Entities</em>' containment reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Document_GroupOfEntities()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Entities> getGroupOfEntities();

	/**
	 * Returns the value of the '<em><b>Group Of Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Of Relations</em>' containment reference.
	 * @see #setGroupOfRelations(Relations)
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Document_GroupOfRelations()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Relations getGroupOfRelations();

	/**
	 * Sets the value of the '{@link com.cotechnoe.ontocase.eli.gowl.G_OWL_Document#getGroupOfRelations <em>Group Of Relations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Of Relations</em>' containment reference.
	 * @see #getGroupOfRelations()
	 * @generated
	 */
	void setGroupOfRelations(Relations value);

	/**
	 * Returns the value of the '<em><b>Gentities</b></em>' containment reference list.
	 * The list contents are of type {@link com.cotechnoe.ontocase.eli.gowl.G_Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gentities</em>' containment reference list.
	 * @see com.cotechnoe.ontocase.eli.gowl.GowlPackage#getG_OWL_Document_G_entities()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<G_Entity> getG_entities();

} // G_OWL_Document
