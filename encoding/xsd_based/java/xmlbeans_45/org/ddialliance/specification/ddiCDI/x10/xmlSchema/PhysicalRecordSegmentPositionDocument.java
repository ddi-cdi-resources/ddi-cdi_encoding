/*
 * An XML document type.
 * Localname: PhysicalRecordSegmentPosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PhysicalRecordSegmentPosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PhysicalRecordSegmentPositionDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPositionDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s5A72845450ECF4925230D9BE255DA0AE.TypeSystemHolder.typeSystem, "physicalrecordsegmentpositionf0b0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PhysicalRecordSegmentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition getPhysicalRecordSegmentPosition();

    /**
     * Sets the "PhysicalRecordSegmentPosition" element
     */
    void setPhysicalRecordSegmentPosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition physicalRecordSegmentPosition);

    /**
     * Appends and returns a new empty "PhysicalRecordSegmentPosition" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentPosition addNewPhysicalRecordSegmentPosition();
}
