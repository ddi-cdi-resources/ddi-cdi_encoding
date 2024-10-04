/*
 * An XML document type.
 * Localname: NonIsoDate
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one NonIsoDate(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class NonIsoDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDateDocument {
    private static final long serialVersionUID = 1L;

    public NonIsoDateDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "NonIsoDate"),
    };


    /**
     * Gets the "NonIsoDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate getNonIsoDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "NonIsoDate" element
     */
    @Override
    public void setNonIsoDate(org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate nonIsoDate) {
        generatedSetterHelperImpl(nonIsoDate, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "NonIsoDate" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate addNewNonIsoDate() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.NonIsoDate)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
