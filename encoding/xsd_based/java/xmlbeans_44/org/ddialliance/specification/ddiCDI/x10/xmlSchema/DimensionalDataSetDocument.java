/*
 * An XML document type.
 * Localname: DimensionalDataSet
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DimensionalDataSet(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DimensionalDataSetDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSetDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "dimensionaldataset3835doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet getDimensionalDataSet();

    /**
     * Sets the "DimensionalDataSet" element
     */
    void setDimensionalDataSet(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet dimensionalDataSet);

    /**
     * Appends and returns a new empty "DimensionalDataSet" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataSet addNewDimensionalDataSet();
}
