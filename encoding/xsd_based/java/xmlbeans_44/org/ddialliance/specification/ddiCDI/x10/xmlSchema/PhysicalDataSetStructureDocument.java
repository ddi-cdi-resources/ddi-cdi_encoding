/*
 * An XML document type.
 * Localname: PhysicalDataSetStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PhysicalDataSetStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PhysicalDataSetStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "physicaldatasetstructure3ae0doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PhysicalDataSetStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure getPhysicalDataSetStructure();

    /**
     * Sets the "PhysicalDataSetStructure" element
     */
    void setPhysicalDataSetStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure physicalDataSetStructure);

    /**
     * Appends and returns a new empty "PhysicalDataSetStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetStructure addNewPhysicalDataSetStructure();
}
