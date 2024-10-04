/*
 * An XML document type.
 * Localname: SegmentByText
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByTextDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SegmentByText(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SegmentByTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByTextDocument {
    private static final long serialVersionUID = 1L;

    public SegmentByTextDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SegmentByText"),
    };


    /**
     * Gets the "SegmentByText" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText getSegmentByText() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SegmentByText" element
     */
    @Override
    public void setSegmentByText(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText segmentByText) {
        generatedSetterHelperImpl(segmentByText, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SegmentByText" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText addNewSegmentByText() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SegmentByText)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
