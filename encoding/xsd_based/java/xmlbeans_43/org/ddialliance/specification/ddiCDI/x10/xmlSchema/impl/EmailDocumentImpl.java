/*
 * An XML document type.
 * Localname: Email
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmailDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Email(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class EmailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.EmailDocument {
    private static final long serialVersionUID = 1L;

    public EmailDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Email"),
    };


    /**
     * Gets the "Email" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email getEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Email" element
     */
    @Override
    public void setEmail(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email email) {
        generatedSetterHelperImpl(email, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Email" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email addNewEmail() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Email)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
