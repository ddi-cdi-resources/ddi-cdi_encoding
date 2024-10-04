/*
 * An XML document type.
 * Localname: Address
 * Namespace: http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/
 * Java type: org.ddialliance.specification.ddiCDI.x10.xmlSchema.AddressDocument
 *
 * Automatically generated - do not modify.
 */
package org.ddialliance.specification.ddiCDI.x10.xmlSchema.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.XmlObject;

/**
 * A document containing one Address(@http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/) element.
 *
 * This is a complex type.
 */
public class AddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.ddialliance.specification.ddiCDI.x10.xmlSchema.AddressDocument {
    private static final long serialVersionUID = 1L;

    public AddressDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
    }

    private static final QName[] PROPERTY_QNAME = {
        new QName("http://ddialliance.org/Specification/DDI-CDI/1.0/XMLSchema/", "Address"),
    };


    /**
     * Gets the "Address" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address getAddress() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address)get_store().find_element_user(PROPERTY_QNAME[0], 0);
            return (target == null) ? null : target;
        }
    }

    /**
     * Sets the "Address" element
     */
    @Override
    public void setAddress(org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address address) {
        generatedSetterHelperImpl(address, PROPERTY_QNAME[0], 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "Address" element
     */
    @Override
    public org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address addNewAddress() {
        synchronized (monitor()) {
            check_orphaned();
            org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address target = null;
            target = (org.ddialliance.specification.ddiCDI.x10.xmlSchema.Address)get_store().add_element_user(PROPERTY_QNAME[0]);
            return target;
        }
    }
}
