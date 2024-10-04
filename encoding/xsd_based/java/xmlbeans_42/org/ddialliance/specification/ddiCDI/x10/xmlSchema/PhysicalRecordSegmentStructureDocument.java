/*
 * An XML document type.
 * Localname: PhysicalRecordSegmentStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PhysicalRecordSegmentStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PhysicalRecordSegmentStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "physicalrecordsegmentstructuredbd6doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PhysicalRecordSegmentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure getPhysicalRecordSegmentStructure();

    /**
     * Sets the "PhysicalRecordSegmentStructure" element
     */
    void setPhysicalRecordSegmentStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure physicalRecordSegmentStructure);

    /**
     * Appends and returns a new empty "PhysicalRecordSegmentStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalRecordSegmentStructure addNewPhysicalRecordSegmentStructure();
}
