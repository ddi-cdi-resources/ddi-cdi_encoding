/*
 * An XML document type.
 * Localname: SequencePosition
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one SequencePosition(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SequencePositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePositionDocument {
    private static final long serialVersionUID = 1L;

    public SequencePositionDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "SequencePosition"),
    };


    /**
     * Gets the "SequencePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition getSequencePosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "SequencePosition" element
     */
    @Override
    public void setSequencePosition(org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition sequencePosition) {
        generatedSetterHelperImpl(sequencePosition, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "SequencePosition" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition addNewSequencePosition() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequencePosition)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
