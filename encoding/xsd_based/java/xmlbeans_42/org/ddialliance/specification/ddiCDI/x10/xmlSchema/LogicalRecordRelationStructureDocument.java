/*
 * An XML document type.
 * Localname: LogicalRecordRelationStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LogicalRecordRelationStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LogicalRecordRelationStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "logicalrecordrelationstructure6eebdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LogicalRecordRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure getLogicalRecordRelationStructure();

    /**
     * Sets the "LogicalRecordRelationStructure" element
     */
    void setLogicalRecordRelationStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure logicalRecordRelationStructure);

    /**
     * Appends and returns a new empty "LogicalRecordRelationStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordRelationStructure addNewLogicalRecordRelationStructure();
}
