/*
 * An XML document type.
 * Localname: PhysicalSegmentLayout
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayoutDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one PhysicalSegmentLayout(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class PhysicalSegmentLayoutDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayoutDocument {
    private static final long serialVersionUID = 1L;

    public PhysicalSegmentLayoutDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "PhysicalSegmentLayout"),
    };


    /**
     * Gets the "PhysicalSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout getPhysicalSegmentLayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "PhysicalSegmentLayout" element
     */
    @Override
    public void setPhysicalSegmentLayout(org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout physicalSegmentLayout) {
        generatedSetterHelperImpl(physicalSegmentLayout, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "PhysicalSegmentLayout" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout addNewPhysicalSegmentLayout() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.PhysicalSegmentLayout)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
