/*
 * XML Type:  SpatialCoordinate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SpatialCoordinate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface SpatialCoordinate extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s65F2E4CDA8D692346164D243434CB4E1.TypeSystemHolder.typeSystem, "spatialcoordinate2088type");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "content" element
     */
    java.lang.String getContent();

    /**
     * Gets (as xml) the "content" element
     */
    org.apache.xmlbeans.XmlString xgetContent();

    /**
     * True if has "content" element
     */
    boolean isSetContent();

    /**
     * Sets the "content" element
     */
    void setContent(java.lang.String content);

    /**
     * Sets (as xml) the "content" element
     */
    void xsetContent(org.apache.xmlbeans.XmlString content);

    /**
     * Unsets the "content" element
     */
    void unsetContent();

    /**
     * Gets the "coordinateType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat.Enum getCoordinateType();

    /**
     * Gets (as xml) the "coordinateType" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat xgetCoordinateType();

    /**
     * True if has "coordinateType" element
     */
    boolean isSetCoordinateType();

    /**
     * Sets the "coordinateType" element
     */
    void setCoordinateType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat.Enum coordinateType);

    /**
     * Sets (as xml) the "coordinateType" element
     */
    void xsetCoordinateType(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PointFormat coordinateType);

    /**
     * Unsets the "coordinateType" element
     */
    void unsetCoordinateType();
}
