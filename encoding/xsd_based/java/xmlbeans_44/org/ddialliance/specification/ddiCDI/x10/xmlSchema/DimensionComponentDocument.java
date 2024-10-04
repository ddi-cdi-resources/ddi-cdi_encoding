/*
 * An XML document type.
 * Localname: DimensionComponent
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponentDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DimensionComponent(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DimensionComponentDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponentDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "dimensioncomponent3b65doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent getDimensionComponent();

    /**
     * Sets the "DimensionComponent" element
     */
    void setDimensionComponent(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent dimensionComponent);

    /**
     * Appends and returns a new empty "DimensionComponent" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionComponent addNewDimensionComponent();
}
