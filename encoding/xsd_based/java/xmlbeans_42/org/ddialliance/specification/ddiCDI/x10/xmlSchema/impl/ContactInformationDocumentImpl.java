/*
 * An XML document type.
 * Localname: ContactInformation
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformationDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one ContactInformation(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class ContactInformationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformationDocument {
    private static final long serialVersionUID = 1L;

    public ContactInformationDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "ContactInformation"),
    };


    /**
     * Gets the "ContactInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation getContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "ContactInformation" element
     */
    @Override
    public void setContactInformation(org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation contactInformation) {
        generatedSetterHelperImpl(contactInformation, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ContactInformation" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation addNewContactInformation() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.ContactInformation)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
