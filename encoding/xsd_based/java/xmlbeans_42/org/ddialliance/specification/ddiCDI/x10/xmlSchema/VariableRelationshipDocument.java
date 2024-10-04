/*
 * An XML document type.
 * Localname: VariableRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one VariableRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface VariableRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "variablerelationship1842doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "VariableRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship getVariableRelationship();

    /**
     * Sets the "VariableRelationship" element
     */
    void setVariableRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship variableRelationship);

    /**
     * Appends and returns a new empty "VariableRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.VariableRelationship addNewVariableRelationship();
}
