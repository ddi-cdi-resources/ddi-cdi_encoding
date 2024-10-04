/*
 * An XML document type.
 * Localname: PhysicalSegmentLocation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one PhysicalSegmentLocation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface PhysicalSegmentLocationDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocationDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "physicalsegmentlocation7a4ddoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "PhysicalSegmentLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation getPhysicalSegmentLocation();

    /**
     * Sets the "PhysicalSegmentLocation" element
     */
    void setPhysicalSegmentLocation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation physicalSegmentLocation);

    /**
     * Appends and returns a new empty "PhysicalSegmentLocation" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLocation addNewPhysicalSegmentLocation();
}
