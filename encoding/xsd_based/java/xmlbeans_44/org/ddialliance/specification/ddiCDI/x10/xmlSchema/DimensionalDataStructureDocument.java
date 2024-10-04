/*
 * An XML document type.
 * Localname: DimensionalDataStructure
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DimensionalDataStructure(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DimensionalDataStructureDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructureDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "dimensionaldatastructuredb46doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionalDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure getDimensionalDataStructure();

    /**
     * Sets the "DimensionalDataStructure" element
     */
    void setDimensionalDataStructure(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure dimensionalDataStructure);

    /**
     * Appends and returns a new empty "DimensionalDataStructure" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionalDataStructure addNewDimensionalDataStructure();
}
