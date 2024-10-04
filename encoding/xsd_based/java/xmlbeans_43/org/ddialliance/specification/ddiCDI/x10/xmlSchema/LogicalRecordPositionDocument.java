/*
 * An XML document type.
 * Localname: LogicalRecordPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LogicalRecordPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LogicalRecordPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "logicalrecordpositione7dfdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LogicalRecordPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition getLogicalRecordPosition();

    /**
     * Sets the "LogicalRecordPosition" element
     */
    void setLogicalRecordPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition logicalRecordPosition);

    /**
     * Appends and returns a new empty "LogicalRecordPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordPosition addNewLogicalRecordPosition();
}
