/*
 * An XML document type.
 * Localname: SpatialCoordinate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinateDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SpatialCoordinate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SpatialCoordinateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinateDocument {
    private static final long serialVersionUID = 1L;

    public SpatialCoordinateDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SpatialCoordinate"),
    };


    /**
     * Gets the "SpatialCoordinate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate getSpatialCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SpatialCoordinate" element
     */
    @Override
    public void setSpatialCoordinate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate spatialCoordinate) {
        generatedSetterHelperImpl(spatialCoordinate, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SpatialCoordinate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate addNewSpatialCoordinate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialCoordinate)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
