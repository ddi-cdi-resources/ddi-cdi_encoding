/*
 * An XML document type.
 * Localname: PhysicalSegmentLayout
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayoutDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PhysicalSegmentLayout(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PhysicalSegmentLayoutDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayoutDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "physicalsegmentlayouta502doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PhysicalSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout getPhysicalSegmentLayout();

    /**
     * Sets the "PhysicalSegmentLayout" element
     */
    void setPhysicalSegmentLayout(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout physicalSegmentLayout);

    /**
     * Appends and returns a new empty "PhysicalSegmentLayout" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout addNewPhysicalSegmentLayout();
}
