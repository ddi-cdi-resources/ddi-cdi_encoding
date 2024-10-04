/*
 * An XML document type.
 * Localname: SpatialPoint
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SpatialPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SpatialPointDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPointDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "spatialpoint555adoctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SpatialPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint getSpatialPoint();

    /**
     * Sets the "SpatialPoint" element
     */
    void setSpatialPoint(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint spatialPoint);

    /**
     * Appends and returns a new empty "SpatialPoint" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint addNewSpatialPoint();
}
