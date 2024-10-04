/*
 * An XML document type.
 * Localname: TemporalControlConstruct
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstructDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one TemporalControlConstruct(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class TemporalControlConstructDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstructDocument {
    private static final long serialVersionUID = 1L;

    public TemporalControlConstructDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "TemporalControlConstruct"),
    };


    /**
     * Gets the "TemporalControlConstruct" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct getTemporalControlConstruct() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "TemporalControlConstruct" element
     */
    @Override
    public void setTemporalControlConstruct(org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct temporalControlConstruct) {
        generatedSetterHelperImpl(temporalControlConstruct, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TemporalControlConstruct" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct addNewTemporalControlConstruct() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.TemporalControlConstruct)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
