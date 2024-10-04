/*
 * An XML document type.
 * Localname: LogicalRecord
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one LogicalRecord(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface LogicalRecordDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecordDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "logicalrecord7716doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord getLogicalRecord();

    /**
     * Sets the "LogicalRecord" element
     */
    void setLogicalRecord(org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord logicalRecord);

    /**
     * Appends and returns a new empty "LogicalRecord" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.LogicalRecord addNewLogicalRecord();
}
