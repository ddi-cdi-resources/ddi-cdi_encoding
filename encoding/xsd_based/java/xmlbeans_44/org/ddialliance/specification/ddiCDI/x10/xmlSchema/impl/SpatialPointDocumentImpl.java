/*
 * An XML document type.
 * Localname: SpatialPoint
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SpatialPoint(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SpatialPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPointDocument {
    private static final long serialVersionUID = 1L;

    public SpatialPointDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SpatialPoint"),
    };


    /**
     * Gets the "SpatialPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint getSpatialPoint() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SpatialPoint" element
     */
    @Override
    public void setSpatialPoint(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint spatialPoint) {
        generatedSetterHelperImpl(spatialPoint, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SpatialPoint" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint addNewSpatialPoint() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SpatialPoint)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
