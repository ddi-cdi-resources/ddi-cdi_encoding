/*
 * An XML document type.
 * Localname: SpatialCoordinate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinateDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * A document containing one SpatialCoordinate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public interface SpatialCoordinateDocument extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinateDocument> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s6094410C98087AC10701B450B7C35628.TypeSystemHolder.typeSystem, "spatialcoordinatefc78doctype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "SpatialCoordinate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate getSpatialCoordinate();

    /**
     * Sets the "SpatialCoordinate" element
     */
    void setSpatialCoordinate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate spatialCoordinate);

    /**
     * Appends and returns a new empty "SpatialCoordinate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate addNewSpatialCoordinate();
}
