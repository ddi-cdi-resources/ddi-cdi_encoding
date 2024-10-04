/*
 * An XML document type.
 * Localname: PhysicalRecordSegmentRelationship
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PhysicalRecordSegmentRelationship(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PhysicalRecordSegmentRelationshipDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationshipDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "physicalrecordsegmentrelationship4c3fdoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PhysicalRecordSegmentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship getPhysicalRecordSegmentRelationship();

    /**
     * Sets the "PhysicalRecordSegmentRelationship" element
     */
    void setPhysicalRecordSegmentRelationship(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship physicalRecordSegmentRelationship);

    /**
     * Appends and returns a new empty "PhysicalRecordSegmentRelationship" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentRelationship addNewPhysicalRecordSegmentRelationship();
}
