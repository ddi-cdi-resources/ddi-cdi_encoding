/*
 * An XML document type.
 * Localname: Sequence
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Sequence(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class SequenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.SequenceDocument {
    private static final long serialVersionUID = 1L;

    public SequenceDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Sequence"),
    };


    /**
     * Gets the "Sequence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence getSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Sequence" element
     */
    @Override
    public void setSequence(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence sequence) {
        generatedSetterHelperImpl(sequence, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Sequence" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence addNewSequence() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Sequence)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
