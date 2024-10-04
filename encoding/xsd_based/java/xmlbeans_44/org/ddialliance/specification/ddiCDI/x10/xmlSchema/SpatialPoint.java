/*
 * XML Type:  SpatialPoint
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema;

import org.apache.xmlbeans.impl.schema.ElementFactory;
import org.apache.xmlbeans.impl.schema.AbstractDocumentFactory;
import org.apache.xmlbeans.impl.schema.DocumentFactory;
import org.apache.xmlbeans.impl.schema.SimpleTypeFactory;


/**
 * An XML SpatialPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/).
 *
 * This is a complex type.
 */
public interface SpatialPoint extends org.apache.xmlbeans.XmlObject {
    DocumentFactory<org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint> Factory = new DocumentFactory<>(org.apache.xmlbeans.metadata.system.s8FD33996D15E73B19F7AD902AE837DDC.TypeSystemHolder.typeSystem, "spatialpointe74atype");
    org.apache.xmlbeans.SchemaType type = Factory.getType();


    /**
     * Gets the "xCoordinate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate getXCoordinate();

    /**
     * True if has "xCoordinate" element
     */
    boolean isSetXCoordinate();

    /**
     * Sets the "xCoordinate" element
     */
    void setXCoordinate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate xCoordinate);

    /**
     * Appends and returns a new empty "xCoordinate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate addNewXCoordinate();

    /**
     * Unsets the "xCoordinate" element
     */
    void unsetXCoordinate();

    /**
     * Gets the "yCoordinate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate getYCoordinate();

    /**
     * True if has "yCoordinate" element
     */
    boolean isSetYCoordinate();

    /**
     * Sets the "yCoordinate" element
     */
    void setYCoordinate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate yCoordinate);

    /**
     * Appends and returns a new empty "yCoordinate" element
     */
    org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate addNewYCoordinate();

    /**
     * Unsets the "yCoordinate" element
     */
    void unsetYCoordinate();
}
