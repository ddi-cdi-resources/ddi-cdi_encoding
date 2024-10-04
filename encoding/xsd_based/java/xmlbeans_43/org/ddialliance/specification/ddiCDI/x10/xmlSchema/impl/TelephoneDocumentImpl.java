/*
 * An XML document type.
 * Localname: Telephone
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.TelephoneDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Telephone(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class TelephoneDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.TelephoneDocument {
    private static final long serialVersionUID = 1L;

    public TelephoneDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Telephone"),
    };


    /**
     * Gets the "Telephone" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone getTelephone() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Telephone" element
     */
    @Override
    public void setTelephone(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone telephone) {
        generatedSetterHelperImpl(telephone, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Telephone" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone addNewTelephone() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Telephone)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
