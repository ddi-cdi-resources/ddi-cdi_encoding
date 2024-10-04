/*
 * An XML document type.
 * Localname: DimensionGroup
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one DimensionGroup(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface DimensionGroupDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroupDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "dimensiongroup9767doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "DimensionGroup" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup getDimensionGroup();

    /**
     * Sets the "DimensionGroup" element
     */
    void setDimensionGroup(org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup dimensionGroup);

    /**
     * Appends and returns a new empty "DimensionGroup" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.DimensionGroup addNewDimensionGroup();
}
