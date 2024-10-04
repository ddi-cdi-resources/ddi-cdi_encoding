/*
 * An XML document type.
 * Localname: LogicalRecordRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LogicalRecordRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LogicalRecordRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "logicalrecordrelationship13eedoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LogicalRecordRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship getLogicalRecordRelationship();

    /**
     * Sets the "LogicalRecordRelationship" element
     */
    void setLogicalRecordRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship logicalRecordRelationship);

    /**
     * Appends and returns a new empty "LogicalRecordRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationship addNewLogicalRecordRelationship();
}
