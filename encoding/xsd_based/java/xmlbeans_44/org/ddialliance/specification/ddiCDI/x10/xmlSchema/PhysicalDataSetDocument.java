/*
 * An XML document type.
 * Localname: PhysicalDataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PhysicalDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PhysicalDataSetDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSetDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "physicaldataset8e9ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PhysicalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet getPhysicalDataSet();

    /**
     * Sets the "PhysicalDataSet" element
     */
    void setPhysicalDataSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet physicalDataSet);

    /**
     * Appends and returns a new empty "PhysicalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalDataSet addNewPhysicalDataSet();
}
